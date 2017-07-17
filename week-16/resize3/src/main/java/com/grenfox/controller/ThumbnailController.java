package com.grenfox.controller;

import com.grenfox.model.incoming.IncomingThumbnailDataMap;
import com.grenfox.model.ThumbnailAttributes;
import com.grenfox.model.response.ResponseThumbnail;
import com.grenfox.service.ThumbnailService;
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
  public ResponseThumbnail thumbnailAttributes(@PathVariable(name = "id") Long id, @RequestBody IncomingThumbnailDataMap incomingThumbnailDataMap) {
    return thumbnailService.createResponse(incomingThumbnailDataMap.getData().getAttributes().isIs_main(), id);
  }
}
