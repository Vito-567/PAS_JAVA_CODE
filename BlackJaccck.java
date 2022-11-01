import java.util.Scanner;
import java.util.Random;

class Main {
  public static void BlackJaccck(String[] args) {
    Scanner kbScanner = new Scanner(System.in);
    Random r = new Random();
    int player_card1, player_card2;
    int dealer_card1, dealer_card2;
    int player_total, dealer_total;
    int new_card;

    System.out.println("Welcome to Vito's blackjack program!");

    dealer_card1 = 1 + r.nextInt(10);
    dealer_card2 = 1 + r.nextInt(10);
    dealer_total = dealer_card1 + dealer_card2;
    player_card1 = 1 + r.nextInt(10);
    player_card2 = 1 + r.nextInt(10);
    player_total = player_card1 + player_card2;

    System.out.println("You get a " + player_card1 + " and a " + player_card2 + ".");
    System.out.println("Your total is: " + player_total);
    System.out.println("The dealer: " + dealer_card1 + " showing, and a hidden card.");
    System.out.println("His total is hidden, too.\n");

    System.out.print("Would you like to \"hit\" or \"stay\"? ");
    String choice = kbScanner.nextLine();

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
        System.out.println("Ok, it is dealer's turn.");
        System.out.println("Dealer's hidden card was a " + dealer_card2);
        System.out.println("Dealer's total was " + dealer_total);

        do {
          if (dealer_total < 17) {
            choice = "hit";
            System.out.println("Dealer chooses to hit.");
            new_card = 2 + r.nextInt(10);
            System.out.println("Dealer draws a " + new_card);
            dealer_total += new_card;
            System.out.println("Dealer's total is " + dealer_total);
          } else {
            choice = "stay";
            System.out.println("Dealer stays.\n");
          }
        } while (dealer_total <= 21 & (!choice.equals("stay")));
      }
    }
  }
}