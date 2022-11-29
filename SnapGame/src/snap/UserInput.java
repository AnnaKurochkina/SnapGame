package snap;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);

    public char captureSingleCharAsLowerCase(String message) {
        while (true) {
            System.out.println(message);
            char input = Character.toLowerCase(scan.next().charAt(0));

            if (Character.isLetter(input)) {
                return input;
            }
        }
    }

    public boolean captureYesNo(String message) {
        while(true){
            char input = captureSingleCharAsLowerCase(message);
            if (input == 'y') {
                return true;
            }
            if (input == 'n') {
                return false;
            }
        }
    }
}
