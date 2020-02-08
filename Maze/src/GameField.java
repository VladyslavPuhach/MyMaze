import javax.swing.*;

import java.util.Random;


public class GameField extends JPanel {
    private static int width = 40;                       // the size of the maze
    private static int height = 40;                      //the size of the maze

    private static final int S = 1;
    private static final int F = 1;                     //number of components
    private static final int K = 8;
    private static final int D = 8;

    {                                                   //creation of objects
        String Start = "Start" + S;                     //Start the maze
        String finish = "Finish" + F;                   //finish the maze
        String key = "Key" + S;                         // Key the maze
        String dor = "Dor" + D;                         //Dor the maze
    }

    private static final char MAZE_WALL = '@';       //The symbol of regeneration from start to finish for maze
    private static final char MAZE_KEY = 'K';        //Maze key regeneration symbol
    private static final char MAZE_DOR = 'D';        //The symbol of the rebirth of the maze door

    static final char MAZE_PATH = ' ';               //the path of the maze
                                                     //forces will describe the behavior of regenerations

    private int[][] maze;                            //The structure of the maze will be described here

    public GameField() {                              //generation of maze size and more
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 18; j++) {
                System.out.print(" " + Map[i][j] + " ");
            }
            System.out.println();
        }
        width = height = 40;
    }

    /*********************************************
    public void loadImages() {
        ImageIcon iia = new ImageIcon("Door.png");       //An image of the components will be shown here

        ImageIcon iid = new ImageIcon("key.png");
    }
    *********************************************/


    public void Start(){
                                                        //Description of the method of start
    }

    public void finish(){
                                                        //Description of the method of finish
    }

    public void key(){
                                                         //Description of the method of key
    }

    public void dor(){
                                                        //Description of the method of dor
    }

    public void StartAndFinish() {
        int x = 1;                                      ///The start and finish will be shown here
        int y = 1;

    }

    public static int[][] Map = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1, D, 1, 0, 1, 1, 0, 1, 1, 0, 1},                 //Map for the maze
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


    Random ra = new Random();                                          // the map will be reversed randomly
    int i = ra.nextInt(Map[1][0]);

    public GameField(int[][] maze) {                                    //More options
        this.maze = maze;
    }
}
