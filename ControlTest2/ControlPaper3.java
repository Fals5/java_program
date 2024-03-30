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
        int k =1;
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == arr[i+1]){
                k++;
            }

            else{
                k=1;
            }

            if (k>=(n/2)){
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
