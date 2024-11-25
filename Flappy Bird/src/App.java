import javax.swing.*;;

public class App {
    public static void main(String[] args) throws Exception {

        int boardWidth = 360; // dimension of board in pixel
        int boardHeight = 640; // dimension of board in pixel

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // keep the window at centre of screen
        frame.setResizable(false); // ensures-user cannot resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if user click x- it will terminate the program

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack(); // JFrame automatically sizes itself to fit its contents
        flappyBird.requestFocus();
        frame.setVisible(true);

    }
}
