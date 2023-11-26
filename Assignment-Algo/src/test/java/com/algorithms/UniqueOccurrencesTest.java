package com.algorithms;
import static org.junit.jupiter.api.Assertions.assertEquals;

//21- Unique Number of Occurrences
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class UniqueOccurrencesTest {

	@Test()
	public void UniqueOccurrencesT(){
		
		 int[] arr1 = {1, 1, 2, 5, 5};
		 boolean expectedResult=UniqueOccurrences.isuniqueOccurrences(arr1);
		 assertEquals(false, expectedResult);
	}
}
