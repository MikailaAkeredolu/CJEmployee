package com.example.demoweatherapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootApplication
public class ADemoweatherappApplication {

	private static final Logger log = LoggerFactory.getLogger(ADemoweatherappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ADemoweatherappApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			try {
				Weather weather = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys", Weather.class);
				log.info(weather.toString());
			}
			catch (Exception e){
				e.printStackTrace();
				e.getMessage();
			}
		};


	}


}

	/*
	private static final String URL = "http://query.yahooapis.com/v1/public/yql";

	public String callYahooWeatherApi() {

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
				.queryParam("q", "select wind from weather.forecast where woeid=2460286")
				.queryParam("format", "json");

		HttpEntity<?> entity = new HttpEntity<>(headers);

		HttpEntity<String> response = restTemplate.exchange(
				builder.build().encode().toUri(),
				HttpMethod.GET,
				entity,
				String.class);

		return response.getBody();

	}
*/


//RestTemplate restTemplate = new RestTemplate();
//		return restTemplate.getForObject("http://weather.yahooapis.com/forecastrss?w=" + woeid + "&u=c", Weather.class);
//	}
//
//	@Scheduled(fixedDelay=60000)
//	@CacheEvict(value="weather", allEntries=true)
//	public void evict() {
//		System.out.println("cache evicted");
//	}
//}