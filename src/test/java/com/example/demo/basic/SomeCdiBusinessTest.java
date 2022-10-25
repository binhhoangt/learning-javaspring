package com.example.demo.basic;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.springbasics.DemoBasicApplication;
import com.example.demo.springbasics.basic.BinarySearchImpl;
import com.example.demo.springbasics.cdi.SomeCdiBusiness;
import com.example.demo.springbasics.cdi.SomeCdiDao;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	// Inject Mock
	@InjectMocks
	SomeCdiBusiness business;

	// Create Mock
	@Mock
	SomeCdiDao daoMock;

	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
		// check if the value is correct
		assertEquals(4, business.findGreatest());
	}
}