package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class StringUtilControllerTest {

	@Test
	public void testReverseString() {
		String reversed = StringUtilController.reverseString("test");
		assertEquals("tset", reversed);
	}

	@Test
	public void test() {
		List<String> spyList = Mockito.spy(ArrayList.class);
		List<String> mockList = Mockito.mock(ArrayList.class);

		assertEquals(0, spyList.size());
		Mockito.doReturn(100).when(spyList).size();
		assertEquals(100, spyList.size());

		assertEquals(0, mockList.size());
		Mockito.doReturn(10).when(mockList).size();
		assertEquals(10, mockList.size());

		System.out.println(spyList.size());
		System.out.println(mockList.size());
	}

	@Test
	public void mockTest() {
		List mockedList = Mockito.mock(ArrayList.class);
		mockedList.add("one");
		Mockito.verify(mockedList).add("one");
		assertEquals(0, mockedList.size());
		System.out.println(mockedList.size());
	}

	@Test
	public void spyTest() {
		List spyList = Mockito.spy(ArrayList.class);
		spyList.add("one");
		Mockito.verify(spyList).add("one");
		assertEquals(1, spyList.size());
		System.out.println(spyList.size());
	}
}
