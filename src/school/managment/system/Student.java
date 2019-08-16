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
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
    public int getRemainingFees(){
        return feesTotal - feesPaid;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal + " left to pay " + getRemainingFees() +
                '}';
    }
}
