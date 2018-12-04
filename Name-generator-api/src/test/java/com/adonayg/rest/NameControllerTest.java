package com.adonayg.rest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.adonayg.service.NameService;

public class NameControllerTest {

	@InjectMocks
	private NameController controller;

	@Mock
	private NameService service;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void NameControllerATest() {
		when(service.generateName(3)).thenReturn(TestConstants.TEST_STRING);
		String generatedName = controller.generateName(3);
		assertEquals(TestConstants.TEST_STRING ,generatedName);
	}
}
