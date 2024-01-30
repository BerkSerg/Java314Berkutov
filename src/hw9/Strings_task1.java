package hw9;

import java.util.Scanner;

//TODO Ввести с клавиатуры строку текста, а затем один символ. Показать на консоль индексы и количество
// совпадений (ищем вхождения символа в строку). В случае если совпадений не найдено, вывести соответствующий
// текст.
public class Strings_task1 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите строку:");
        String userString = sc.nextLine();
        if(userString.isEmpty()) {
            System.out.print("Строка пустая");
            return;
        }
        System.out.print("Введите символ для поиска:");
        String oneChar = sc.nextLine();
        if(oneChar.length() != 1) {
            System.out.print("Строка пустая");
            return;
        }
        int count = 0;
        String indexes = "";
        int index = userString.indexOf(oneChar);
        while (index > 0){
            indexes += (count++ > 0 ) ? ", "+ index : index;
            index = userString.indexOf(oneChar, ++index);
        }

        if(count > 0 ) {
            System.out.println("Количество совпадений: " + count + ". По индексам:" + indexes);
        } else {
            System.out.println("Совпадений не найдено");
        }
    }
}
