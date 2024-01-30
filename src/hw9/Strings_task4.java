package hw9;

import java.util.Scanner;

//TODO 4)	Пользователь вводит с клавиатуры любую строку. Поменять в исходной строке все большие буквы
// на маленькие, а маленькие – на большие. Если в строке присутствуют цифры, заменить на символ
// подчеркивания и вывести результат на консоль.

public class Strings_task4 {
    final static Scanner sc = new Scanner(System.in);
    final static String NUMBERS = "0123456789";

    public static void main(String[] args) {
        System.out.print("Введите строку:");
        String userString = sc.nextLine();
        if(!userString.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < userString.length(); i++) {
                String cChar = String.valueOf(userString.charAt(i));
                if (NUMBERS.contains(cChar)) {
                    sb.append("_");
                    continue;
                }
                if (cChar.equals(cChar.toLowerCase())){
                    sb.append(cChar.toUpperCase());
                } else {
                    sb.append(cChar.toLowerCase());
                }
            }
            System.out.println(sb);
        } else {
            System.out.print("Строка пустая");
        }
    }
}
