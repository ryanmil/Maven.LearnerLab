package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
