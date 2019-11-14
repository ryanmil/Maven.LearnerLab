package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student s = new Student(42, "Billy");
        Assert.assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student s = new Student(42, "Billy");
        Assert.assertTrue(s instanceof Person);
    }

    @Test
    public void testLearn() {
        Student s = new Student(42, "Billy");
        s.learn(2.5);
        Assert.assertEquals(2.5, s.getTotalStudyTime(), .00001);
        s.learn(2.0);
        Assert.assertEquals(4.5, s.getTotalStudyTime(), .00001);
    }
}