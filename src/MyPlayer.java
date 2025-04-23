import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];


        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        //toColums();
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
                            for(c1 = c - 1; c1 >= 0; c1 --){
                                System.out.print(a);
                                System.out.print(b);
                                System.out.print(c1);
                                System.out.println("");

                            }
                            for(b1 = b - 1; b1 >= 0; b1 --){
                                System.out.print(a);
                                System.out.print(b1);
                                System.out.print(c1);
                                System.out.println("");
                            }
                            for(a1 = a - 1; a1 >= 0; a1 --){
                                System.out.print(a1);
                                System.out.print(b1);
                                System.out.print(c1);
                                System.out.println("");
                            }
                        }

                    }


                }
                //System.out.println(chipsinCol);
                chipsinCol = 0;
                //System.out.println("Next Board");

                //make a list of loose boards --- if any resulting board equals a loose board then I know it can be a win board -- if all resulting boards are win boards it is a loose board --- 100 is a loose board

            }




    }

}
