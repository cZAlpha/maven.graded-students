package com.github.curriculeon.student;

import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Test;

public class CompareToTest {

    @Test
    public void test0() {
        // Create some Student objects with different grades and names
        Student alice = new Student("Alice", "Smith", new Double[]{80.0, 90.0, 95.0});
        Student bob = new Student("Bob", "Jones", new Double[]{75.0, 85.0, 90.0});
        Student charlie = new Student("Charlie", "Brown", new Double[]{85.0, 95.0, 100.0});

        // Check that Alice is less than Bob (by grade)
        Assert.assertTrue(alice.compareTo(bob) < 0);

        // Check that Charlie is greater than Alice (by grade)
        Assert.assertTrue(charlie.compareTo(alice) < 0);

        // Check that Alice is equal to a new Student object with the same name and grades
        Assert.assertEquals(0, alice.compareTo(new Student(alice.getFirstName(), alice.getLastName(), alice.getExamScores())));

        // Check that Bob is less than Alice (by name, since their grades are the same)
        Assert.assertTrue(bob.compareTo(alice) > 0);
    }


    @Test
    public void test2() {
        // Create some Student objects with different grades and names
        Student alice = new Student("Alice", "Smith", new Double[]{80.0, 90.0, 95.0});
        Student david = new Student("David", "Lee", new Double[]{70.0, 80.0, 75.0});
        Student emily = new Student("Emily", "Chen", new Double[]{90.0, 95.0, 90.0});


        // Check that David is less than Emily (by grade)
        Assert.assertTrue(david.compareTo(emily) > 0);

        // Check that Alice is less than Emily (by grade)
        Assert.assertTrue(alice.compareTo(emily) > 0);
    }

    @Test
    public void test3() {
        // Create some Student objects with different grades and names
        Student alice = new Student("Alice", "Smith", new Double[]{80.0, 90.0, 95.0});
        Student bob = new Student("Bob", "Jones", new Double[]{75.0, 85.0, 90.0});
        Student charlie = new Student("Charlie", "Brown", new Double[]{85.0, 95.0, 100.0});
        Student frank = new Student("Frank", "Wong", new Double[]{85.0, 90.0, 85.0});

        // Check that Alice is less than Bob (by grade)
        Assert.assertTrue(alice.compareTo(bob) < 0);

        // Check that Charlie is greater than Alice (by grade)
        Assert.assertTrue(charlie.compareTo(alice) < 0);

        // Check that Alice is equal to a new Student object with the same name and grades
        Assert.assertEquals(0, alice.compareTo(new Student("Alice", "Smith", new Double[]{80.0, 90.0, 95.0})));

        // Check that Frank is greater than Bob (by grade)
        Assert.assertTrue(frank.compareTo(bob) < 0);

        // Check that Frank is greater than Alice (by grade)
        Assert.assertTrue(frank.compareTo(alice) > 0);

        // Check that Frank is less than Charlie (by grade)
        Assert.assertTrue(frank.compareTo(charlie) > 0);
    }

}
