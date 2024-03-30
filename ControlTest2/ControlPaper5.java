import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlPaper5 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов:");
        int n = new Scanner(System.in).nextInt();
        int[] numbs = new int[n];
        for (int i = 0; i < numbs.length; i++) {
            System.out.println("Введите число:");
            numbs[i] = new Scanner(System.in).nextInt();
        }
        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        for (int x : numbs){
            if(!arr.contains(x)){
                arr.add(x);
            }
        }

        for (int i = 0; i < numbs.length; i++) {
            if(!arr.contains(i)){
                arr2.add(i);
            }
        }
        System.out.println(arr2);
    }
}
