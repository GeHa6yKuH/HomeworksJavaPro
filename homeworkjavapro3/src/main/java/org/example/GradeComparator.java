package org.example;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGrade().toString().toCharArray()[0] - o2.getGrade().toString().toCharArray()[0];
    }
}
