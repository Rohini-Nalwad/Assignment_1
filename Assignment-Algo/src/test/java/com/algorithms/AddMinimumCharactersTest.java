package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//24- Add Minimum Characters

public class AddMinimumCharactersTest {
	@Test
	public void minimumChar(){
		assertEquals(5,  AddMinimumCharacters.addMinChar("ABCDCD"));
	}

}