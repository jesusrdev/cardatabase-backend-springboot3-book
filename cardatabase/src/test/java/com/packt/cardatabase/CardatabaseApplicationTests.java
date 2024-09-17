package com.packt.cardatabase;

import com.packt.cardatabase.web.CarController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CardatabaseApplicationTests {
	@Autowired
	private CarController carController;

	@Test
	@DisplayName("First example test case")
	void contextLoads() {
		Assertions.assertThat(carController).isNotNull();
	}

}
