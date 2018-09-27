package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(10, Calc.sum(5, 5));
		assertEquals(50, Calc.sum(30, 20));
		assertEquals(20, Calc.sum(15, 5));
	}

}
