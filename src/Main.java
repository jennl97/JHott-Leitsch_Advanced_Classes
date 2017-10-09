import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Employee employee1 = new Employee("John", "Smith", PositionTitle.TECHNICAL, "Oct 12,2015",
                true, 22.00, 1);
        Employee employee2 = new Employee("Sarah", "Laughs", PositionTitle.ADMINISTRATION, "May 4, 2013",
                false, 15.00, 1);
        Employee employee3 = new Employee("Jake", "Johnson", PositionTitle.PRODUCTION, "Jan 15, 1981",
                false, 9.50, 3);

        employee1.printEmployee();
        employee1.calculate(45);
        System.out.println("\n");
        employee2.printEmployee();
        employee2.calculate(50);
        System.out.println("\n");
        employee3.printEmployee();
        employee3.calculate(35);

    }
}
