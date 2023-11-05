package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Calculator {
    // 1. Простое сложение двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Вычитание
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3. Умножение
    public int multiply(int a, int b) {
        return a * b;
    }

    // 4. Деление
    public double divide(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    // 5. Возведение в степень
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 6. Вычисление факториала
    public long factorial(int n) {
        if (n < 0) {
            n = n * -1;
        }
        long res = 1;
        for (int i = n; i > 0; i--) {
           res *= i;
        }
        return res;
    }

    // 7. Определение четности числа
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 8. Поиск максимального числа в массиве
    public int findMax(int[] array) {
        if (array == null) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // 9. Определение простого числа
    public boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 10. Перевод числа в строку с указанием системы счисления
    public String toBaseString(int n, int base) {
        if(base < 2 || base > 16) {
            throw new IllegalArgumentException("Base should be between 2 and 16");
        }
        return Integer.toString(n, base);
    }

    // 11. Вычисление корня числа
    public double sqrt(double a) {
        if(a < 0) {
            throw new IllegalArgumentException("Negative numbers are not supported");
        }
        return Math.sqrt(a);
    }

    // 12. Инвертирование строки
    public String reverseString(String input) {
        if (input == null) throw new IllegalArgumentException("empty String provided");
        StringBuilder newString = new StringBuilder(input);
        return newString.reverse().toString();
    }

    // 13. Проверка, является ли строка палиндромом
    public boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // 14. Вычисление НОД двух чисел
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 15. Перемножение элементов массива
    public long productOfArray(int[] array) {
        if (array == null) throw new IllegalArgumentException("array is null");
        return Arrays.stream(array).reduce((el1, el2) -> el1 * el2).orElse(0);
    }

    // 16. Определение длины самого длинного слова в строке
    public int lengthOfLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        int maxLength = 0;
        for(String word : words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }

    // 17. Конвертация температуры из Цельсия в Фаренгейт
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // 18. Проверка на вхождение подстроки в строку (без использования стандартных методов Java)
    public boolean containsSubstring(String main, String sub) {
        char[] charsMain = main.toCharArray();
        List<Character> charsSub = new ArrayList<>();
        for (char ch : sub.toCharArray()) {
            charsSub.add(ch);
        }
        List<Character> characterListCheck = new ArrayList<>();
        for (int i = 0; i < charsMain.length; i++) {
            if (charsSub.get(0) == charsMain[i] && charsMain.length - i >= charsSub.size()) {
                for (int j = i; j < charsSub.size() + i; j++) {
                    characterListCheck.add(charsMain[j]);
                }
                if (charsSub.equals(characterListCheck)) return true;
                characterListCheck.clear();
            }
        }
        return false;
    }

    // 19. Сумма цифр числа
    //256 --- 2 + 5 + 6
    public int sumOfDigits(int number) {
        int sum = 0;
        int res = 0;
        int count = 16;
        while (number != 0) {
            if (number / Math.pow(10 , count) >= 1) {
                res = (int) (number / Math.pow(10 , count));
                sum += res;
                number -= (int) (res * Math.pow(10 , count));
            }
            count--;
        }
        return sum;
    }

    // 20. Проверка, является ли год високосным
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
    }
}
