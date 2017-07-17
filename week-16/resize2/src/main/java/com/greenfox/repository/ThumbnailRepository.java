package com.greenfox.repository;

import com.greenfox.model.thumbnail.Thumbnail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThumbnailRepository extends CrudRepository<Thumbnail, Long> {
}
