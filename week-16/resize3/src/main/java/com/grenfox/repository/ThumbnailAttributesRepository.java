package com.grenfox.repository;

import com.grenfox.model.ThumbnailAttributes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThumbnailAttributesRepository extends CrudRepository<ThumbnailAttributes, Long> {
  public ThumbnailAttributes findFirstByOrderByIdDesc();
}
