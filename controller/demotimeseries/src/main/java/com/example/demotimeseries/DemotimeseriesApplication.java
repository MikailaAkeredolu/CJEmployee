package com.example.demotimeseries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class DemotimeseriesApplication {
	private static final Logger log = LoggerFactory.getLogger(DemotimeseriesApplication.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public static void main(String[] args) {

		SpringApplication.run(DemotimeseriesApplication.class, args);
	}
	@Scheduled(fixedRate = 100000)
	public void runEveryThreeSeconds() {
		RestTemplate restTemplate = new RestTemplate();
		Stock stock = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=1min&apikey=demo", Stock.class);
		log.info("The time is now {}", dateFormat.format(new Date()));
		log.info(stock.toString());
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
