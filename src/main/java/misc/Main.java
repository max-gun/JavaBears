package misc;

public class Main {



    public static void main(String[] args) {
        int[][] myArr = createChessBoard();
        print2DArray(myArr);
        System.out.print('\u2588');
        System.out.print(' ');
    }

    public static int[][] createChessBoard(){
        int[][] chessBoard = new int[8][8];

        for (int i=0; i < chessBoard.length; i++){
            for (int j=0; j < chessBoard[i].length; j++){
                chessBoard[i][j] = (i+j)%2 == 0 ? 1 : 0;
            }
        }

        return chessBoard;
    }

    public static void printArray(int[] arr){ //O(n)
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void print2DArray(int[][] arr) { //O(n^2)
        for(int i=0; i < arr.length; i++){ //O(n)
            printArray(arr[i]);
            System.out.println();
        }
    }
}