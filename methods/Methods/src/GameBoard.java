import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameBoard extends JFrame {

    private static final int BOARD_WIDTH = 600;   // Adjust the board width as desired
    private static final int BOARD_HEIGHT = 400;  // Adjust the board height as desired

    public GameBoard() {
        setTitle("Game Board");
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel boardPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBoard(g);
            }
        };

        getContentPane().add(boardPanel);
        setVisible(true);
    }

    private void drawBoard(Graphics g) {
        int boardMarginX = 50;  // Adjust the horizontal margin of the board as desired
        int boardMarginY = 50;  // Adjust the vertical margin of the board as desired

        int boardWidth = BOARD_WIDTH - (2 * boardMarginX);
        int boardHeight = BOARD_HEIGHT - (2 * boardMarginY);

        int rodWidth = 10;  // Adjust the width of the rod as desired
        int rodHeight = boardHeight;  // Adjust the height of the rod to match the board height

        int rodX = boardMarginX + (boardWidth / 2) - (rodWidth / 2);
        int rodY = boardMarginY;

        int gapWidth = 40;  // Adjust the width of the gap as desired
        int gapHeight = 20;  // Adjust the height of the gap as desired

        int gapX = rodX + (rodWidth / 2) - (gapWidth / 2);
        int gapY = rodY + (rodHeight / 2) - (gapHeight / 2);

        g.setColor(Color.BLACK);
        g.fillRect(boardMarginX, boardMarginY, boardWidth, boardHeight);

        g.setColor(Color.WHITE);
        g.drawRect(boardMarginX, boardMarginY, boardWidth, boardHeight);

        g.setColor(Color.RED);  // Adjust the color of the rod as desired
        g.fillRect(rodX, rodY, rodWidth, rodHeight);

        int carromMenRadius = 10;  // Adjust the radius of the carrom men as desired
        g.setColor(Color.WHITE);  // Adjust the color of the carrom men as desired

        int carromMenGap = 20;  // Adjust the gap between the carrom men as desired
        int carromMenXLeft = rodX - (2 * carromMenRadius) - carromMenGap;
        int carromMenXRight = rodX + rodWidth + carromMenGap;

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int carromMenX = random.nextInt(boardWidth - (2 * carromMenRadius)) + boardMarginX + carromMenRadius;
            int carromMenPosY = random.nextInt(boardHeight - (2 * carromMenRadius)) + boardMarginY + carromMenRadius;
            int carromMenNegY = random.nextInt(boardHeight - (2 * carromMenRadius)) + boardMarginY + carromMenRadius;
            g.fillOval(carromMenX - carromMenRadius, carromMenPosY - carromMenRadius, 2 * carromMenRadius, 2 * carromMenRadius);
            g.fillOval(carromMenX - carromMenRadius, carromMenNegY - carromMenRadius, 2 * carromMenRadius, 2 * carromMenRadius);
        }

        g.setColor(Color.BLACK);  // Adjust the color of the gap as desired
        g.fillRect(gapX, gapY, gapWidth, gapHeight);
    }






    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameBoard::new);
    }
}
