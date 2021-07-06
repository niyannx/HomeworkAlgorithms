public class Matrix {

    public static int number = 5;
    public static int row = number;
    private static int col = number;


    public static void main (String[]args){
        int [][] STAT = new int[row][col];

        MemSet(STAT);

        System.out.println("Tracks: " + recurse(row - 1, col - 1, STAT));

        PrintArrays(STAT);
    }

    private static int recurse ( int remRow, int remCol, int[][] STAT){
        if (remRow == 0 || remCol == 0) {
            return 1;
        }
        if (STAT[remRow][remCol] != 0){
            return STAT[remRow][remCol];
        }

        int answer = 0;

        answer = answer + recurse(remRow - 1, remCol, STAT);
        answer = answer + recurse(remRow, remCol - 1, STAT);

        return STAT[remRow][remCol] = answer;
    }




    private static void PrintArrays ( int[][] STAT){
        System.out.println("Routes: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.printf("[%d]", STAT[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void MemSet ( int[][] STAT){
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                STAT[r][c] = 0;
            }
        }
    }
}