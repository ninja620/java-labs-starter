package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
    @Test
    void returnsTrueIsEvenZero() {
        // Проверяем, что для 0 метод возвращает true, так как 0 четное число
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }
    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }
    @Test
    void returnsFalseIsPrimeForNumberLess2() {
        boolean result = CourseToolkit.isPrime(1);

        assertFalse(result);
    }

    @Test
    void returnsFalseIsPrimeForNumberComposite() {
        boolean result = CourseToolkit.isPrime(1104);

        assertFalse(result);
    }

    @Test
    void returnsFalseIsPrimeForNumberSquares() {
        boolean result = CourseToolkit.isPrime(169);

        assertFalse(result);
    }
    @Test
    void returnsFalseIsPrime() {
        boolean result = CourseToolkit.isPrime(6767);

        assertFalse(result);
    }
    @Test
    void returnsTrueForRegistrSpacePalindrome() {
        boolean result = CourseToolkit.isPalindrome("Аргентина манит негра");

        assertTrue(result);
    }
    @Test
    void returnsTrueForNullPalindrome() {
        try {
            CourseToolkit.isPalindrome(null);
            org.junit.jupiter.api.Assertions.fail("Ожидалась ошибка IllegalArgumentException");
        } catch (IllegalArgumentException error){

        }

    }
    @Test
    void returnsTruePalindrome() {
        boolean result = CourseToolkit.isPalindrome("Шалаш");

        assertTrue(result);
    }
    @Test
    void returnsAverageForNormalValues() {
        int[] testValues = {10, 20, 30};
        double result = CourseToolkit.average(testValues);
        org.junit.jupiter.api.Assertions.assertEquals(20.0, result, 0.001);
    }

    @Test
    void returnsAverageForNegativeValues() {
        int[] testValues = {-5, -15, 2};
        double result = CourseToolkit.average(testValues);
        org.junit.jupiter.api.Assertions.assertEquals(-6.0, result, 0.001);
    }

    @Test
    void throwsExceptionForNullOrEmptyArray() {
        try {
            CourseToolkit.average(new int[]{});
            org.junit.jupiter.api.Assertions.fail("Ожидалась ошибка для пустого массива");
        } catch (IllegalArgumentException e) {
        }

        try {
            CourseToolkit.average(null);
            org.junit.jupiter.api.Assertions.fail("Ожидалась ошибка для массива null");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void returnsMinValue() {
        int[] testNumbers = {10, -5, 20, 3, -100, 50};
        org.junit.jupiter.api.Assertions.assertEquals(-100, CourseToolkit.min(testNumbers));
    }

    @Test
    void minThrowsExceptionForEmptyArray() {
        try {
            CourseToolkit.min(new int[]{});
            org.junit.jupiter.api.Assertions.fail("Ожидалась ошибка для пустого массива");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void returnsMaxValue() {
        int[] testNumbers = {10, -5, 20, 3, -100, 50};
        org.junit.jupiter.api.Assertions.assertEquals(50, CourseToolkit.max(testNumbers));
    }

    @Test
    void maxThrowsExceptionForNull() {
        try {
            CourseToolkit.max(null);
        } catch (IllegalArgumentException e) {
        }
    }
}
