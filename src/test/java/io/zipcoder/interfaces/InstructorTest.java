package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        Assert.assertTrue(new Instructor(42, "") instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(new Instructor(42, "") instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor teach = new Instructor(12231, "Teach");
        Student s = new Student(343, "Boi");

        double hours = 2.0;
        teach.teach(s, hours);

        Assert.assertEquals(hours, s.getTotalStudyTime(), 0.001);

        teach.teach(s, hours);
        Assert.assertEquals(hours*2.0, s.getTotalStudyTime(), .0001);
    }

    @Test
    public void testLecture() {
        Student[] students = new Student[30];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, "Beeg Chungus" + i);
        }

        Instructor teach = new Instructor(42, "Teach");
        teach.lecture(students, 300);

        for (Student s : students) {
            Assert.assertEquals(10, s.getTotalStudyTime(), .0001);
        }
    }
}