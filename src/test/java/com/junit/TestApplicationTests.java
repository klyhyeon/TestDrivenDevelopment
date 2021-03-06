package com.junit;


import com.junit.domain.Car1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class TestApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private Car1 car;

	//Integration test
	@Test
	public void getCar_returnsCarDetails() throws Exception {
		//arrange

		//act
		ResponseEntity<Car1> response = restTemplate
				.getForEntity("/cars/prius", Car1.class);

		//assert
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody().getName()).isEqualTo("prius");
		assertThat(response.getBody().getType()).isEqualTo("hybrid");
	}

}
