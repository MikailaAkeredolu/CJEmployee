package com.example.bitcoinapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class BitcoinappApplication {
	private static final Logger log = LoggerFactory.getLogger(BitcoinappApplication.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public static void main(String[] args) {
		SpringApplication.run(BitcoinappApplication.class, args);
	}

	@Scheduled(fixedRate = 35000)
	public void runEveryThreeSeconds() {
		RestTemplate restTemplate = new RestTemplate();
		BitApp bitApp = restTemplate.getForObject("https://api.cryptonator.com/api/full/btc-usd", BitApp.class);
		log.info("The time is now {}", dateFormat.format(new Date()));
		log.info(bitApp.toString());
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run() throws Exception{
		return args -> runEveryThreeSeconds();
	}

}
