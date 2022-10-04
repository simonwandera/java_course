package com.StringsAssignment;

public class StringsAndfor {

    public static void main(String[] args) {

        int MAX_ROWS = 5;
        int MAX_COLS = 4;
        int NUM = 1;


        for(int row = 0; row<MAX_ROWS; row ++){
            for( int col = 0; col <= row; col ++){
                System.out.print(NUM);
            }
            System.out.println();
            NUM = NUM +1;
        }

        int NUM1 = 5;

        for(int row = 0; row<MAX_ROWS; row ++){
            for( int col = 0; col <= (MAX_ROWS - row -1) ; col ++){
                System.out.print(NUM1);
            }
            System.out.println();
            NUM1 = NUM1 -1;
        }

        int MAX_r = 5;
        int MAX_c = 9;
        int midpoint = 9/2;
        int VAL = 9;
        for(int row = 0; row<MAX_r; row ++){
            for( int col = 0; col < midpoint ; col ++){
                System.out.print(" ");
            }
            for (int s = 0; s < VAL; s++){
                System.out.print(VAL);
            }
            System.out.println();
            VAL = VAL -2;
            midpoint = midpoint + 1;
        }


    }
}
