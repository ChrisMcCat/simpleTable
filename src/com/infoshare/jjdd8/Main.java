package com.infoshare.jjdd8;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {



    public static int[] getSquares(int size) {
        int[] squares = new int[size];

        for (int i = 0; i < size; i++) {
            squares[i] = getSquare(i);
        }
        return squares;
    }

    private static int getSquare(int i) {
        return i * i;
    }

    public static void main(String[] args) {
        int[] square = {0, 1, 2, 4, 9, 12, 25, 36, 49};
        System.out.println(square[8]);

        int[] squares = getSquares(5);

        System.out.println(Arrays.toString(squares));
    }

    };

    /**
    public static int[] getSquare(int size) {
        int[] squares = new int[size];

        for (int i = 0; i < size; i++) {
            squares[i] = getSquare(i);
        }
        return squares;
    }

    private static int getSquare(int i){
        return i*i;
    };
     **/


