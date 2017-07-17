package com.greenfox.repository;

import com.greenfox.model.thumbnail.ThumbnailAttributes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThumbnailAttributesRepository extends CrudRepository<ThumbnailAttributes, Long> {
}
