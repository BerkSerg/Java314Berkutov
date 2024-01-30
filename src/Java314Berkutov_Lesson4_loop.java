
import java.util.Scanner;

public class Java314Berkutov_Lesson4_loop {
    public static void main(String[] args){
        for(int i = 10; i <= 100; i++){
            //int numCount = Integer.toString(i).length();
            int numCount = (int) Math.log10(i) + 1;
            int number = i;
            int sum = 0;
            while(number > 0){
                int digit = number % 10;
                sum += Math.pow(digit, numCount);
                number /= 10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }

    }
}
