package lesson10.studentswork;

//TODO Выяснить, какой символ в строке встречается максимально часто. Результат вернуть в виде символа.
public class Strings_task2 {
    public static void main(String[] args) {
        String[] testStringArray = {
                "ABCDE This is my family",
                "GHIJ I love them every day",
                "KLMNO Mother, father, baby, oh",
                "PQRST Brother, sister, you can see",
                "UVWXYZ All the people in my family"
        };

        for (String str : testStringArray) {
            System.out.println(getMaxRepeatingChar(str));
        }
    }

    private static String getMaxRepeatingChar(String str) {
        String workString = str.toLowerCase().replaceAll("[^а-яa-z]","");

        String topChar = "";
        int topCount = 0;
        while (!workString.isEmpty()){
            int startLen = workString.length();
            String currChar = String.valueOf(workString.charAt(0));
            workString = workString.replaceAll(currChar, "");
            if (topCount < (startLen - workString.length())){
                topCount = startLen - workString.length();
                topChar = currChar;
            }
        }
        return topChar;
    }
}
