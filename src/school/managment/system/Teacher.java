package school.managment.system;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private double salaryEarned;

    public Teacher(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        salaryEarned = 0;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void receiveSalary(double salary){
    salaryEarned += salary;
    School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + ' ' + lastName;
    }
}
