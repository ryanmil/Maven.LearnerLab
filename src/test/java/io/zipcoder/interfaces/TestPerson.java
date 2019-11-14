package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        String expectedName = "Bob";
        long expectedId = 42;

        Person p = new Person(expectedId, expectedName);

        Assert.assertEquals(expectedId, p.getId());
        Assert.assertEquals(expectedName, p.getName());
    }

    @Test
    public void testSetName() {
        Person p = new Person(0, "Name");

        String expectedName = "Bob";
        p.setName(expectedName);

        Assert.assertEquals(expectedName, p.getName());
    }

}
