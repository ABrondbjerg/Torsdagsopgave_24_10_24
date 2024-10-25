package Opgave3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCoursesPeter = new ArrayList<>();
        passedCoursesPeter.add("CS");
        passedCoursesPeter.add("Java 1.0");
        passedCoursesPeter.add("C++");

        ArrayList<String> passedCoursesJohnny = new ArrayList<>();
        passedCoursesJohnny.add("Python");

        ArrayList<String> canTeachLone = new ArrayList<>();
        canTeachLone.add("Java 1.0");
        canTeachLone.add("C++");

        ArrayList<String> canTeachHolger = new ArrayList<>();
        canTeachHolger.add("Matematik");

        ArrayList<Person> persons = new ArrayList<>();

Student s1 = new Student("Peter", passedCoursesPeter);
Student s2 = new Student("Johnny", passedCoursesJohnny);

Teacher t1 = new Teacher("Lone", canTeachLone);
Teacher t2 = new Teacher("Holger", canTeachHolger);

        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

        for (Person person : persons) {
            boolean result = person.addCourse("Java 1.0");
            if (!result) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " Already passed this course.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " Can already teach this course.");
                }
            }
        }
        for (Person person : persons) {
            System.out.println(person);
        }
    }


}
