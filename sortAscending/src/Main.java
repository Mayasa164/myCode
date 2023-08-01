import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("please Enter Number of Element in the Array :");
            int arraySize = 0;
            int temp = 0;
            if (scan.hasNextInt()) {
                arraySize = scan.nextInt();
            }
            ;
            int[] array = new int[arraySize];
            System.out.println("Enter the Elements to the array: ");
            for (int i = 0; i < arraySize; i++) {
                if (scan.hasNextInt()) {
                    array[i] = scan.nextInt();
                }
            }

//put element in the array
            System.out.print("Input : ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }


            //Sort
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

//      Displaying
            System.out.println(" ");
            System.out.print("Output: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
    }
}