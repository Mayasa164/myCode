import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ROCK = 1, SCISSOR = 2, PAPER = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Choose(1)Rock  , (2) Scissors, (3) Paper: ");
        int p1 = scan.nextInt();
        Random rand = new Random();
        int pc = rand.nextInt(3);

        while (pc == 0){
            pc = rand.nextInt(3);
        }

        if (p1 == pc) {
            System.out.print("No winner! ");
        }  else {
            switch (p1) {
                case 1:
                    if (pc == SCISSOR)
                        System.out.print("Player 1 wins!");
                    else
                        System.out.print("Player 2 wins!");
                    break;

                case 2:
                    if (pc == PAPER)
                        System.out.print("Player 1 wins!");
                    else
                        System.out.print("Player 2 wins!");
                    break;
                case 3:
                    if (pc == ROCK)
                        System.out.print("Player 1 wins!");
                    else
                        System.out.print("Player 2 wins!");
                    break;
            }
        }
        System.out.println("The PC select : "+ pc);


    }
}