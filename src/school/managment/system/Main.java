package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher barbara = new Teacher(1, "Barbara", "Kowalska", 1600);
        Teacher stefan = new Teacher(2, "Stefan", "Bizz", 2300);
        Teacher wanda = new Teacher(3, "Wanda", "Gass", 2150.50);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(barbara);
        teacherList.add(stefan);
        teacherList.add(wanda);

        Student karol = new Student(1,"Karol", "Moro", 1);
        Student ola = new Student(2, "Aleksandra", "Smith", 4);
        Student marcin = new Student(3,"Marcin", "Daleki",2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(karol);
        studentList.add(ola);
        studentList.add(marcin);

        School wws = new School(teacherList, studentList);
        karol.payFees(10000);
        ola.payFees(30000);
        marcin.payFees(15000);
        System.out.println("Wrocławka Wyższa Szkoła zarobiła " + wws.getTotalMoneyEarned() + "zł");
        System.out.println("WWS wypłaca etaty: " + teacherList);

        barbara.receiveSalary(barbara.getSalary());
        stefan.receiveSalary(stefan.getSalary());
        wanda.receiveSalary(wanda.getSalary());
        System.out.println("Wrocławka Wyższa Szkoła zarobiła " + wws.getTotalMoneyEarned() + "zł");

        System.out.println(karol);



    }
}
