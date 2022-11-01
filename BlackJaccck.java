import java.util.Scanner;
import java.util.Random;

class Main {
  public static void BlackJaccck(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int player_card1, player_card2;
    int dealer_card1, dealer_card2;
    int player_total, dealer_total;
    int new_card;

    System.out.println("Welcome to Joshua's blackjack program!");

    dealer_card1 = 2 + r.nextInt(9);
    dealer_card2 = 2 + r.nextInt(9);
    dealer_total = dealer_card1 + dealer_card2;
    player_card1 = 2 + r.nextInt(9);
    player_card2 = 2 + r.nextInt(9);
    player_total = player_card1 + player_card2;

    System.out.println("\nYou get a " + player_card1 + " and a " + player_card2 + ".");
    System.out.println("Your total: " + player_total + ".\n");
    System.out.println("The dealer: " + dealer_card1 + " showing, and a hidden card.");
    System.out.println("His total is hidden, too.\n");

    System.out.print("Would you like to \"hit\" or \"stay\"? ");
    String choice = keyboard.nextLine();

    if (choice.equals("hit")) {
      new_card = 2 + r.nextInt(10);
      System.out.println("You drew a " + new_card + ".");
      player_total += new_card;
      if (player_total >= 21) {
        System.out.println("You loose");
      }
      if (player_total == 21) {
        System.out.println("You win");
      }
      {
        System.out.println("Your total is " + player_total + ".\n");
      }

      if (player_total <= 21) {
        System.out.println("Okay, dealer's turn.");
        System.out.println("His hidden card was a " + dealer_card2);
        System.out.println("His total was " + dealer_total);

        do {
          if (dealer_total < 17) {
            choice = "hit";
            System.out.println("Dealer chooses to hit.");
            new_card = 2 + r.nextInt(10);
            System.out.println("He draws a " + new_card);
            dealer_total += new_card;
            System.out.println("His total is " + dealer_total);
          } else {
            choice = "stay";
            System.out.println("Dealer stays.\n");
          }
        } while (dealer_total <= 21 && (!choice.equals("stay")));
      }
    }
  }
}