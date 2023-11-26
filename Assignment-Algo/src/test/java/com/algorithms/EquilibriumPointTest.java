package com.algorithms;
//27-Equilibrium Point
 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquilibriumPointTest {

    @Test
    public void testEquilibriumPointFound() {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int expectedIndex = 3;
        int actualIndex = EquilibriumPoint.findEquilibrium(arr);

        assertEquals(expectedIndex, actualIndex, "Equilibrium point not found at the expected index");
    }

    @Test
    public void testNoEquilibriumPointFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int expectedIndex = -1;
        int actualIndex = EquilibriumPoint.findEquilibrium(arr);

        assertEquals(expectedIndex, actualIndex, "Equilibrium point found incorrectly");
    }
}
