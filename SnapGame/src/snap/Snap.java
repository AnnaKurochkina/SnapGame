package snap;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Snap extends CardGame {
    Scanner scanner = new Scanner(System.in);
    Card card1;
    Card card2;
    Player player;
    boolean snapWritten = false;

    public Snap(String name) {
        super(name);
    }

    public void play() {

        System.out.println("Player 1, enter your name please: ");
        String player1 = scanner.nextLine();

        System.out.println("Player 2, enter your name please: ");
        String player2 = scanner.nextLine();

        System.out.println("Press Enter to deal cards and swap turns. When the 2 most recent cards have the same number," +
                " type 'snap' within 2 seconds to win. Otherwise you lose!");

        this.card1 = this.dealCard();
        System.out.print(this.card1);

        this.player = new Player(player1, player2);

        while (true) {
            if (deckOfCards.size() != 0) {
                scanner.nextLine();

                this.card2 = this.dealCard();
                System.out.print(this.card2 + "\t" + this.player.getCurrent() + "\t");

                if (this.card1.getValue() == this.card2.getValue()) {

                    CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS).execute(() -> {
                        if (!this.snapWritten) {
                            this.player.toggleCurrent();
                        }
                        this.printWinner();
                    });
                    String textWritten = scanner.nextLine();
                    this.snapWritten = textWritten.equalsIgnoreCase("snap");
                    Utils.wait(2000);
                    return;
                } else {
                    this.card1 = this.card2;
                }
                this.player.toggleCurrent();

            } else {
                System.out.println("There are no cards left");
                return;
            }
        }
    }

    private void printWinner() {
        System.out.printf("\nSNAP! %s won the game! ", this.player.getCurrent());
        System.out.println(this.card1 + " " + this.card2);
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        while (true) {
            Snap snap = new Snap("SNAP");
            snap.play();
            if (!userInput.captureYesNo("Do you want to play again? (y/n)")) {
                return;
            }
        }
    }
}
