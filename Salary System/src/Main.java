import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Employee e1 = new Employee("Mayasa",1500);
        Employee e2 = new Employee("Alrayan", 800);
        Employee e3 = new Employee("Maryam",1000);
        Employee e4 = new Employee("Fatima",500);
        Employee e5 = new Employee("Reem",900);




        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);



        Scanner read = new Scanner(System.in);



        boolean runSys = true;
        while (runSys) {
            System.out.print("Enter (1) to create employee or  (2) to show all employees details: ");
            Double enter = read.nextDouble();

            if (enter == 1) {
                System.out.print("Enter employee name: ");
                String name = read.next();
                System.out.print("Enter the salary: ");
                Double salary = read.nextDouble();

                employeeList.add(new Employee(name, salary));


            } else if (enter == 2) {
                System.out.println(" All employees details: ");


                for (Employee emp : employeeList) {
                    System.out.println("Name: " + emp.name);
                    System.out.println("Salary: " + emp.salary);
                    System.out.println("");
                }

                System.out.println();
                System.out.print("Do you want exist?: Enter (y)yes, (n)no: ");
                String exist = read.next();
                if (exist.equals("y")) {
                    runSys = false;
                }
            } else {
                System.out.println(" No Match , try again");
            }
        }



    }
}

