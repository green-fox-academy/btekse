package com.grenfox.service;

import com.grenfox.model.ThumbnailAttributes;
import com.grenfox.model.response.ResponseThumbnail;
import com.grenfox.model.response.ResponseThumbnailAttributesData;
import com.grenfox.model.response.ResponseThumbnailDataMap;
import com.grenfox.model.response.ResponseThumbnailLinksMap;
import com.grenfox.repository.ThumbnailAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class ThumbnailService {
  ThumbnailAttributesRepository thumbnailAttributesRepository;
  private final static String HOSTNAMEURL = "https://your-hostname.com/media/images/";


  @Autowired
  public ThumbnailService(ThumbnailAttributesRepository thumbnailAttributesRepository) {
    this.thumbnailAttributesRepository = thumbnailAttributesRepository;
  }

  public ResponseThumbnail createResponse(boolean isMain, long hotelId) {
    ResponseThumbnail responseThumbnail = new ResponseThumbnail();
    thumbnailAttributesRepository.save(new ThumbnailAttributes(hotelId, isMain));

    ThumbnailAttributes thumbnailAttribute = thumbnailAttributesRepository.findFirstByOrderByIdDesc();
    thumbnailAttribute.setContentUrl("https://your-hostname.com/media/images/" + thumbnailAttribute.getId() + "/content");
    thumbnailAttribute.setUploaded(false);
    thumbnailAttribute.setCreatedAt(LocalDateTime.now().toString());
    thumbnailAttribute.setType("thumbnails");
    thumbnailAttributesRepository.save(thumbnailAttribute);

    responseThumbnail.setLinks(new ResponseThumbnailLinksMap("https://your-hostname.com/hotels/" + hotelId + "/thumbnails/" + thumbnailAttribute.getId()));

    ResponseThumbnailAttributesData responseThumbnailAttributesData = new ResponseThumbnailAttributesData();
    responseThumbnailAttributesData.setIs_main(isMain);
    responseThumbnailAttributesData.setUploaded(false);
    responseThumbnailAttributesData.setCreated_at(thumbnailAttribute.getCreatedAt());
    responseThumbnailAttributesData.setContent_url(thumbnailAttribute.getContentUrl());

    ResponseThumbnailDataMap responseThumbnailDataMap = new ResponseThumbnailDataMap();
    responseThumbnailDataMap.setType(thumbnailAttribute.getType());
    responseThumbnailDataMap.setId(thumbnailAttribute.getId());
    responseThumbnailDataMap.setAttributes(responseThumbnailAttributesData);

    responseThumbnail.setData(responseThumbnailDataMap);
    return responseThumbnail;


  }


}

