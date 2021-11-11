import java.util.Scanner;

public class TicTacToe_twoPlayer {
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        Scanner scnr = new Scanner(System.in);
        drawBoard();
        String W;
        boolean stop = false;
        while(!stop) {
            draw(board);
            String s = scnr.nextLine();
            if(s.equals("N")) {
                stop = true;
            }
        }//Run draw, the game.
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
    public static void draw(int[][]board) {
        int player = 0;

        while (player < 5) {

            for(int i = 0; i < 5; i++){
                while (player % 2 == 0) {
                    if (isWinner(board) == true){
                        StdDraw.text(1.5, .8, "You Won!"); // Start of loop checks for game end.
                        StdDraw.text(1.5, .5, "Enter Y for new game or N to stop.");
                        return;
                    }
                    if (StdDraw.mousePressed()) {
                        StdDraw.pause(200);
                        int x = (int) Math.floor(StdDraw.mouseX());
                        int y = (int) Math.floor(StdDraw.mouseY());//set x and y of mouse to int x and y
                        if (board[x][y] == 0 && StdDraw.mouseX() < 1 && StdDraw.mouseY() < 1) {
                            StdDraw.line(0, 0, 1, 1);
                            StdDraw.line(0, 1, 1, 0);
                            board[x][y] = 2; //if board is 0 and mouse location in a square, prints shape in square.
                            player++;
                        } else if (board[x][y] == 0 && StdDraw.mouseX() < 1 && StdDraw.mouseY() < 2) {
                            StdDraw.line(0, 1, 1, 2);
                            StdDraw.line(0, 2, 1, 1);
                            board[x][y] = 2;
                            player++;
                        } else if ((board[x][y] == 0 && StdDraw.mouseX() < 1 && StdDraw.mouseY() > 2)) {
                            StdDraw.line(0, 2, 1, 3);
                            StdDraw.line(0, 3, 1, 2);
                            board[x][y] = 2;
                            player++;
                        } else if ((board[x][y] == 0 && StdDraw.mouseX() < 2 && StdDraw.mouseY() < 1)) {
                            StdDraw.line(1, 0, 2, 1);
                            StdDraw.line(1, 1, 2, 0);
                            board[x][y] = 2;
                            player++;
                        } else if ((board[x][y] == 0 && StdDraw.mouseX() < 2 && StdDraw.mouseY() < 2)) {
                            StdDraw.line(1, 1, 2, 2);
                            StdDraw.line(1, 2, 2, 1);
                            board[x][y] = 2;
                            player++;
                        } else if ((board[x][y] == 0 && StdDraw.mouseX() < 2 && StdDraw.mouseY() < 3)) {
                            StdDraw.line(1, 2, 2, 3);
                            StdDraw.line(1, 3, 2, 2);
                            board[x][y] = 2;
                            player++;
                        } else if ((board[x][y] == 0 && StdDraw.mouseX() > 2 && StdDraw.mouseY() < 1)) {
                            StdDraw.line(2, 0, 3, 1);
                            StdDraw.line(2, 1, 3, 0);
                            board[x][y] = 2;
                            player++;
                        } else if ((board[x][y] == 0 && StdDraw.mouseX() > 2 && StdDraw.mouseY() < 2)) {
                            StdDraw.line(2, 1, 3, 2);
                            StdDraw.line(2, 2, 3, 1);
                            board[x][y] = 2;
                            player++;

                        } else if ((board[x][y] == 0 && StdDraw.mouseX() > 2 && StdDraw.mouseY() > 2)) {
                            StdDraw.line(2, 2, 3, 3);
                            StdDraw.line(2, 3, 3, 2);
                            board[x][y] = 2;
                            player++;
                        }
                    }
                        while (player % 2 == 1) {
                            if (isWinner(board) == true){
                                StdDraw.text(1.5, .8, "You Won!");
                                StdDraw.text(1.5, .5, "Enter Y for new game or N to stop.");
                                return;
                            }
                            else if (player == 9){ //if loop has been run 9 times and winner not declared
                                StdDraw.text(1.5, .8, "You tied!");
                                StdDraw.text(1.5, .5, "Enter Y for new game or N to stop.");
                                return;
                            }
                            if (StdDraw.mousePressed()) {
                                StdDraw.pause(200);  //pause helps with glitches
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
                    }
                }
            }
        }




    public static void drawBoard() {
        StdDraw.clear();
        StdDraw.setScale(0, 3);
        StdDraw.setPenRadius(0.004);
        for (int i = 0; i <= 3; i++) {
            StdDraw.line(i, 0, i, 3);  //Draws board in grid
        }
        for (int i = 0; i <= 3; i++) {
            StdDraw.line(0, i, 3, i);
        }
    }
    }

