
import java.util.Scanner;

public class TicTacToe_singlePlayer{
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        drawBoard();
        draw(board);
    }
    public static void drawBoard() {
        StdDraw.setScale(0, 3);
        StdDraw.setPenRadius(0.004);
        for (int i = 0; i <= 3; i++) {
            StdDraw.line(i, 0, i, 3);  //Draws board in grid
        }
        for (int i = 0; i <= 3; i++) {
            StdDraw.line(0, i, 3, i);
        }
    }


    public static int draw(int[][]board) {
        int player = 0;

        while (player < 5) {

            for (int i = 0; i < 5; i++) {
                while (player % 2 == 0) {
                    if (isWinner(board) == true) {
                        StdDraw.text(1.5, .8, "You Won!"); // Start of loop checks for game end.
                        StdDraw.text(1.5, .5, "Enter Y for new game or N to stop.");
                        Scanner scnr = new Scanner(System.in);
                        String w = scnr.next();
                        if (w == "Y") {
                            return 1;
                        }
                        if (w == "N") {
                            return 2;  //
                        }
                    }
                    if (StdDraw.mousePressed()) {
                        StdDraw.pause(200);
                        int x = (int) Math.floor(StdDraw.mouseX());
                        int y = (int) Math.floor(StdDraw.mouseY()); //set x and y equal to int location
                        if (board[x][y] == 0 && StdDraw.mouseX() < 1 && StdDraw.mouseY() < 1) {
                            StdDraw.circle(.5, .5, .5);
                            board[x][y] = -2;
                            player++; //all of these if statements need the board to = 0, and mouse to be in square to draw shape.
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() < 1 && StdDraw.mouseY() < 2) {
                            StdDraw.circle(.5, 1.5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() < 1 && StdDraw.mouseY() > 2) {
                            StdDraw.circle(.5, 2.5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() < 2 && StdDraw.mouseY() < 1) {
                            StdDraw.circle(1.5, .5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() < 2 && StdDraw.mouseY() < 2) {
                            StdDraw.circle(1.5, 1.5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() < 2 && StdDraw.mouseY() > 2) {
                            StdDraw.circle(1.5, 2.5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() > 2 && StdDraw.mouseY() < 1) {
                            StdDraw.circle(2.5, .5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() > 2 && StdDraw.mouseY() < 2) {
                            StdDraw.circle(2.5, 1.5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() > 2 && StdDraw.mouseY() > 2) {
                            StdDraw.circle(2.5, 2.5, .5);
                            board[x][y] = -2;
                            player++;
                            break;
                        }
                    }
                }
                    while (player % 2 == 1) {
                        computerTurn(board);
                        player++;
                        if (isWinner(board) == true) {
                            StdDraw.text(1.5, .8, "You Won!");
                            StdDraw.text(1.5, .5, "Enter Y for new game or N to stop.");
                            Scanner scnr = new Scanner(System.in);
                            String w = scnr.next();
                            if (w == "Y") {
                                return 1;
                            }
                            if (w == "N") {
                                return 2;  // Return keeps program continuing or ends it.
                            }
                        }
                        else if (player == 9) { //if loop has been run 9 times and winner not declared
                            StdDraw.text(1.5, .8, "You tied!");
                            StdDraw.text(1.5, .5, "Enter Y for new game or N to stop.");
                            Scanner scnr = new Scanner(System.in);
                            String w = scnr.next();
                            if (w == "Y") {
                                return 1;
                            }
                            if (w == "N") {
                                return 2;
                            }
                        }
                    }
                }
            }
        return 1;
        }



    public static int computerTurn(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) { // empty spot available
                    StdDraw.line(i, j, i + 1, j + 1);
                    StdDraw.line(i, j + 1, i + 1, j);
                    board[i][j] = 2;
                    return 1;
                }
            }
        }
        return 1;
    }





        public static boolean isWinner(int[][] board) {
            if (board[0][0] + board[0][1] + board[0][2] == 6 || board[0][0] + board[0][1] + board[0][2] == -6) {
                return true;
            }
            if (board[1][0] + board[1][1] + board[1][2] == 6 || board[1][0] + board[1][1] + board[1][2] == -6) {
                return true;
            } //IsWinner checks every row, column, and diagonal in coordinates for a winner after every click.
            if (board[2][0] + board[2][1] + board[2][2] == 6 || board[2][0] + board[2][1] + board[2][2] == -6) {
                return true;
            }
            if (board[1][0] + board[2][0] + board[0][0] == 6 || board[0][0] + board[1][0] + board[2][0] == -6) {
                return true;
            }
            if (board[0][1] + board[1][1] + board[2][1] == 6 || board[0][1] + board[1][1] + board[2][1] == -6) {
                return true;
            }
            if (board[0][2] + board[1][2] + board[2][2] == 6 || board[0][2] + board[1][2] + board[2][2] == -6) {
                return true;
            }
            if (board[0][0] + board[1][1] + board[2][2] == 6 || board[0][0] + board[1][1] + board[2][2] == -6) {
                return true;
            }
            if (board[0][2] + board[1][1] + board[2][0] == 6 || board[0][2] + board[1][1] + board[2][0] == -6) {
                return true;
            }
            return false;} // if not true then return false to continue
    }