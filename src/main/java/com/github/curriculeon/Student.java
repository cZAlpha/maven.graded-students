package com.github.curriculeon;


public class Student implements Comparable<Student> {
    private String firstName;    // The student's first name
    private String lastName;     // The student's last name
    private Double[] testScores; // The student's test scores as an array of Doubles

    public Student(String firstName, String lastName, Double[] testScores) {
        // Re-assignments of private vars to inputted parameters into constructor
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.testScores = testScores;
    }

    public Student() { // Re-assignments of private vars to null due to this being the null constructor
        this.firstName  = null;
        this.lastName   = null;
        this.testScores = null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getExamScores() {
        return this.testScores;
    }

    public void addExamScore(double examScore) {
        Double[] updatedScores = new Double[getExamScores().length + 1]; // Makes a new array that is one larger than the old array
        for (int i = 0; i < getExamScores().length; i++) { // Loops thru exam score array
            updatedScores[i] = getExamScores()[i]; // Copies old information over
        }
        updatedScores[updatedScores.length - 1] = examScore; // Sets new exam score
        this.testScores = updatedScores; // Updates the scores to the internal array
    }


    public void setExamScore(int examNum, double updateScore) {
    }


    public Double getAverageExamScore() {
        Double summationVar = 0.0;
        Double returnVar    = 0.0;
        for ( int i = 0 ; i < getExamScores().length ; i++ ) {
            summationVar += getExamScores()[i];
        }
        returnVar = summationVar / getExamScores().length;
        return returnVar;
    }

    @Override
    public String toString() {
        return null;
    }

    /**
     * @param studentToCompareAgainst the object to be compared; compare by grade, then by name
     * @return
     */
    @Override
    public int compareTo(Student studentToCompareAgainst) {


        return Integer.valueOf(null);
    }
}

