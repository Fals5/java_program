import java.util.Scanner;

public class ControlPaper1 {
    public static void main(String[] args) {
        int notIn = -1;
        System.out.println("Введите haystack:");
        String haystack = new Scanner(System.in).nextLine();
        System.out.println("Введите needle:");
        String needle = new Scanner(System.in).nextLine();

        for (int i = 0; i <= haystack.length()-1; i++) {
            if (haystack.charAt(i) == needle.charAt(0))
                if (haystack.substring(i, needle.length()+i).equals(needle)) {
                    System.out.println(i);
                    System.exit(0);
                }
        }
        System.out.println(notIn);
    }

}
