package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String text){
        if (text == null){
            throw new IllegalArgumentException("Строка не может быть null");
        }
        else {
            String lowerText = text.toLowerCase().replace(" ", "");
            String reversedText = new StringBuilder(lowerText).reverse().toString();
            return lowerText.equals(reversedText);
        }
    }
    public static double average(int[] values){
        if (values == null || values.length == 0){
            throw new IllegalArgumentException("Массив не может быть пуустым или null");
        }
        double sum = 0;
        for (int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum / values.length;
    }

    public static int min(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null");
        }
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static int max(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null");
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}