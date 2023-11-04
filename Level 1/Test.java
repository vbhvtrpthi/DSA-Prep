import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[5][5];
        printKT(arr, 2, 0, 1);
        scn.close();
    }

    public static void displayArr(int[][] arr) {
        
        System.out.println(Arrays.deepToString(arr));
    }

    public static void printKT(int[][] arr, int sr, int sc, int cval) {
        if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || cval != 0) {
            return;
        }
        if (cval == arr.length * arr[0].length) {
            displayArr(arr);
        }

        arr[sr][sc] = cval;
        printKT(arr, sr - 2, sc + 1, cval + 1);
        arr[sr][sc] = 0;

    }
}