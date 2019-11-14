package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void testInstructors() {
        Instructors teachers = Instructors.getInstance();
        Person teach = teachers.findById(1);

        Assert.assertEquals("Temmie", teach.getName());
    }

}