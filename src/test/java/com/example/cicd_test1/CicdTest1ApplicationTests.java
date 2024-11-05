package com.example.cicd_test1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CicdTest1ApplicationTests {

	@Test
	void contextLoads() {
	}


//	@Test
//	void alwaysPassTest() {
//		// 항상 true 조건을 검사하므로 무조건 통과하는 테스트
//		assertTrue(true);
//	}


	@Test
	void alwaysFailTest() {
		// 항상 false 조건을 검사하므로 무조건 실패하는 테스트
		assertTrue(false);
	}



}
