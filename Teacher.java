package SchoolPaymentMS;

public class Teacher {
    private String id;
    private String name;
    private int salary;


    public Teacher(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void paySalary(int salary) {
        //this.salary = salary;
        School.updateTotalMoneySpent(salary);
    }
    //when paying salary to the teacher totalEarnedMoney would be deducted in school class

}
