import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ControlTest1 {
    public static void main(String[] args) {

        int arrSize = new Scanner(System.in).nextInt(); // данный int задает длину массива
        int[] nums = new int[arrSize]; // создаем массив

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(0,100); //заполняем массив
        }

        Arrays.sort(nums); // сортировка массива по возрастанию

        int target = new Scanner(System.in).nextInt(); // создаем число,с которым сравниваем элементы массива

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>target | nums[i]==target){ //этот if проверяет, если число меньше или равно элементу массива то выводит ту позицию, где он будет стоять
                System.out.println(i);
                break;
            }else { // если число больше последнего элемента, то выводит позицию после последнего элемента
                System.out.println(arrSize+1);
                break;
            }
        }

    }
}
