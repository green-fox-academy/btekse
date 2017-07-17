package com.greenfox.repository;

import com.greenfox.model.thumbnail.ThumbnailData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThumbnailDataRepository extends CrudRepository<ThumbnailData, Long> {
}
