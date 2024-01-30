package hw10;


//TODO Задание 7. Палиндром
// Дано предложение, состоящее только из строчных латинских букв. Проверьте, являются ли слова в предложении
// палиндромом. Выведите YES или NO
public class Recurs_task7 {

    public static void main(String[] args) {
        String testString = "never odd or even";
        String clearString = testString.toLowerCase().replaceAll("[^а-я,a-z]", "");
        System.out.println(testPalindrome(clearString, 0));
        System.out.println(testPalindrome("radar", 0));
        System.out.println(testPalindrome("yes", 0));

    }

    private static boolean testPalindrome(String clearString, int index) {
        if (index == clearString.length() / 2) {
            return true;
        }
        if(clearString.charAt(index) == clearString.charAt(clearString.length() - 1 - index)){
            return testPalindrome(clearString, ++index);
        } else {
            return false;
        }


    }
}
