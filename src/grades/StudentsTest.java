package grades;

public class StudentsTest {
    public static void main(String[] args) {

        Student student1 = new Student("Kevin");
        student1.addGrade(88);
        student1.recordAttendance("10-25-2022", "A");
        student1.recordAttendance("10-24-2022", "P");
        student1.recordAttendance("10-23-2022", "P");
        student1.recordAttendance("10-22-2022", "P");



        System.out.println(student1.getName());
        System.out.println(student1.getGrades());
        System.out.println(student1.getGradeAverage());
        System.out.println(student1.getAttendance());



    }
}
