package com.algorithms;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UniqueSubsetsTest {
	
	    @Test
	    void testUniqueSubsets() {
	        int[] arr3 = {5};
	        List<List<Integer>> expectedResult3 = Arrays.asList(Arrays.asList(), Arrays.asList(5));
	        List<List<Integer>> actualResult3 = UniqueSubsets.findUniqueSubsets(arr3);
	        assertThat(actualResult3).isEqualTo(expectedResult3);
	    }
}
    