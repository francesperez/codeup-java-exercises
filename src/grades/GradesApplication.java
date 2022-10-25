package grades;

import movies.Movie;
import movies.MoviesArray;
import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
//Creating HashMap
        HashMap<String, Student> students = new HashMap<>();
//Creating first student object
        Student student1 = new Student("Frances");
//Adding grades to object
        student1.addGrade(99);
        student1.addGrade(90);
        student1.addGrade(87);
        student1.addGrade(83);

        Student student2 = new Student("Jazmine");
        student2.addGrade(88);
        student2.addGrade(73);
        student2.addGrade(91);
        student2.addGrade(66);

        Student student3 = new Student ("Kita");
        student3.addGrade(45);
        student3.addGrade(60);
        student3.addGrade(71);
        student3.addGrade(55);

        Student student4 = new Student ("Jojo");
        student4.addGrade(100);
        student4.addGrade(98);
        student4.addGrade(89);
        student4.addGrade(99);

//Adding multiple objects to the students HashMap all at once
        Map<String, Student> studentsMap = Map.ofEntries(
                entry("frannypopo", student1),
                entry("jazzy123", student2),
                entry("cheetakita", student3),
                entry("jojoJolene", student4)
        );
        students.putAll(studentsMap);

//Souts to make sure everything is working so far :)
//        System.out.println(students.get("frannypopo").getGrades());
//        System.out.println(students.get("jazzy123").getGrades());
//        System.out.println(students.get("cheetakita"));



//User input for search

        Scanner scanner = new Scanner(System.in);
        String goAgain = "y";
        while (goAgain.equalsIgnoreCase("y")) {
            System.out.println("Welcome");
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println("|frannypopo|jazzy123|cheetakita|jojojolene");
            System.out.println("What student would you like to see more information on?");
            String userInput;
            userInput = scanner.next().toLowerCase();

//            apply the search method
            if (students.containsKey(userInput)) {
                System.out.println("Name: " + students.get(userInput) + " Username: " + userInput);
                System.out.printf("Current Average: %.2f %nAll grades are: %s%n",
                        students.get(userInput).getGradeAverage(), students.get(userInput).getGrades());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);

            }
            System.out.println("Do you want to search for another student? (y/n): ");
            goAgain = scanner.next();
            scanner.nextLine();
            System.out.println("Goodbye, have a wonderful day!");
        }























    } //end of main
} //end of class
