package com.greenfox;

import com.greenfox.model.HeartBeat;
import com.greenfox.repository.HeartBeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Resize2Application implements CommandLineRunner {

	@Autowired
	HeartBeatRepository heartBeatRepository;

	public static void main(String[] args) {
		SpringApplication.run(Resize2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HeartBeat heartBeat = new HeartBeat(true);
		heartBeat.setStatus(false);
		heartBeatRepository.save(heartBeat);

	}
}
