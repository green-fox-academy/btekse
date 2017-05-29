package com.greenfox.controller;

import com.greenfox.model.Receiver;
import com.greenfox.model.StatusError;
import com.greenfox.model.StatusOk;
import com.greenfox.repository.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
public class ReceiveController {
StatusOk statusOk = new StatusOk();
  StatusError statusError = new StatusError();

  public static final String link = System.getenv("CHAT_APP_PEER_ADDRESSS") + "/api/message/receive";
  public static final String myClient = System.getenv("CHAT_APP_UNIQUE_ID");
  RestTemplate restTemplate = new RestTemplate();

  @Autowired
  MessagesRepository messagesRepository;

  @CrossOrigin("*")
  @RequestMapping(value = "/api/message/receive", method = RequestMethod.POST)
  public Object receivedMessage (@RequestBody Receiver newReceiver) {
    if (newReceiver.getMessage().getUsername().isEmpty()) {
      return statusError;
    } else if(!newReceiver.getClient().getId().equals(myClient)) {
      messagesRepository.save(newReceiver.getMessage());
      restTemplate.postForObject(link, newReceiver, StatusOk.class);
    }
    return statusOk; //? :
  }
}
