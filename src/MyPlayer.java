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
        toColums();
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
        System.out.println("PRINTING FROM ARRAY");
        for(int z = 0; z < columns.length; z++) {
            System.out.println(columns[z]);
        }


    }

}
