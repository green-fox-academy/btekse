package com.greenfox.controllers;

import com.amazonaws.auth.PropertiesFileCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3EncryptionClient;
import com.amazonaws.services.s3.model.*;
import com.greenfox.model.Note;
import com.greenfox.repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import static java.awt.SystemColor.text;

@Controller
public class NoteController {


  @RequestMapping(method = RequestMethod.POST, value = "/upload")
  public String handleFileUpload(@RequestParam("name") String name,
                      @RequestParam("file") MultipartFile file,
                      RedirectAttributes redirectAttributes) {
    AmazonS3 s3client = new AmazonS3Client(new PropertiesFileCredentialsProvider());

    String bucketName = "hotelbookingproject";
    s3client.createBucket(bucketName);

    try {
      InputStream ls = file.getInputStream();
      s3client.putObject(new PutObjectRequest(bucketName, name, ls, new ObjectMetadata()).withCannedAcl(CannedAccessControlList.PublicRead));

      S3Object s3Object = s3client.getObject(new GetObjectRequest(
        bucketName, name));

      redirectAttributes.addAttribute("picUrl", s3Object.getObjectContent().getHttpRequest().getURI().toString());
      System.out.println(s3Object.getObjectContent().getHttpRequest().getURI().toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "redirect:/upload";
  }
}
