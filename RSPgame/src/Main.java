import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ROCK = 1, SCISSOR = 2, PAPER = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Choose(1)Rock  , (2) Scissors, (3) Paper: ");
        int p1 = scan.nextInt();
        System.out.println(" Choose(1)Rock  , (2) Scissors, (3) Paper: ");
        int p2 = scan.nextInt();

        if (p1 == p2) {
            System.out.print("Not possible ,You choose the same,try again! ");
        }  else {
 switch (p1) {
     case 1:
      if (p2 == SCISSOR)
             System.out.print("Player 1 wins!");
      else
            System.out.print("Player 2 wins!");
      break;

      case 2:
          if (p2 == PAPER)
              System.out.print("Player 1 wins!");
          else
              System.out.print("Player 2 wins!");
          break;
                case 3:
                    if (p2 == ROCK)
                        System.out.print("Player 1 wins!");
                    else
                        System.out.print("Player 2 wins!");
                    break;
                        }
        }


    }
}
