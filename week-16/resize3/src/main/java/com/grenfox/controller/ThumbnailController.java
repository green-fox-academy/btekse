package com.grenfox.controller;

import com.grenfox.model.IncomingThumbnailDataMap;
import com.grenfox.model.ThumbnailAttributes;
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
  public ThumbnailAttributes thumbnailAttributes(@PathVariable(name = "id") Long id, @RequestBody IncomingThumbnailDataMap incomingThumbnailDataMap) {
    return thumbnailService.setThumbnailAttributesFields(incomingThumbnailDataMap.getData().getAttributes().getIs_main(), id)
}
