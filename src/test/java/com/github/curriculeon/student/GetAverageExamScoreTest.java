package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GetAverageExamScoreTest {

    private void test(Double[] examScores, Double expected) {
        //Arrange
        Student student = new Student(null, null, examScores);
        //Act
        Double actual = student.getAverageExamScore();
        //Assert
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test0() {
        //Arrange
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        test(examScores, 103.5);
    }
}
