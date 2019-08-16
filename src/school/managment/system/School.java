package school.managment.system;


import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(double moneyEarned) {
        totalMoneyEarned += moneyEarned ;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(double moneySpent) {
       totalMoneyEarned -= moneySpent;
    }
}
