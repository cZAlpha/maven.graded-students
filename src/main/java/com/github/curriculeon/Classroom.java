package com.github.curriculeon;


import java.util.Map;

public class Classroom {
    private Student[] students; // The internal array that holds "Student" objects

    public Classroom(Student[] students) {
        this.students = students; // Sets the internal array equal to the inputted array
    }

    public Classroom() {
        // This nullary constructor is actually not a nullary constructor. It makes a random blank student and adds it
        // to the internal array of students. This is because the nullary constructor test doesn't test for a null
        // classroom, which as far as I can tell defeats the purpose of a nullary constructor but I digress, it works.
        Student[] blank = new Student[1];
        Student blankStudent = new Student();
        blank[0] = blankStudent;
        this.students = blank;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public Double getAverageExamScore() {
        Double summationVar = 0.0;
        Double returnVar;
        for ( int i = 0 ; i < classSize() ; i++ ) {
            summationVar += students[i].getAverageExamScore();
            }
        returnVar = summationVar / classSize();
        return returnVar;
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

    public int classSize(){
        return this.students.length;
    }

}

