import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1 :");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Radius of circle :");
        double r = read.nextDouble();
        System.out.println("Radius = "+ r);
        double perC =2 * 3.14 * r ;
        double areaC= 3.14 * r * r;
        System.out.println("Perimeter = " + perC);
        System.out.println("Area = " + areaC);
        System.out.println("");
    }
}