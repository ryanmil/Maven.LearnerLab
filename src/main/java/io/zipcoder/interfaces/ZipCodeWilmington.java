package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();

    }

    public void hostLecture(Educator educator, double numberOfHours) {
        educator.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (Student s : students.toArray()) {
            map.put(s, s.getTotalStudyTime());
        }
        return map;
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
}
