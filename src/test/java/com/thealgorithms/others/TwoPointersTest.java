package com.thealgorithms.others;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TwoPointersTest {

    @Test
    void twoPointersFirstTestCase() {
        int[] arr = {2, 6, 9, 22, 121};
        int key = 28;
        assertTrue(TwoPointers.isPairedSum(arr, key));
    }

    @Test
    void twoPointersSecondTestCase() {
        int[] arr = {-1, -12, 12, 0, 8};
        int key = 0;
        assertTrue(TwoPointers.isPairedSum(arr, key));
    }

    @Test
    void twoPointersThirdTestCase() {
        int[] arr = {12, 35, 12, 152, 0};
        int key = 13;
        assertFalse(TwoPointers.isPairedSum(arr, key));
    }

    @Test
    void twoPointersFourthTestCase() {
        int[] arr = {-2, 5, -1, 52, 31};
        int key = -3;
        assertTrue(TwoPointers.isPairedSum(arr, key));
    }

    @Test
    void twoPointersFiftiethTestCase() {
        int[] arr = {25, 1, 0, 61, 21};
        int key = 12;
        assertFalse(TwoPointers.isPairedSum(arr, key));
    }
}
