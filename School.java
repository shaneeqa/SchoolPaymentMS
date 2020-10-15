package SchoolPaymentMS;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private int outstandingBalance;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    //adding a teacher only
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int studentPayment) {
        totalMoneyEarned += studentPayment;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int teacherSalary) {
        totalMoneySpent += teacherSalary;
    }

    public int getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance() {
        this.outstandingBalance = totalMoneyEarned-totalMoneyEarned;;
    }

    @Override
    public String toString() {
        return "School{" +
                "outstanding Balance= " + outstandingBalance +
                '}';
    }
}
