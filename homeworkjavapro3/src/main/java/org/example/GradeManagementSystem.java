package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GradeManagementSystem {
    public static void main(String[] args) {

        // инициализация придуманных мной студентов

        Student student1 = new Student("Vladimir", 24);
        Student student2 = new Student("Anton", 21);
        Student student3 = new Student("Mihail", 22);
        Student student4 = new Student("Barri", 27);
        Student student5 = new Student("Alexandr", 19);
        Student student6 = new Student("Anton", 19);
        Student student7 = new Student("Alina", 22);
        Student student8 = new Student("Klement", 26);


        // инициализация учителей

        Teacher teacher1 = new Teacher("Maria", 40);
        Teacher teacher2 = new Teacher("David", 30);
        Teacher teacher3 = new Teacher("Alexey", 29);

        // создание массива студентов

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8);

        // создание массива учителей

        List<Teacher> teachers = Arrays.asList(teacher1, teacher2, teacher3);

        // создание экземпляра класса и тестирование методов программы

        GradeManagementSystem gradeManagementSystem = new GradeManagementSystem();
//
//        gradeManagementSystem.processStudents(students);
//
//        gradeManagementSystem.processTeachers(teachers);
//
//        gradeManagementSystem.gradeStudents(teacher1, student4, Grade.A);
//
//        gradeManagementSystem.processStudents(students);

        //доп задание тест

        List<Student> students1 = new ArrayList<>();

        enterStudentFromConsole(students1);





    }


    // реализация вывода студентов в консоль
    public void processStudents(List<Student> students) {
        students.forEach(student -> System.out.println(student.getDescription()));
    }

    // реализация вывода учителей в консоль
    public void processTeachers(List<Teacher> teachers) {
        teachers.forEach(teacher -> System.out.println(teacher.getDescription()));
    }


    // реализация метода оценивания студентов
    public void gradeStudents(Teacher teacher, Student student, Grade grade) {
        teacher.gradeStudent(grade);
        student.setGrade(teacher.getTeachergrade());
    }


    // реализация доп задания по вводу студентов
    public static void enterStudentFromConsole(List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите имя студента ");
        String name = scanner.next();
        System.out.print("Введите возраст студента ");
        int age = scanner.nextInt();
        Student student = new Student(name,age);
        System.out.print("введенный вами студент: ");
        System.out.print(student.getDescription());
        System.out.println();
        System.out.print("Желаете поместить этого студента в новый массив? (Yes or No) ");
        String answer = scanner.next();
        if (answer.equals("No")) {
            System.out.println("ну и не надо:)");
        } else if (answer.equals("Yes")) {
            students.add(student);
            System.out.println("На данный момент ваш массив студентов выглядит вот так: ");
            new GradeManagementSystem().processStudents(students);
            System.out.print("Желаете продолжить? (Yes or No)");
            String answer1 = scanner.next();
            if (answer1.equals("No")) {
                System.out.println("Адиос амигос!");
                System.out.println("Ваш массив, мисье: ");
                new GradeManagementSystem().processStudents(students);

            } else if (answer1.equals("Yes")) {
                enterStudentFromConsole(students);
            }
        }
        scanner.close();
    }


    // реализация доп задания по вводу преподавателей
    public static void enterTeacherFromConsole(List<Teacher> teachers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите имя преподавателя ");
        String name = scanner.next();
        System.out.print("Введите возраст преподавателя ");
        int age = scanner.nextInt();
        Teacher teacher = new Teacher(name,age);
        System.out.print("Введенный вами преподаватель: ");
        System.out.print(teacher.getDescription());
        System.out.print("Желаете поместить этого преподавателя в новый массив? (Yes or No) ");
        String answer = scanner.next();
        if (answer.equals("No")) {
            System.out.println("ну и не надо:)");
        } else if (answer.equals("Yes")) {
            teachers.add(teacher);
            System.out.println("На данный момент ваш массив преподавателей выглядит вот так: ");
            new GradeManagementSystem().processTeachers(teachers);
            System.out.print("Желаете продолжить? (Yes or No)");
            String answer1 = scanner.next();
            if (answer1.equals("No")) {
                System.out.println("Адиос амигос!");
                System.out.println("Ваш массив, мисье: ");
                new GradeManagementSystem().processTeachers(teachers);

            } else if (answer1.equals("Yes")) {
                enterTeacherFromConsole(teachers);
            }
        }
        scanner.close();
    }
}
