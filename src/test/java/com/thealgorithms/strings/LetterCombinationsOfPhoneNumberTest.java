package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void letterCombinationsOfPhoneNumber() {
        LetterCombinationsOfPhoneNumber.generateNumberToCharMap();

        // ** Test 1 **
        // Input: digits = ""
        // Output: []
        int[] numbers1 = {};
        List<String> output1 = Arrays.asList("");
        assertTrue(LetterCombinationsOfPhoneNumber.printWords(numbers1, numbers1.length, 0, "").equals(output1));

        // ** Test 2 **
        // Input: digits = "2"
        // Output: ["a","b","c"]
        int[] numbers2 = {2};
        List<String> output2 = Arrays.asList("a", "b", "c");
        assertTrue(LetterCombinationsOfPhoneNumber.printWords(numbers2, numbers2.length, 0, "").equals(output2));

        // ** Test 3 **
        // Input: digits = "23"
        // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        int[] numbers3 = {2, 3};
        List<String> output3 = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertTrue(LetterCombinationsOfPhoneNumber.printWords(numbers3, numbers3.length, 0, "").equals(output3));

        // ** Test 4 **
        // Input: digits = "234"
        // Output: ["adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi",
        // "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh",
        // "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"]
        int[] numbers4 = {2, 3, 4};
        List<String> output4 = Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi");
        assertTrue(LetterCombinationsOfPhoneNumber.printWords(numbers4, numbers4.length, 0, "").equals(output4));
    }
}
