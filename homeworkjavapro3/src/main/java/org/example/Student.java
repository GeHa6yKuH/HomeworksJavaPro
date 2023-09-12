package org.example;

public class Student extends Person implements Graded{
    private Grade grade;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    String getDescription() {
        return "имя - " + super.getName() + " возраст - " + super.getAge() + " оценка - " + grade;
    }

    @Override
    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
