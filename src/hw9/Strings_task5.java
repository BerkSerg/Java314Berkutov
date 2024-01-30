package hw9;

import java.util.Arrays;

//TODO 5)	Написать программу, проверяющую является ли одна строка анаграммой для другой строки
// (строка может состоять из нескольких слов и символов пунктуации). Пробелы и пунктуация должны
// игнорироваться при анализе. Разница в больших и маленьких буквах должна игнорироваться.
public class Strings_task5 {
    public static void main(String[] args) {
        String[] firstArr = {"Краб", "топор", "короб", "Бокал"};
        String[] secondArr = {"рак и барак", "рапорт", "Рок-н-Рол был", "колба"};

        for (int i = 0; i < 4; i++) {
            String[] word1 = firstArr[i].toLowerCase().replaceAll("[^а-я]", "").split("");
            String[] word2 = secondArr[i].toLowerCase().replaceAll("[^а-я]", "").split("");
            Arrays.sort(word1);
            Arrays.sort(word2);

            boolean isAnagram = true;
            int prevIndex = 0;
            for (String s1 : word1) {
                boolean wasFind = false;
                for (int j = prevIndex; j < word2.length; j++) {
                    if (s1.equals(String.valueOf(word2[j]))) {
                        prevIndex = ++j;
                        wasFind = true;
                        break;
                    }
                }
                if (!wasFind) {
                    isAnagram = false;
                }
            }
            if (isAnagram) {
                System.out.printf("Строка '%s' является анаграмой для строки '%s'\n", secondArr[i], firstArr[i]);
            } else {
                System.out.printf("Строка '%s' не является анаграмой для строки '%s'\n", secondArr[i], firstArr[i]);
            }
        }
    }
}
