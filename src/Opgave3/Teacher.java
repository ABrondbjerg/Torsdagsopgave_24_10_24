package Opgave3;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            return false;
        }else
            currentCourses.add(course);
        return true;
    }

    @Override
    public String toString() {
        return "Teacher: " + getName() + ", canTeach: " + canTeach + ", currentCourses: " + currentCourses;
    }
}
