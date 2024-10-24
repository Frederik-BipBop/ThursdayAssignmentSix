package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Opretter ArrayLists til beståede kurser og undervisningskurser
        ArrayList<String> passedCourse1 = new ArrayList<>();
        passedCourse1.add("Java 1.0");
        ArrayList<String> passedCourse2 = new ArrayList<>();
        ArrayList<String> passedCourse3 = new ArrayList<>();
        ArrayList<String> canTeach1 = new ArrayList<>();
        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Matematik");
        canTeach2.add("Music");

        ArrayList<String> canTeach3 = new ArrayList<>();
        canTeach3.add("Dansk");
        canTeach3.add("Java 1.0");

        // Opretter de studerende og lære
        Student s1 = new Student("Benjamin", passedCourse1);
        Student s2 = new Student("Jens", passedCourse2);
        Student s3 = new Student("Abdul", passedCourse3);
        Teacher t1 = new Teacher ("Karsten", canTeach1);
        Teacher t2 = new Teacher("Sandra", canTeach2);
        Teacher t3 = new Teacher("Lotte", canTeach3);

        // Laver en ArrayList til at gemme alle personer
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

        // Gennemgår listen af personer og tilføjer "Java 1.0"
        for (Person person : persons) {
            boolean added = person.addCourse("Java 1.0");
            if (!added) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            } else {
                System.out.println(person.getName() + " har tilføjet kursus 'Java 1.0'.");
            }
        }
    }
}

