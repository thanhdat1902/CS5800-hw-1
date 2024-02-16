package org.example.course;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Instructor> instructors;
    private ArrayList<Textbook> textbooks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String name, ArrayList<Instructor> instructors, ArrayList<Textbook> textbooks) {
        this.name = name;
        this.instructors = new ArrayList<Instructor>(instructors);
        this.textbooks = new ArrayList<Textbook>(textbooks);
    }



    public void addTextbook(Textbook textbook) {
        this.textbooks.add(textbook);
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public void print() {
        System.out.println("Course name: " + this.name);
        System.out.println("Instructors: ");
        for(Instructor instructor: instructors) {
            System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
        }
        System.out.println("Textbooks: ");
        for(Textbook textbook: textbooks) {
            System.out.println(textbook.getTitle() + "- Author: " + textbook.getAuthor());
        }
    }
}
