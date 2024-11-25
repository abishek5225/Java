import java.util.Scanner;

public class CircleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxSize = 10; // Adjust this value to change the size of the box
        int blockPosition = boxSize / 2;
        int player1Position = 0;
        int player2Position = boxSize - 1;

        while (true) {
            // Display the current state of the game
            displayGame(boxSize, blockPosition, player1Position, player2Position);

            // Get player 1's move
            System.out.print("Player 1, enter 'left' or 'right' to move: ");
            String player1Move = scanner.nextLine();

            // Update player 1's position
            if (player1Move.equals("left")) {
                if (player1Position > 0) {
                    player1Position--;
                }
            } else if (player1Move.equals("right")) {
                if (player1Position < blockPosition - 1) {
                    player1Position++;
                }
            }

            // Check if player 1 wins
            if (player1Position >= blockPosition) {
                System.out.println("Player 1 wins!");
                break;
            }

            // Get player 2's move
            System.out.print("Player 2, enter 'left' or 'right' to move: ");
            String player2Move = scanner.nextLine();

            // Update player 2's position
            if (player2Move.equals("left")) {
                if (player2Position > blockPosition + 1) {
                    player2Position--;
                }
            } else if (player2Move.equals("right")) {
                if (player2Position < boxSize - 1) {
                    player2Position++;
                }
            }

            // Check if player 2 wins
            if (player2Position <= blockPosition) {
                System.out.println("Player 2 wins!");
                break;
            }

            System.out.println(); // Add a line break for readability
        }

        scanner.close();
    }

    public static void displayGame(int boxSize, int blockPosition, int player1Position, int player2Position) {
        for (int i = 0; i < boxSize; i++) {
            if (i == player1Position) {
                System.out.print("1"); // Player 1's position
            } else if (i == blockPosition) {
                System.out.print("|"); // Block position
            } else if (i == player2Position) {
                System.out.print("2"); // Player 2's position
            } else {
                System.out.print("-"); // Empty space
            }
        }
        System.out.println();
    }
}
