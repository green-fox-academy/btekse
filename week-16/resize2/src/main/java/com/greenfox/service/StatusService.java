package com.greenfox.service;

import com.greenfox.model.HeartBeat;
import com.greenfox.model.HeartBeatStatus;
import com.greenfox.repository.HeartBeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

  private final HeartBeatRepository heartBeatRepository;

  @Autowired
  public StatusService(HeartBeatRepository heartBeatRepository) {
    this.heartBeatRepository = heartBeatRepository;
  }

  public HeartBeatStatus returnStatusBasedOnRepository() {

    HeartBeatStatus heartBeatStatus = new HeartBeatStatus();
    if (heartBeatRepository.count() == 0) {
      heartBeatStatus.setDatabase("error");
    } else {
      heartBeatStatus.setDatabase("ok");
    }
    return heartBeatStatus;
  }
}
