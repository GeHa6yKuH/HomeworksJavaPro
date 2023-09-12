package org.example;

import java.util.Random;

public class Teacher extends Person{

    private Grade teachergrade;

    public Teacher(String name, int age) {
        super(name, age);
    }

    void gradeStudent(Grade grade) {
        teachergrade = grade;
    }

    @Override
    String getDescription() {
        return "имя преподавателя - " + super.getName() + " возраст преподавателя - " + super.getAge() + " оценка определенная преподавателя- " + teachergrade;
    }

    public Grade getTeachergrade() {
        return teachergrade;
    }
}
