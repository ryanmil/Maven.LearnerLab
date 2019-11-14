package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture() {
        ZipCodeWilmington z = ZipCodeWilmington.getInstance();

        z.hostLecture(Educator.TEMS_EGG, 30);
        for (Student s : z.getStudyMap().keySet()) {
            Assert.assertEquals(10.0, s.getTotalStudyTime(), .0001);
        }
    }

}