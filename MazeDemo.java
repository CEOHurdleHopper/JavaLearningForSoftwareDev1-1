/**
 * @class: MazeDemo
 * @date: February 6, 2023
 * @author: Write your name
 * task: You will complete this program to win the maze.
 * The maze array represents the wall of the maze.
 * The player starts from (1,1) and you will need to move to reach the end of
 * the maze at (ROW-2, COL-2).
 * The move, you will need to use W,A,S,D. W is for moving up, A is moving
 * left, D is moving to the right, and S is moving down.
 */
public class MazeDemo {
    static int ROW = 8;
    static int COL = 8;
    static int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1}
    };


    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean gameWon = false;
        int x = 1, y = 1;
        while (!gameWon) {
            System.out.println("Current position of the player: " + x + "," + y);
            System.out.println("Enter A,S,D,W to move");
            String userInput = input.nextLine();


            if (userInput.equalsIgnoreCase("W")) {
                if (x > 0 && maze[x - 1][y] == 0) {
                    x--;
                }
            } else if (userInput.equalsIgnoreCase("A")) {
                if (y > 0 && maze[x][y - 1] == 0) {
                    y--;
                }
            }
        }

    }
}