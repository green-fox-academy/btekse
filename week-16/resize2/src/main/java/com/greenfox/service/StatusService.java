package com.greenfox.service;

import com.greenfox.model.HeartBeat;
import com.greenfox.model.HeartBeatStatus;
import com.greenfox.repository.HeartBeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

  private final HeartBeatRepository heartBeatRepository;
  private HeartBeatStatus heartBeatStatus;

  @Autowired
  public StatusService(HeartBeatRepository heartBeatRepository, HeartBeatStatus heartBeatStatus) {
    this.heartBeatRepository = heartBeatRepository;
    this.heartBeatStatus = heartBeatStatus;
  }

  public HeartBeatStatus returnStatusBasedOnRepository() {
    if (heartBeatRepository.count() == 0) {
      heartBeatStatus.setDatabase("error");
    } else {
      heartBeatStatus.setDatabase("ok");
    }
    return heartBeatStatus;
  }
}
