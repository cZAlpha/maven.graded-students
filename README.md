# Assignment Description

In this assignment, you will be implementing a `Classroom` class and a `Student` class. The `Classroom` class will contain an array of `Student` objects, and will provide methods for manipulating and retrieving information about the students. The `Student` class will represent a single student, and will contain information about the student's name and exam scores.

## `Classroom` Class

The `Classroom` class will contain the following methods:

### `public Classroom(Student[] students)`

This constructor should take an array of `Student` objects and use it to initialize the internal array of `Student` objects in the `Classroom` object.

### `public Classroom()`

This constructor should create an empty `Classroom` object with no students.

### `public Student[] getStudents()`

This method should return an array of all the `Student` objects in the `Classroom` object.

### `public Double getAverageExamScore()`

This method should return the average exam score for all the `Student` objects in the `Classroom` object.

### `public Boolean addStudent(Student... students)`

This method should take one or more `Student` objects and add them to the `Classroom` object. If any of the `Student` objects being added already exist in the `Classroom` object, they should not be added again.

### `public Boolean removeStudent(Student student)`

This method should remove the specified `Student` object from the `Classroom` object.

### `public Student[] getStudentsByScore()`

This method should return an array of all the `Student` objects in the `Classroom` object, sorted in descending order by their average exam score.

### `public Map<Student, Character> getGradeBook()`

* The class `Classroom` should define a method `getGradeBook()` which returns a mapping of `Student` objects to a respective letter grade determined by creating a [grading curve](https://en.wikipedia.org/wiki/Grading_on_a_curve) such that
  * An `A` is awarded to students whose class average is in the upper 10th percentile.
  * A `B` is awarded to students whose class average falls between the 11th and 29th percentile.
  * A `C` is awarded to students whose class average falls between the 30th and 50th percentile.
  * A `D` is awarded to students whose class average falls between the 51st and 89th percentile.
  * An `F` is awarded to students whose class average is in the lower 10th percentile.

## `Student` Class

The `Student` class will contain the following methods:

### `public Student(String firstName, String lastName, Double[] testScores)`

This constructor should take the student's first and last name, as well as an array of exam scores, and use them to initialize the `Student` object.

### `public Student()`

This constructor should create an empty `Student` object with no name or exam scores.

### `public String getFirstName()`

This method should return the student's first name.

### `public void setFirstName(String firstName)`

This method should set the student's first name to the specified value.

### `public String getLastName()`

This method should return the student's last name.

### `public void setLastName(String lastName)`

This method should set the student's last name to the specified value.

### `public Double[] getExamScores()`

This method should return an array of the student's exam scores.

### `public void addExamScore(double examScore)`

This method should add a new exam score to the student's array of exam scores.

### `public void setExamScore(int examNum, double updateScore)`

This method should update the specified exam score with a new value.

### `public Double getAverageExamScore()`

This method should return the average exam score for the student.

### `public String toString()`

This method should return a string representation of the student, including their name and exam scores.

### `public int compareTo(Student studentToCompareAgainst)`

This method should compare the current `Student` object to another `Student` object, based first on their average exam score, and then on their name.

# Task
Your task is to implement the `Classroom` and `Student` classes, and to write JUnit test cases to ensure that each feature
