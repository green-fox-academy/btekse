package com.greenfox.repository;

import com.greenfox.model.HeartBeat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeartBeatRepository extends CrudRepository<HeartBeat, Long> {
}
