package hw9;

import java.util.Scanner;

//TODO 3)	Ввести строку с клавиатуры (латиницей). Из введенной строки выбрать все слова, начинающиеся
// на гласные буквы и заканчивающиеся на согласные. Вывести отобранные слова на консоль.
public class Strings_task3 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите строку:");
        String userString = sc.nextLine().replaceAll("[^а-я,А-Я\\s]", "");
        if(!userString.isEmpty()) {
            final String oddChars = "аоуыэяёюиеАОУЫЭЯЁЮИЕ";
            String[] wordArr = userString.split(" ");
            for(String word : wordArr){
                String first = String.valueOf(word.charAt(0));
                String last =  String.valueOf(word.charAt(word.length() - 1));
                if(oddChars.contains(first) && !oddChars.contains(last)){
                    System.out.println(word);
                }
            }
        } else{
            System.out.print("Строка пустая");
        }
    }
}
