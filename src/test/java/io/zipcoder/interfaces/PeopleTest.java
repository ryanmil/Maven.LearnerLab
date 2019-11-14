package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    People<Person> peeps;

    @Before
    public void before() {
        peeps = new People<Person>(){
            @Override
            public Person[] toArray() {
                return this.getList().toArray(new Person[0]);
            }
        };
    }

    @Test
    public void testAdd() {
        for (int i = 0; i < 5; i++) {
            peeps.add(new Person(i, "Beeg Yoshi" + i));
        }

        Assert.assertEquals(5, peeps.count());
        Assert.assertTrue(peeps.findById(1).getName().equals("Beeg Yoshi1"));
    }

    @Test
    public void testRemove() {
        for (int i = 0; i < 5; i++) {
            peeps.add(new Person(i, "Beeg Yoshi" + i));
        }
        Person beeg = new Person(6, "Beeg Chungus");
        peeps.add(beeg);

        Assert.assertTrue(peeps.contains(beeg));
        peeps.remove(beeg);
        Assert.assertFalse(peeps.contains(beeg));
    }

    @Test
    public void testFindById() {
        for (int i = 0; i < 5; i++) {
            peeps.add(new Person(i, "Beeg Yoshi" + i));
        }
        Person beeg = new Person(6, "Beeg Chungus");
        peeps.add(beeg);

        Assert.assertTrue(peeps.findById(6) == beeg);
        Assert.assertTrue(peeps.findById(0).getName().equals("Beeg Yoshi0"));
    }
}