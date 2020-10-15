package SchoolPaymentMS;

public class Student {
    private String id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int feeAmount) {
        this.feesPaid += feeAmount;
        School.updateTotalMoneyEarned(feeAmount);
    }

//    public int PendingFees() {
//        return feesTotal-feesPaid;
//    }

    @Override
    public String toString() {
        int pendingFee = feesTotal-feesPaid;
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", pending Fee=" + pendingFee +
                '}';
    }
}
