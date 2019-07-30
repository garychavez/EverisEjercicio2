package com.microservicioa.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SubjectsTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void findAll()throws Exception{
		this.mvc.perform(get("/Subjects"))
		.andExpect(status().isOk())
		.andExpect(content()
		.contentType("application/json;charset=utf-8"));
	}
	
	@Test
	public void findById()throws Exception{
		this.mvc.perform(get("/Subjects/1"))
		.andExpect(status().isOk());
	}
	
	
}
