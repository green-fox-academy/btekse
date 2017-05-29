package com.greenfox.controller;

import com.greenfox.model.*;
import com.greenfox.repository.MessagesRepository;
import com.greenfox.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

  private static String link = System.getenv("CHAT_APP_PEER_ADDRESSS") + "/api/message/receive";
  private RestTemplate restTemplate = new RestTemplate();
  private String missingText = "";

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private MessagesRepository messagesRepository;

  @RequestMapping(value = "/")
  public String index(Model model) {
    fillModel(model);
    return userRepository.count() == 0 ? "redirect:/enter" : "index";
  }

  @RequestMapping(value = "/update")
  public String update(@RequestParam("name") String name) {
    User user = userRepository.findOne((long) 1);
    user.setName(name);
    userRepository.save(user);
    return "redirect:/";
  }

  @RequestMapping(value = "/message")
  public String sendMessage(Model model, @RequestParam("message") String message) {
    missingText = "";
    Message newMessage = new Message(userRepository.findOne((long) 1).getName()); //setText ide!!!
    newMessage.setText(message);
    if (newMessage.getText().isEmpty()) {
      missingText = "Text field is empty.";
      return "redirect:/";
    } else { //kiszervezni service-be...???, 1 soros return?
      messagesRepository.save(newMessage);

      Receiver newReceiver = new Receiver();
      newReceiver.setMessage(newMessage);

      Client newClient = new Client();
      newReceiver.setClient(newClient);

      restTemplate.postForObject(link, newReceiver, StatusOk.class);

      return "redirect:/";
    }
  }
  @ModelAttribute //fillModel nélkül mi történik???
  public void fillModel(Model model) {
    if (userRepository.count() != 0) {
      model.addAttribute("user", userRepository.findOne((long) 1).getName());
      model.addAttribute("messages", messagesRepository.findAll());
      model.addAttribute("messagereposize", messagesRepository.count());
      if (!missingText.isEmpty()) {
        model.addAttribute("texterror", missingText);
      }
    }
  }
}
