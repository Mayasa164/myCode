import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter height and width of rectangle :");
        double h = read.nextDouble();
        double w = read.nextDouble();
        System.out.println("height = "+ h);
        System.out.println("width = "+ w);
        double perR =(h + w)* 2;
        double areaR= h * w;
        System.out.println("Perimeter = " + perR);
        System.out.println("Area = " + areaR);
        System.out.println("");

    }
}