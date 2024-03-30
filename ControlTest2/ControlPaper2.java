import java.util.Scanner;
import java.util.Arrays;

public class ControlPaper2 {
    public static void main(String[] args) {
        System.out.println("Введите максимальное количество строк треугольника:");
        int numRows = new Scanner(System.in).nextInt();
        int[][] triangle = new int [numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if (j != 0 && j != i) {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
                else
                    triangle[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(triangle));
    }
}
