package com.jokes;

import com.jokes.service.JokesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@SpringBootTest
class JokesServiceApplicationTests {

	JokesService jokesService;

	@BeforeEach
	void startUp() {
		jokesService = new JokesService();
	}

	@Test
	void checkStringIfInputStreamNotEmpty() throws IOException {
		String given = "String";
		String actual = jokesService.getStringFromInputStream(new ByteArrayInputStream(given.getBytes()));
		Assertions.assertEquals(given, actual);
	}

	@Test
	void checkExceptionIfInputStreamIsNull() throws IOException {
		Assertions.assertThrows(NullPointerException.class, () -> jokesService.getStringFromInputStream(null));
	}

}
