public class ControlTest2{

    public static void main(String[] args) {

        for (int i = 0; i < 1001; i++) {
            if ((i%3 == 0) & (i%5 != 0) & (sumNumbers(i) < 10)) {
                    System.out.println(i);
            }
        }
    }
    public static int sumNumbers(int a) { // функция нахождения суммы цифр числа
        int sum = 0;
        while (a != 0) {
            sum += a%10;
            a = a/10;
        }
        return sum;
    }
}
