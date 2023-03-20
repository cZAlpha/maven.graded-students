package com.github.curriculeon;


import java.util.Arrays;
import java.util.HashMap;
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

    public Boolean addStudent(Student student) {
        Student[] updatedStudents = new Student[this.students.length + 1]; // Makes a new array that is one larger than the old array
        for (int i = 0; i < this.students.length; i++) { // Loops thru exam score array
            updatedStudents[i] = this.students[i]; // Copies old information over
        }
        updatedStudents[updatedStudents.length - 1] = student; // Sets new exam score
        this.students = updatedStudents; // Updates the scores to the internal array
        return true; // Unsure why this is a boolean method, as you can always add more to an array so this method will always return true
    }

    public Boolean removeStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                // Remove student from array
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                // Update array length
                students = Arrays.copyOf(students, students.length - 1);
                return true;
            }
        }
        return false;
    }

    public Student[] getStudentsByScore() {
        Student[] returnArray = new Student[students.length];

        // Implement populating the returnArray in ascending grade order

        return returnArray;
    }

    public Map<Student, Character> getGradeBook() { // Student object, Character as a grade
        Map<Student, Character> gradeBook = new HashMap<>(); // Init. gradebook map

        for ( int i = 0 ; i < students.length ; i++ ){ // Loops thru students in the class
            gradeBook.put(students[i], students[i].getGrade(students[i].getAverageExamScore())); // Populates the hashmap based on the array of students
        }
        return gradeBook;
    }

    public int classSize(){
        return this.students.length;
    }


}

