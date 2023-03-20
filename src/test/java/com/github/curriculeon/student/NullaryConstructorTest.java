package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class NullaryConstructorTest {
    @Test
    public void test() {
        //Arrange: Given
        Student student = new Student();
        boolean isCorrectType = student instanceof Comparable;

        //Act: When
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        Double[] actualExamScores = student.getExamScores();

        //Assert:Then
        Assert.assertTrue(isCorrectType);
        Assert.assertEquals(null, actualFirstName);
        Assert.assertEquals(null, actualLastName);
        Assert.assertArrayEquals(new Double[]{}, actualExamScores);
    }

}
