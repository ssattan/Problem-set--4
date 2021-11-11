import java.awt.*;
public class ConnectFour {
    public static void main(String[] args) {
        int[][] board = new int[7][7];
        drawBoard();
        game(board);
    }
    public static void game(int[][]board) {
        int player = 0;//I could not get a winner system working, so I made it an endless loop
                       //always returning true.
        while (iswinner(board) == true) {

            while (player % 2 == 0) {
                StdDraw.setPenColor(Color.blue); //blue team
                if (StdDraw.mousePressed()) {
                    StdDraw.pause(200);
                    int x = (int) Math.floor(StdDraw.mouseX());
                    int y = (int) Math.floor(StdDraw.mouseY());//take coords
                    if (board[x][0] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, .5, .5);
                        board[x][0] = 1;
                        player++; //Sorry for messy code, could not get for loops working.
                        //All of these look for the x coordinate of click progressively checking if
                        //the bottom place is open with if else.
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }
                    else if (board[x][0] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }
                    else if (board[x][0] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }



                    else if (board[x][0] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }



                    else if (board[x][0] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }



                    else if (board[x][0] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }
                    else if (board[x][0] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }

                }
            }
            while (player % 2 == 1) {
                StdDraw.setPenColor(Color.red); //Red team
                if (StdDraw.mousePressed()) {
                    StdDraw.pause(200);
                    int x = (int) Math.floor(StdDraw.mouseX());//Take coords, exact same code as before.
                    int y = (int) Math.floor(StdDraw.mouseY());
                    if (board[x][0] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 1) {
                        StdDraw.filledCircle(.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }
                    else if (board[x][0] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 2) {
                        StdDraw.filledCircle(1.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }
                    else if (board[x][0] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 3) {
                        StdDraw.filledCircle(2.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }



                    else if (board[x][0] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 4) {
                        StdDraw.filledCircle(3.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }



                    else if (board[x][0] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 5) {
                        StdDraw.filledCircle(4.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }



                    else if (board[x][0] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 6) {
                        StdDraw.filledCircle(5.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }
                    else if (board[x][0] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, .5, .5);
                        board[x][0] = 1;
                        player++;
                    } else if (board[x][1] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 1.5, .5);
                        board[x][1] = 1;
                        player++;
                    } else if (board[x][2] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 2.5, .5);
                        board[x][2] = 1;
                        player++;
                    } else if (board[x][3] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 3.5, .5);
                        board[x][3] = 1;
                        player++;
                    } else if (board[x][4] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 4.5, .5);
                        board[x][4] = 1;
                        player++;
                    } else if (board[x][5] == 0 && StdDraw.mouseX() < 7) {
                        StdDraw.filledCircle(6.5, 5.5, .5);
                        board[x][5] = 1;
                        player++;
                    }

                }

            }
        }
    }
        public static boolean iswinner(int[][]board){
        return true; //Couldn't figure it out so endlessly looped it.
        }


    public static void drawBoard() {
            StdDraw.setScale(0, 7);
            StdDraw.setPenRadius(0.004);
            for (int i = 0; i <= 7; i++) {
                StdDraw.line(i, 0, i, 6);  //Draws board in grid and sets up game
            }
            for (int i = 0; i <= 6; i++) {
                StdDraw.line(0, i, 7, i);
            }
        }
    }
