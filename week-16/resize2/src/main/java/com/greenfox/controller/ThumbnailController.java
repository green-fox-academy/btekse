package com.greenfox.controller;

import com.greenfox.model.thumbnail.Thumbnail;
import com.greenfox.model.thumbnail.ThumbnailData;
import com.greenfox.service.ThumbnailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThumbnailController {

  @Autowired
  ThumbnailService thumbnailService;

  @PostMapping("/hotels/{id}/thumbnails")
  public Thumbnail returnThumbnail(@PathVariable(name = "id") Long id, @RequestBody ThumbnailData thumbnailData) {
    return thumbnailService.setThumbnail(id, thumbnailData);
  }
}
