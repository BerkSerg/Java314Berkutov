package lesson10.studentswork;


//TODO 1) Оставить в строке только один экземпляр каждого встречающегося символа. Результат вернуть
public class Strings_task1 {
    public static void main(String[] args) {
        String testString = "А роза упала на лапу Азора";
        String myString = testString.toLowerCase().replaceAll("[^а-я]","");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            String symbol = String.valueOf(myString.charAt(i));
            if(sb.indexOf(symbol) > -1) {
                continue;
            }
            sb.append(symbol);
        }
        System.out.println(sb);
    }
}
