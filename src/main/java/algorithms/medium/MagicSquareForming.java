package algorithms.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//HackerRank
//We define a magic square to be an n matrix of distinct positive integers from 1 to n^2 where the sum of any row, column, or diagonal of length n is always equal to the same number: the magic constant.
//
//You will be given a 3x3 matrix s of integers in the inclusive range [1,9]. We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b|. Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
//
//Note: The resulting magic square must contain distinct integers in the inclusive range .


public class MagicSquareForming {
	static int formingMagicSquare(int[][] s) {
        int[][][] magicSquares = new int[][][]{
            {{8, 1, 6},{3, 5, 7},{4, 9, 2}},
            {{6, 1, 8},{7, 5, 3},{2, 9, 4}},
            {{4, 9, 2},{3, 5, 7},{8, 1, 6}},
            {{2, 9, 4},{7, 5, 3},{6, 1, 8}},
            {{8, 3, 4},{1, 5, 9},{6, 7, 2}},
            {{4, 3, 8},{9, 5, 1},{2, 7, 6}},
            {{6, 7, 2},{1, 5, 9},{8, 3, 4}},
            {{2, 7, 6},{9, 5, 1},{4, 3, 8}},
        };
        int minSolution = 100;
        int points=0;
        for (int magicSquare = 0; magicSquare < 8; magicSquare++) {
            for (int i = 0; i < 3 ; i++) {
                for (int j = 0; j < 3 ; j++) {
                    points += Math.abs(magicSquares[magicSquare][i][j] - s[i][j]);
                }
            }
            if (points < minSolution){
                minSolution = points;
            }
        points = 0;
        }
        return minSolution;

    }
}
