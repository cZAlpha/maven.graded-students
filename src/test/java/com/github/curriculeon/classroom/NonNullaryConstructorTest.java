package com.github.curriculeon.classroom;

import com.github.curriculeon.Classroom;
import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NonNullaryConstructorTest {
    // given
    private void test(Student[] students) {

        // when
        Classroom testClassroom = new Classroom(students);
        Student[] actualStudentsArray = testClassroom.getStudents();
        List<Student> actualStudentsList = Arrays.asList(actualStudentsArray);
        for(Student expectedStudent : students) {
            // then
            Assert.assertTrue(actualStudentsList.contains(expectedStudent));
        }
    }

    @Test
    public void test0() {
        test(new Student[0]);
    }

    @Test
    public void test1() {
        test(new Student[1]);
    }

    @Test
    public void test2() {
        test(new Student[2]);
    }
}

