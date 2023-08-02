import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean x=true;


        student s1 =new student();
        s1.name="A";
        student s2 =new student();
        s2.name="B";
        student s3 =new student();
        s3.name="C";
        student s4 =new student();
        s4.name="D";
        student s5 =new student();
        s5.name="E";


        List<student> stuList=new ArrayList<>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);
        stuList.add(s5);

        List attList = new ArrayList();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1  (register as attend) or 2 (display attended student) or 3 (Exit)");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter your name");
                    String stuName = scan.next();
                    if (stuList.contains(s1) || stuList.contains(s2) ||stuList.contains(s3) || stuList.contains(s4) || stuList.contains(s5)) {
                        if (attList.contains(stuName)) {
                            System.out.println("you already attend");
                            break;
                        }
                        attList.add(stuName);
                        System.out.println(" user added to Attended list");

                    } else
                        System.out.println("no match");
                    break;
                case 2:
                    if (attList.equals(stuList)){

                        x=false;
                        break;
                    }
                    else {

                        System.out.println(" Attend Student today :" + attList);
                    }
                    //call function
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("No such choice");

            }

        }
    }
}


class student{

    student(){

    }

    String name;
    String id;
}
class attend {

    String name;
    int att;
}