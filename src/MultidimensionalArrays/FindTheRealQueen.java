package MultidimensionalArrays;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rowsAndCols = 8;
        char[][] matrix = new char[rowsAndCols][rowsAndCols];

        for (int i = 0; i < matrix.length; i++) {
            char[] arr = scan.nextLine().replaceAll(" ", "").
                    toCharArray();

            matrix[i] = arr;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                char currentSymbol = matrix[row][col];
                if (currentSymbol == 'q') {
                    checkIfIsRealQueen(matrix, row, col);
                    if(checkIfIsRealQueen(matrix, row, col)){
                        System.out.println(row + " " + col);
                        break;
                    }
                }
            }
        }
    }

    private static boolean checkIfIsRealQueen(char[][] matrix, int currentRow, int currentCol) {
        if(!HorizontalLine(matrix, currentRow, currentCol) || !VerticalLine(matrix, currentRow, currentCol)){
            return false;
        }
        return  true;
    }

    private static boolean VerticalLine(char[][] matrix, int currentRow, int currentCol) {
        int queenCounter = 0;

        for (int row = 0; row <matrix.length; row++) {
            char currentSymbol = matrix[row][currentCol];
            if (currentSymbol == 'q') {
                queenCounter++;
            }
        }
        return queenCounter < 2;
    }

    private static boolean HorizontalLine(char[][] matrix, int currentRow, int currentCol) {
        int queenCounter = 0;

        for (int col = 0; col < matrix[currentRow].length; col++) {
            char currentSymbol = matrix[currentRow][col];
            if (currentSymbol == 'q') {
                queenCounter++;
            }
        }
        return queenCounter < 2;
    }
}
