package com.grenfox.repository;

import com.grenfox.model.GeolocationAttributes;
import com.grenfox.model.ThumbnailAttributes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeolocationAttributesRepository extends CrudRepository<GeolocationAttributes, Long> {
  public GeolocationAttributes findFirstByOrderByIdDesc();
}
