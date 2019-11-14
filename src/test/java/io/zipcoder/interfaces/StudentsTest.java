package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testStudents() {
        Students s = Students.getInstance();
        Person ryan = s.findById(1);

        Assert.assertEquals("Ryan", ryan.getName());
    }

}