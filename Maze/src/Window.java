import javax.swing.*;
import java.util.Random;

class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Maze");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700,500);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        Random ne = new Random();
        ne.nextInt();
        MainWindow mw = new MainWindow();
        GameField r1 = new GameField();

    }
}
