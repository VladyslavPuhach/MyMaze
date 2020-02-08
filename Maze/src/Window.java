import javax.swing.*;
import java.awt.*;
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
        MainWindow mw = new MainWindow();
        GameField r1 = new GameField();
        System.out.println(r1);

    }
    }


