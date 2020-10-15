package SchoolPaymentMS;

import java.util.ArrayList;
import java.util.List;

public class SchoolPayment {
    public static void main(String[] args) {
        Student ninja = new Student("111", "Ninja", 5);
        Student sanja = new Student("113", "Sanja", 6);

        List<Student> students = new ArrayList<>();
        students.add(ninja);
        students.add(sanja);

        Teacher Manja = new Teacher("11","Manja", 3000);
        Teacher Lanja = new Teacher("21","Lanja", 7000);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(Manja);
        teachers.add(Lanja);

        School school = new School(teachers, students);

        ninja.payFees(15000);


        System.out.println(ninja.toString());
        System.out.println(school.toString());

    }
}
