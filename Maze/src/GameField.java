import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Random;


public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image KEY;
    private Image DOOR;
    private int keyX;
    private int keyY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int KEYS;
    private Timer timer;
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = false;

    private int[][] maze;

    public String Door;


    public void initGame() {

    }


    public void loadImages() {
        ImageIcon iia = new ImageIcon("Door.jpg");
        DOOR = iia.getImage();
        ImageIcon iid = new ImageIcon("key.png");
        KEY = iid.getImage();
    }

    private static final int S = 1;
    private static final int F = 1;
    private static final int K = 8;
    private static final int D = 8;

    {
        String Start = "Start" + S;
        String Fini = "Fini" + F;
        String key = "Key" + S;
        String dor = "Dor" + D;
    }

    private static int[][] DIRECTIONS = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1, D, 1, 0, 1, 1, 0, 1, 1, 0, 1},
            {1, 1, 1, D, 1, 1, 1, 1, K, 1, 0, 1, 1, D, 0, D, K, 1},
            {1, 1, 1, 0, 0, 1, D, K, S, K, D, 1, 1, 1, 1, 1, D, 1},
            {1, 1, 0, D, 0, 0, 0, 1, K, 1, 1, 0, D, D, 0, 0, 0, 1},
            {1, 1, K, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
            {1, 1, 0, 0, 0, K, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 1, 1, 0, D, K, K, 0, 0, 1, 1, K, 1, 1},
            {1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, D, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, D, 0, F, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
    public GameField(int[][] maze){
        this.maze = maze;
    }
    public GameField(){
        this(DIRECTIONS);
        setBackground(Color.BLACK);
        loadImages();

    }
}
