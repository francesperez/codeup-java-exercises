package grades;

public class StudentsTest {
    public static void main(String[] args) {

        Student student1 = new Student("Kevin");
        student1.addGrade(88);

        System.out.println(student1.getName());
        System.out.println(student1.getGrades());
        System.out.println(student1.getGradeAverage());



    }
}
