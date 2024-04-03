import java.util.Scanner;
import java.util.Arrays;

public class ControlPaper3 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива:");
        int n = new Scanner(System.in).nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        Arrays.sort(arr);
        int l = 1;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    k++;
            }
            if (k > l) {
                l = k;
                index = i;
            }
            if (l > (arr.length/2)){
                System.out.println(arr[index]);
                System.exit(0);
            }
        }
        System.out.println("-1");

    }
}
