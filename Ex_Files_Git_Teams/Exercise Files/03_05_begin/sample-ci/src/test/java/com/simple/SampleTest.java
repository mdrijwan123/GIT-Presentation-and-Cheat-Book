package com.simple;

import static org.junit.Assert.*;

import org.junit.Test;

import com.simple.example.Sample;

public class SampleTest {

	@Test
	public void test() {
		assertEquals("AB",Sample.concat("A", "B"));
	}

}
