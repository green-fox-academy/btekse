package com.greenfox.repository;

import com.greenfox.model.thumbnail.ThumbnailLinks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThumbnailLinksRepository extends CrudRepository<ThumbnailLinks, Long> {
}
