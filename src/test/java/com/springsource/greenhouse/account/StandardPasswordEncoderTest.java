package com.springsource.greenhouse.account;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StandardPasswordEncoderTest {

	StandardPasswordEncoder passwordEncoder = new StandardPasswordEncoder("SHA-256", "secret");

	@Test
	public void encodePassword() {
		String encodedPassword = passwordEncoder.encode("melbourne");
		System.out.println(encodedPassword);
		encodedPassword = passwordEncoder.encode("plano");
		System.out.println(encodedPassword);
		encodedPassword = passwordEncoder.encode("atlanta");
		System.out.println(encodedPassword);
		encodedPassword = passwordEncoder.encode("churchkeys");
		System.out.println(encodedPassword);
		encodedPassword = passwordEncoder.encode("boston");
		System.out.println(encodedPassword);
		encodedPassword = passwordEncoder.encode("melbourne");
		System.out.println(encodedPassword);
		assertTrue(passwordEncoder.matches("melbourne", encodedPassword));
	}
	
	
}
