package hw9;

import java.util.Scanner;

//TODO Подсчитать среднюю длину слова, во введенном с клавиатуры предложении
public class Strings_task2 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите строку:");
        String userString = sc.nextLine();
        if(!userString.isEmpty()) {
            String[] wordArr = userString.split(" ");
            int wordLen = 0;
            for(String word : wordArr){
                wordLen += word.length();
            }
            System.out.println("Средняя длина слова: " + (wordLen / wordArr.length));
        } else{
            System.out.print("Строка пустая");
        }
    }
}


