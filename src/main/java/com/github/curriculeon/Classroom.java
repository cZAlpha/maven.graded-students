package com.github.curriculeon;


import java.util.Map;

public class Classroom {
    private Student[] students; // The internal array that holds "Student" objects

    public Classroom(Student[] students) {
        this.students = students; // Sets the internal array equal to the inputted array
    }

    public Classroom() {
        this.students = null; // Null constructor
    }

    public Student[] getStudents() {
        return null;
    }


    public Double getAverageExamScore() {
        return null;
    }

    public Boolean addStudent(Student students) {
        return null;
    }

    public Boolean removeStudent(Student student) {
        return null;
    }

    public Student[] getStudentsByScore() {
        return null;
    }

    public Map<Student, Double> getGradeBook() {
        return null;
    }

}

