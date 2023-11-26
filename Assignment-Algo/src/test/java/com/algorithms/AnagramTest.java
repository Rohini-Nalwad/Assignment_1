package com.algorithms;
//15- Anagram of String
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

	 @Test
	    void testAreAnagramsForAnagrams() {
	        String str1 = "listen";
	        String str2 = "silent";
	        assertTrue(Anagram.areAnagrams(str1, str2));
	    }
}