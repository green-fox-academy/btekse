package com.greenfox.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.greenfox.model.thumbnail.Thumbnail;
import com.greenfox.model.thumbnail.ThumbnailAttributes;
import com.greenfox.model.thumbnail.ThumbnailData;
import com.greenfox.model.thumbnail.ThumbnailLinks;
import com.greenfox.repository.ThumbnailAttributesRepository;
import com.greenfox.repository.ThumbnailDataRepository;
import com.greenfox.repository.ThumbnailLinksRepository;
import com.greenfox.repository.ThumbnailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ThumbnailService {
  ThumbnailDataRepository thumbnailDataRepository;
  ThumbnailAttributesRepository thumbnailAttributesRepository;
  ThumbnailLinksRepository thumbnailLinksRepository;
  ThumbnailRepository thumbnailRepository;

  @Autowired
  public ThumbnailService(ThumbnailDataRepository thumbnailDataRepository, ThumbnailAttributesRepository thumbnailAttributesRepository, ThumbnailLinksRepository thumbnailLinksRepository, ThumbnailRepository thumbnailRepository) {
    this.thumbnailDataRepository = thumbnailDataRepository;
    this.thumbnailAttributesRepository = thumbnailAttributesRepository;
    this.thumbnailLinksRepository = thumbnailLinksRepository;
    this.thumbnailRepository = thumbnailRepository;
  }

  public ThumbnailAttributes setThumbnailAttributesFields(ThumbnailData thumbnailData) {
    ThumbnailAttributes thumbnailAttributes = new ThumbnailAttributes();
    thumbnailAttributesRepository.save(thumbnailAttributes);
//    thumbnailAttributes.setIs_main(true);
    System.out.println("---------------------------------------------------------");
    System.out.println(thumbnailData.getAttributes());
    System.out.println("---------------------------------------------------------");
//    thumbnailAttributes.setIs_main(thumbnailData.getAttributes().isIs_main());
    thumbnailAttributes.setUploaded(false);
    Timestamp ts = Timestamp.valueOf(LocalDateTime.now());
    thumbnailAttributes.setCreated_at(ts);
    thumbnailAttributes.setContent_url("https://your-hostname.com/media/images/" + thumbnailAttributes.getId() + "/content");
    thumbnailAttributesRepository.save(thumbnailAttributes);
    return thumbnailAttributes;
  }

  public ThumbnailData setThumbnailData(ThumbnailData thumbnailData) {
    ThumbnailData newThumbnailData = new ThumbnailData();
    thumbnailDataRepository.save(newThumbnailData);
    newThumbnailData.setType(thumbnailData.getType());
    newThumbnailData.setAttributes(setThumbnailAttributesFields(thumbnailData));
    thumbnailDataRepository.save(newThumbnailData);
    return newThumbnailData;
  }

  public ThumbnailLinks setThumbnailLinks(long id) {
    ThumbnailLinks thumbnailLinks = new ThumbnailLinks();
    thumbnailLinksRepository.save(thumbnailLinks);
    thumbnailLinks.setSelf("https://your-hostname.com/hotels/" + id + "/thumbnails/" + thumbnailLinks.getId());
    thumbnailLinksRepository.save(thumbnailLinks);
    return thumbnailLinks;
  }


  public Thumbnail setThumbnail(long id, ThumbnailData thumbnailData) {
    Thumbnail thumbnail = new Thumbnail();
    System.out.println("**********************************************************************************************");
    System.out.println(thumbnailData.getAttributes());
    System.out.println("**********************************************************************************************");
    thumbnailRepository.save(thumbnail);
    thumbnail.setLinks(setThumbnailLinks(id));
    thumbnail.setData(setThumbnailData(thumbnailData));
    thumbnailRepository.save(thumbnail);
    return thumbnail;
  }
}
