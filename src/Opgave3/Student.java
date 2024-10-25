package Opgave3;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;



    public Student(String name,ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses =  new ArrayList<>();

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Java");
        passedCourses1.add("C#");
        passedCourses1.add("Python");
        passedCourses1.add("C++");

    }

    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course)) {
            return false;
        }else
            currentCourses.add(course);
        return true;
    }

    @Override
    public String toString() {
        return "Student: " + getName() + ", passedCourses: " + passedCourses + ", currentCourses: " + currentCourses;
    }
}


