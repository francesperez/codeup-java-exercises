package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private ArrayList<Integer> grades;



    public String toString() {
        return name;
    }

    //================================================Getter and Setters================================================
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //=================================================CONSTRUCTORS=====================================================
    //No-arg Constructor
    public Student() {
    }

    //Constructor that sets name property and initializes the grade property as an empty ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


//======================================================METHODS======================================================

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return (double) grades.stream().reduce(Integer::sum).get() / grades.size();
    }






}
