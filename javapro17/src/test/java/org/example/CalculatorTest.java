package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        int a = 2;
        int b = 3;
        int expected = 5;
        Assertions.assertEquals(expected, new Calculator().add(a, b));
    }

    @Test
    void subtractTest() {
        int a = 6;
        int b = 3;
        int expected = 3;
        Assertions.assertEquals(expected, new Calculator().subtract(a, b));
    }

    @Test
    void multiplyTest() {
        int a = 2;
        int b = 4;
        int expected = 8;
        Assertions.assertEquals(expected, new Calculator().multiply(a, b));
    }

    @Test
    void dividePositiveTest() {
        double a = 10;
        double b = 10;
        double expected = 1;
        Assertions.assertEquals(expected, new Calculator().divide(10, 10));
    }

    @Test
    @DisplayName("Test idet ne tuda")
    void divideByZeroTest() {
        double a = 10;
        double b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> new Calculator().divide(a, b));
    }

    @Test
    void powerPositiveTest() {
        double a = 2;
        double b = 4;
        double expected = 16;
        Assertions.assertEquals(expected, new Calculator().power(a, b));
    }

    @Test
    void powerZeroPowerTest() {
        double a = 123;
        double b = 0;
        double expected = 1;
        Assertions.assertEquals(expected, new Calculator().power(a, b));
    }

    @Test
    void powerZeroPowerZeroTest() {
        double a = 0;
        double b = 0;
        double expected = 1;
        Assertions.assertEquals(expected, new Calculator().power(a, b));
    }

    @Test
    void powerNegativePowTest() {
        double a = 2;
        double b = -2;
        double expected = 0.25;
        Assertions.assertEquals(expected, new Calculator().power(a, b));
    }

    @Test
    void powerFractionalPowTest() {
        double a = 81;
        double b = 0.5;
        double expected = 9;
        Assertions.assertEquals(expected, new Calculator().power(a, b));
    }

    @Test
    void factorialPositiveTest() {
        int a = 4;
        long expected = 24;
        Assertions.assertEquals(expected, new Calculator().factorial(a));
    }

    @Test
    void factorialZeroTest() {
        int a = 0;
        long expected = 1;
        Assertions.assertEquals(expected, new Calculator().factorial(a));
    }

    @Test
    void factorialNegativeTest() {
        int a = -4;
        long expected = 24;
        Assertions.assertEquals(expected, new Calculator().factorial(a));
    }

    @Test
    void isEvenPositiveTest() {
        int a = 5;
        boolean expected = false;
        Assertions.assertEquals(expected, new Calculator().isEven(a));
    }

    @Test
    void isEvenZeroCaseTest() {
        int a = 0;
        boolean expected = true;
        Assertions.assertEquals(expected, new Calculator().isEven(a));
    }

    @Test
    void isEvenNegativeTest() {
        int a = -4;
        boolean expected = true;
        Assertions.assertEquals(expected, new Calculator().isEven(a));
    }

    @Test
    void findMaxNormalCondition() {
        int[] ints = {1, 2, 3, 4, 5, 8, 0, 6, 9};
        int expected = 9;
        Assertions.assertEquals(expected, new Calculator().findMax(ints));
    }

    @Test
    void findMaxEmptyArray() {
        int expected = 0;
        Assertions.assertEquals(expected, new Calculator().findMax(null));
    }

    @Test
    void isPrimePositiveTest() {
        boolean expected = true;
        int num = 11;
        Assertions.assertEquals(expected, new Calculator().isPrime(num));
    }

    @Test
    void isPrimeNonNaturalNumTest() {
        boolean expected = false;
        int num = -1;
        Assertions.assertEquals(expected, new Calculator().isPrime(num));
    }

    @Test
    void toBaseStringPositiveTest() {
        int num = 16;
        int base = 10;
        String expected = "16";
        Assertions.assertEquals(expected, new Calculator().toBaseString(num, base));
    }

    @Test
    void toBaseStringPositiveOtherRadixTest() {
        int num = 15;
        int base = 16;
        String expected = "f";
        Assertions.assertEquals(expected, new Calculator().toBaseString(num, base));
    }

    @Test
    void toBaseStringBaseLessTest() {
        int num = 15;
        int base = 1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Calculator().toBaseString(num, base));
    }

    @Test
    void toBaseStringBaseBiggerRadixTest() {
        int num = 15;
        int base = 17;
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Calculator().toBaseString(num, base));
    }

    @Test
    void sqrtPositiveTest() {
        int num = 9;
        double expected = 3;
        Assertions.assertEquals(expected, new Calculator().sqrt(num));
    }

    @Test
    void sqrtNegativeTest() {
        int num = -9;
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Calculator().sqrt(num));
    }

    @Test
    void sqrtZeroTest() {
        int num = 0;
        double expected = 0;
        Assertions.assertEquals(expected, new Calculator().sqrt(num));
    }

    @Test
    void reverseStringPositiveTest() {
        String string = "tarara";
        String revString = "ararat";
        Assertions.assertEquals(revString, new Calculator().reverseString(string));
    }

    @Test
    void reverseStringNullStringValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Calculator().reverseString(null));
    }

    @Test
    void isPalindromePositiveTest() {
        String string = "mamam";
        assertTrue(new Calculator().isPalindrome(string));
    }

    @Test
    void gcdPositiveTest() {
        int num1 = 8;
        int num2 = 6;
        int exp = 2;
        Assertions.assertEquals(exp, new Calculator().gcd(num1, num2));
    }

    @Test
    void gcdSecondArgZeroTest() {
        int num1 = 8;
        int num2 = 0;
        Assertions.assertEquals(num1, new Calculator().gcd(num1, num2));
    }

    @Test
    void gcdFirstArgZeroTest() {
        int num1 = 0;
        int num2 = 9;
        Assertions.assertEquals(num2, new Calculator().gcd(num1, num2));
    }

    @Test
    void productOfArrayPositiveTest() {
        int[] ints = {2, 4, 6, 1};
        long expected = 48;
        Assertions.assertEquals(expected, new Calculator().productOfArray(ints));
    }

    @Test
    void productOfArrayNullArrTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Calculator().productOfArray(null));
    }

    @Test
    void productOfArrayEmptyArrayTest() {
        int[] ints = new int[2];
        long expected = 0;
        Assertions.assertEquals(expected, new Calculator().productOfArray(ints));
    }

    @Test
    void productOfArrayArrayWithZero() {
        int[] ints = {0, 8, 9, 8};
        long expected = 0;
        Assertions.assertEquals(expected, new Calculator().productOfArray(ints));
    }

    @Test
    void lengthOfLongestWordPositiveTest() {
        String test = "I have been looking for a you";
        int expected = 7;
        Assertions.assertEquals(expected, new Calculator().lengthOfLongestWord(test));
    }

    @Test
    void lengthOfLongestWordOnlySpacesStringTest() {
        String test = "   ";
        int expected = 0;
        Assertions.assertEquals(expected, new Calculator().lengthOfLongestWord(test));
    }

    @Test
    void lengthOfLongestWordTwoWOrdsSameLengthTest() {
        String test = "I have been looking for a miracle";
        int expected = 7;
        Assertions.assertEquals(expected, new Calculator().lengthOfLongestWord(test));
    }

    @Test
    void celsiusToFahrenheitPositiveTest() {
        double celsius = 10;
        double Fhr = 50;
        Assertions.assertEquals(Fhr, new Calculator().celsiusToFahrenheit(celsius));
    }

    @Test
    void celsiusToFahrenheitNegativeCelsTest() {
        double celsius = -10;
        double Fhr = 14;
        Assertions.assertEquals(Fhr, new Calculator().celsiusToFahrenheit(celsius));
    }

    @Test
    void containsSubstringPositiveTest() {
        String main = "mamamylaramu";
        String testSub = "myla";
        boolean expected = true;
        Assertions.assertEquals(expected, new Calculator().containsSubstring(main, testSub));
    }

    @Test
    void containsSubstringNullSubString() {
        String main = "mamamylaramu";
        String testSub = null;
        Assertions.assertThrows(NullPointerException.class, () -> new Calculator().containsSubstring(main, testSub));
    }

    @Test
    void containsSubstringNullString() {
        String main = null;
        String testSub = "aga";
        Assertions.assertThrows(NullPointerException.class, () -> new Calculator().containsSubstring(main, testSub));
    }

    @Test
    void containsSubstringOneLetterTest() {
        String main = "Lalalalalala";
        String testSub = "l";
        boolean expected = true;
        Assertions.assertEquals(expected, new Calculator().containsSubstring(main, testSub));
    }

    @Test
    void containsSubstringSubstringEndOfStringTest() {
        String main = "Larris lays on the ground";
        String testSub = "ground";
        boolean expected = true;
        Assertions.assertEquals(expected, new Calculator().containsSubstring(main, testSub));
    }

    @Test
    void sumOfDigitsPositiveTest() {
        int num = 255;
        int expectedSum = 12;
        Assertions.assertEquals(expectedSum, new Calculator().sumOfDigits(num));
    }

    @Test
    void sumOfDigitsNullNumber() {
        int num = 0;
        int expectedSum = 0;
        Assertions.assertEquals(expectedSum, new Calculator().sumOfDigits(num));
    }

    @Test
    void isLeapYearPositiveTest() {
        int year = 2016;
        boolean exp = true;
        Assertions.assertEquals(exp, new Calculator().isLeapYear(year));
    }

    @Test
    void isLeapYearHundreds() {
        int year = 1900;
        boolean exp = false;
        Assertions.assertEquals(exp, new Calculator().isLeapYear(year));
    }
}