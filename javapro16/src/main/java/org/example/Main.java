package org.example;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Andrei", 18, 4.5);
        Student s2 = new Student("Andrei", 18, 4.5);
        Student s3 = new Student("Andrei", 18, 4.5);

        List<Student> students = Arrays.asList(s1, s2, s3);
        System.out.println(students);

        saveStudentsToFile(students, "studentiki");
        List<Student> studentList = loadStudentsFromFile("studentiki");
        System.out.println(studentList);

    }

    public static void saveStudentsToFile(List<Student> students, String filename) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename + ".ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(students);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> loadStudentsFromFile(String filename) {
        List<Student> students;
        try (
                FileInputStream fileIn = new FileInputStream(filename + ".ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
        ) {

            students = (List<Student>) in.readObject();
            System.out.println("Done");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    public static void filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename) {
        try(
                FileOutputStream fileOut = new FileOutputStream(filename + ".ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
        ) {

            out.writeObject(students.stream().filter(student -> student.getGrade() > gradeThreshold).toList());
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static double calculateAverageGrade(String filename) {
        List<Student> students;
        try(
                FileInputStream fileIn = new FileInputStream(filename + ".ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
        ) {

            students = (List<Student>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }
}