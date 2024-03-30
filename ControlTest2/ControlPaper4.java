import java.util.Scanner;

public class ControlPaper4 {
    public static void main(String[] args) {
        int [] powerOfNumbTwo = new int [31];
        int number = new Scanner(System.in).nextInt();
        boolean bool = false;
        for (int i = 0; i < powerOfNumbTwo.length; i++) {
            powerOfNumbTwo[i] = (int) Math.pow (2, i);

            if(number == powerOfNumbTwo[i]){
                bool = true;
            }
        }
        System.out.println(bool);
    }
}
