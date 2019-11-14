package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TEMMIE(1, "Temmie"),
    TEMS_EGG(2, "Tem's Egg"),
    BOB(3, "Bob");

    final Instructor instructor;
    double timeWorked;

    Educator(long id, String name) {
        instructor = new Instructor(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
