import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 40));

        // Draw a line i the middle of the window
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        // Print the name and score of each player in the top-center of the window
        g.drawString("Player 1 - "+player1/10+player1%10, (GAME_WIDTH/2)-305, 50);
        g.drawString(String.valueOf(player2/10)+player2%10+" - Player 2", (GAME_WIDTH/2)+20, 50);
    }
}
