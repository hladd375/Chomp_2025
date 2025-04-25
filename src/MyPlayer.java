import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    private int[][] looseBoards;
    private int numLoose = 0;
    private int[][] boards;

    public MyPlayer() {
        columns = new int[10];
        looseBoards = new int[5][3];
//        looseBoards[0][0] = 1
//        looseBoards[0][1] = 0;
//        looseBoards[0][2] = 0;
//        numLoose  = 1;




        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        toColums();
        threexthreeBoards();
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

    //todo: make a method called toCollums that converts gameboard to colums
    public void toColums(){
        int chipsInColum = 0;
        for(int row = 0; row < gameBoard[0].length; row++){
            for(int col = 0; col < gameBoard.length; col++){
                if (gameBoard[col][row].isAlive == true) {
                    chipsInColum ++;
                }

            }
            System.out.println(chipsInColum);
            for(int z = 0; z < columns.length; z++) {
                columns[z] = chipsInColum;

            }
            chipsInColum = 0;
        }



    }
    public void threexthreeBoards(){


        int chipsinCol = 0;
        int endA =  4;
        int endB = 4;
        int endC = 4;

            for (int a = 1; a < endA; a++) {
                for (int b = 0; b < endB; b++) {
                    for (int c = 0; c < endC; c++) {
                        boolean looseBoard = false;
                        boolean bestMoveFound = false;
                        if(c <= b && b <= a){
                            System.out.print("Original board: ");
                            System.out.print(a);
                            System.out.print(b);
                            System.out.print(c);
                            System.out.println("");
                            System.out.println("Resulting Boards: ");
                            int c1;
                            int b1;
                            int a1;
                            int bestMoveCol = 0;
                            for(c1 = c - 1; c1 >= 0; c1 --){
                                System.out.print(a);
                                System.out.print(b);
                                System.out.print(c1);
                                System.out.println("");
                                for(int x = 0; x <looseBoards.length; x++){
                                    if(looseBoards[x][0] == a && looseBoards[x][1] == b && looseBoards[x][2] == c1){
                                        System.out.println("LOOSE BOARD");
                                        looseBoard = true;
                                        if(bestMoveFound == false){
                                            System.out.println("Best move is to result in this board");
                                            bestMoveFound = true;
                                            if(c - c1 != 0){
                                                bestMoveCol = 2;
                                                System.out.println("The best move is in row " + c1 );

                                            }
                                            System.out.println("The best move is in collom " + bestMoveCol);

                                        }


                                    }

                                }


                            }
                            c1 = c;

                            for(b1 = b - 1; b1 >= 0; b1 --){
                                //compare b1 to c1, if c1 is greater than b1 then make c1 eqaul b1
                                if(c1 > b1){
                                    c1 = b1;
                                }
                                System.out.print(a);
                                System.out.print(b1);
                                System.out.print(c1);
                                System.out.println("");
                                for(int x = 0; x <looseBoards.length; x++){
                                    if(looseBoards[x][0] == a && looseBoards[x][1] == b1 && looseBoards[x][2] == c1){
                                        System.out.println("LOOSE BOARD");
                                        looseBoard = true;
                                        if(bestMoveFound == false){
                                            System.out.println("Best move is to result in this board");
                                            bestMoveFound = true;
                                            if(c - c1 != 0){
                                                bestMoveCol = 2;
                                                System.out.println("The best move is in row " + c1 );

                                            }
                                            if(b - b1 != 0){
                                                bestMoveCol = 1;
                                                System.out.println("The best move is in row " + b1 );

                                            }
                                            System.out.println("The best move is in collom " + bestMoveCol);


                                        }


                                    }
                                }
                            }
                            c1 = c;
                            b1 = b;
                            for(a1 = a - 1; a1 >= 1; a1 --){
                                if(b1 > a1){
                                    b1 = a1;
                                }
                                if(c1 > a1){
                                    c1 = a1;
                                }
                                System.out.print(a1);
                                System.out.print(b1);
                                System.out.print(c1);
                                System.out.println("");
                                for(int x = 0; x <looseBoards.length; x++){
                                    if(looseBoards[x][0] == a1 && looseBoards[x][1] == b1 && looseBoards[x][2] == c1){
                                        System.out.println("LOOSE BOARD");
                                        looseBoard = true;
                                        if(bestMoveFound == false){
                                            System.out.println("Best move is to result in this board");
                                            bestMoveFound = true;
                                            if(c - c1 != 0){
                                                bestMoveCol = 2;
                                                System.out.println("The best move is in row " + c1 );

                                            }
                                            if(b - b1 != 0){
                                                bestMoveCol = 1;
                                                System.out.println("The best move is in row " + b1);

                                            }
                                            if(a - a1 != 0){
                                                bestMoveCol = 0;
                                                System.out.println("The best move is in row " + a1);
                                            }
                                            System.out.println("The best move is in collom " + bestMoveCol);

                                        }


                                    }
                                }
                            }

                            if(looseBoard == false && numLoose <5){
                                looseBoards[numLoose][0] = a;
                                looseBoards[numLoose][1] = b;
                                looseBoards[numLoose][2] = c;
                                numLoose ++;
                            }
                        }

                    }


                }

            }




    }

}
