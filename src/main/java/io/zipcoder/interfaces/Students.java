package io.zipcoder.interfaces;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        super();
        super.add(new Student(1, "Ryan"));
        super.add(new Student(2, "Beeg Yoshi"));
        super.add(new Student(3, "Beeg Chungus"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return getList().toArray(new Student[0]);
    }
}
