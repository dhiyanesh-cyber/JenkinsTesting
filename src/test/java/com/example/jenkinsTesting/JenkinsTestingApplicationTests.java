package com.example.jenkinsTesting.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class JenkinsTestingApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHelloEndpoint() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/hello")
						.accept(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
	}
}
