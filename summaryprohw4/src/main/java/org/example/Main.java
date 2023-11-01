package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your login: ");
        String login = scanner.next();
        System.out.println("Please enter your password: ");
        String password = scanner.next();
        System.out.println("Please enter your password repeated: ");
        String confirmation = scanner.next();

        try {
            System.out.println(checkLoginAndPassword(login, password, confirmation));
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        List<Character> characters = Arrays.asList( 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '_');
        int count = 0;
        for (int i = 0; i < login.length(); i++) {
            for (int j = 0; j < characters.size(); j++) {
                if (login.charAt(i) == characters.get(j)){
                    count++;
                    break;
                }
            }
        }
        if (count != login.length() || login.length() >= 20) {
            throw new WrongLoginException("login incorrect");
        }
        int passwordCount = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < characters.size(); j++) {
                if (password.charAt(i) == characters.get(j)){
                    passwordCount++;
                    break;
                }
            }
        }
        if (passwordCount != password.length() || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("wrong password");
        }
        return true;
    }
}