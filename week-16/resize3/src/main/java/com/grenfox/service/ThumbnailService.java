package com.grenfox.service;

import com.grenfox.model.ThumbnailAttributes;
import com.grenfox.model.ThumbnailAttributesDTO;
import com.grenfox.repository.ThumbnailAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ThumbnailService {
  ThumbnailAttributesRepository thumbnailAttributesRepository;
  private final static String HOSTNAMEURL = "https://your-hostname.com/media/images/";


  @Autowired
  public ThumbnailService(ThumbnailAttributesRepository thumbnailAttributesRepository) {
    this.thumbnailAttributesRepository = thumbnailAttributesRepository;
  }

  public ThumbnailAttributesDTO saveThumbnailAttributes(boolean isMain, long hotelId, long thumbnailId) {
    ThumbnailAttributes toSave = thumbnailAttributesRepository.findOne(thumbnailId);
    toSave.setType("thumbnail");
    toSave.setIs_main(isMain);
    toSave.setCreatedAt((LocalDateTime.now().toString()));
    toSave.setUploaded(false);
    toSave.setContentUrl(this.generateContentUrl(thumbnailId));
    toSave.setHotel(hotelId);
    thumbnailAttributesRepository.save(toSave);
    return this.createThumbnailDto(toSave);
  }

  public String generateContentUrl(long thumbnailId) {
    return HOSTNAMEURL + thumbnailId + "/content";
  }


  public ThumbnailAttributesDTO createThumbnailDto(ThumbnailAttributes thumbnailAttributes) {
    ThumbnailAttributesDTO toReturn = new ThumbnailAttributesDTO();
    toReturn.setIs_main(thumbnailAttributes.isIs_main());
    toReturn.setContentUrl(thumbnailAttributes.setContentUrl());
    toReturn.setCreatedAt(thumbnailAttributes.setCreatedAt());
    toReturn.setUploaded(thumbnailAttributes.isUploaded());
    return toReturn;
  }

//  public ThumbnailAttributes setThumbnailAttributesFields(ThumbnailAttributes thumbnailAttributes) {
//    ThumbnailAttributes thumbnailAttributes = new ThumbnailAttributes();
//    thumbnailAttributesRepository.save(thumbnailAttributes);
//
//  }
}

