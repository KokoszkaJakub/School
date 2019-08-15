package school.managment.system;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String firstName, String lastName, int grade) {
        this.feesPaid = 0;
        this.feesTotal=30000;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;

    }
    public void setGrade(int grade){
        this.grade = grade;

    }
    public void updateFeesPaid(int fees){
        feesPaid = feesPaid + fees;
    }
}
