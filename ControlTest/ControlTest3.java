import java.util.Scanner;

public class ControlTest3 {

    public static String longestPrefix (String[] str){  //метод по поиску префикса
        if (str.length == 0) {  //если длина массива 0 выводит пустую строку
            return "";
        }
        if (str.length == 1) { // если длина массива равна 1 то выводит слово, т.к. оно единственное и не с чем сравнивать
            return str[0];
        }

        String prefix = str[0]; //делаем префикс первым словом
        for (int i = 1; i < str.length; i++) {
            String current = str[i]; // элемент с которым сравниваем
            int find = 0;
            int lastCommon = 0;
            while (find < prefix.length() && find < current.length()) { //не выходит за длину элемента
                if (prefix.charAt(find) == current.charAt(find)) { //сравнивает символы на позиции (find)
                    lastCommon++; //если испольняется то длина префикса увеличивается на 1
                } else {
                    break; //если символы на одной и той же позиции не совпадают, переходим к другому слову
                }
                find++;
            }
            prefix = prefix.substring(0, lastCommon); // префикс, который был равен первому слову "режем" до того символа, который является последним общим в 2 словах
        }
        return prefix; //возврат префикса
    }


    public static void main(String[] args) {

        System.out.println("Введите число:");
        int arrayLenght = new Scanner(System.in).nextInt(); //задаем длину массива
        String[] arr = new String[arrayLenght];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите слово");
            arr[i] = new Scanner(System.in).nextLine(); //наполняем массив через сканнер
        }
        System.out.println(" ");
        System.out.println("Префикс: "+longestPrefix(arr)); //использование метода
    }
}

