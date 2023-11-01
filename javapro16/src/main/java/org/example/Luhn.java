package org.example;

import java.util.Random;

public class Luhn {
    public static void main(String[] args) {
        System.out.println(new Luhn().generateLuhnString());
    }

    public String generateLuhnString() {
        StringBuilder luhnString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            luhnString.append(random.nextInt(10));
        }
        int month = random.nextInt(1, 13);
        if (month < 10) luhnString.append(0);
        luhnString.append(month);
        luhnString.append(random.nextInt(27,29));
        luhnString.append(random.nextInt(10));
        luhnString.append(random.nextInt(10));
        int sum = 0;
        for (int i = 1; i < luhnString.length(); i += 2) {
            sum += 2 * luhnString.charAt(i) > 9 ? luhnString.charAt(i) - 9 : 2 * luhnString.charAt(i);
        }
        for (int i = 0; i < luhnString.length(); i++) {
            sum += luhnString.charAt(i);
        }
        int lastChar = 10 - (sum % 2);
        if (lastChar == 10) luhnString.append(0);
        else luhnString.append(lastChar);
        return luhnString.toString();
    }
}
