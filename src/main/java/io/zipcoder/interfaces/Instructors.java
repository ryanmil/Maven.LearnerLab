package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super();
        add(Educator.TEMMIE.instructor);
        add(Educator.TEMS_EGG.instructor);
        add(Educator.BOB.instructor);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return getList().toArray(new Instructor[0]);
    }
}
