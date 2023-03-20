package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class GetAverageExamScoreTest {

    private void test(double[] examScores, Double expected) {
        //Arrange
        Double[] studentExamScores = Arrays
                .stream(examScores)
                .boxed()
                .toArray(Double[]::new);
        Student student = new Student(null, null, studentExamScores);
        //Act
        Double actual = student.getAverageExamScore();
        //Assert
        Assert.assertEquals(expected, actual, 0.03);
    }

    @Test
    public void test0() {
        //Arrange
        double[] examScores = DoubleStream
                .generate(() -> ThreadLocalRandom.current().nextDouble(50, 100))
                .limit(5)
                .toArray();
        double average = Arrays.stream(examScores).average().getAsDouble();
        test(examScores, average);
    }
}
