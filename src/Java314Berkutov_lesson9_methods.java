public class Java314Berkutov_lesson9_methods {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //System.out.println(intLine(3));
        //System.out.println(intLineNoRec(3));
        //System.out.println(sumDigit(1234));
        //System.out.println(sumDigitRec(1234));

    }



    //вычисление факториала
    static int factorial(int n){
        if (n < 1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }

    //собрать строку из целых чисел от 0 до n
    private static String intLine (int n){
        if(n == 0){
            return "0";
        }
        return String.format("%s, %s", intLine(n -1), n);
    }

    private static String intLineNoRec (int n){
        String buffer = "";
        for(int i = 0; i < n; i++){
            buffer = String.format("%s, %s", n - i, buffer );
        }
        return buffer;
    }

    //вычислить сумму цифр
    private static int sumDigit(int n){
        if(n < 10) return n;
        int summ = 0;
        while (n > 10){
            int rest = n % 10;
            n = n / 10;
            summ += rest;
        }
        summ += n;
        return summ;
    }

    private static int sumDigitRec(int n){
        return (n < 10) ? n : n % 10 + sumDigitRec(n / 10);
    }
}
