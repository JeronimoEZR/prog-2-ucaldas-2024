import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    Scanner scn=new Scanner (System.in);
    private String student_number;
    private float average_mark;
    ArrayList<CourseInformation> seminars_student=new ArrayList<>();

    public Student(String name, String phone_number, String email, String student_number, float average_mark) {
        super(name, phone_number, email);
        this.student_number = student_number;
        this.average_mark = average_mark;

    }

    public String isEligibleToEnrool() {
        return super.name + this.student_number + this.average_mark;

    }

    public void getSeminarsTaken() {

    }

    public Str