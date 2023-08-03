import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter two  values and I will swap them :");
        double n1 = read.nextDouble();
        double n2 = read.nextDouble();
        System.out.println("Before swapping : " );
        System.out.println("first number = " + n1);
        System.out.println("second number = " + n2);

        n1=n2;
        n2=n1;
        System.out.println("After swapping : " );
        System.out.println("first number = " + n1);
        System.out.println("second number = " + n2);
        System.out.println("");

    }
}

