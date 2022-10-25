package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    private HashMap<String, String> attendance;

    public String toString(){
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

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public void setAttendance(HashMap<String, String> attendance) {
        this.attendance = attendance;
    }

//=================================================CONSTRUCTORS=====================================================
    //No-arg Constructor
    public Student(){}

//Constructor that sets name property and initializes the grade property as an empty ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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

//adding the given date and value to the attendance property
    public void recordAttendance(String date, String value){
        if(value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")){
             this.attendance.put(date, value);
        }

//returns student's attendance percentage
//        public double getAttendance(){
//            return 4*4
//        }


    }




}
