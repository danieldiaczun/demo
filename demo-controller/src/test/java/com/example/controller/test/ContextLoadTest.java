package com.example.controller.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource({"classpath:application-test.properties", "classpath:sql-server.properties"})
//@TestPropertySource({"classpath:application-test.properties", "classpath:h2.properties"})
public class ContextLoadTest {

	@Test
	public void contextLoads() {
	}
}
