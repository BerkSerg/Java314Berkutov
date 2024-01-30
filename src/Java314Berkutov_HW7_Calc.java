public class Java314Berkutov_HW7_Calc {
    public static void main (String[] args){
        Calculator calculator = new Calculator(13.5, 7  );
        System.out.println(calculator.getAmount());
        System.out.println(calculator.getSubtraction());
        System.out.println(calculator.getMultiply());
        try {
            System.out.println(calculator.getDivision());
            calculator.setNewNumbers(4, 0);
            System.out.println(calculator.getDivision());
        }catch (NumberFormatException e){
            System.out.println(e);
        }

    }
}

class Calculator{
    double numberA;
    double numberB;

    public Calculator(double numberA, double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void setNewNumbers(double numberA, double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getAmount(){
        return numberA + numberB;
    }

    public double getSubtraction(){
        return numberA - numberB;
    }

    public double getMultiply(){
        return numberA * numberB;
    }

    public double getDivision() throws NumberFormatException {
        if(numberB == 0){
            throw new NumberFormatException("Деление на ноль недопустимо в данной реализации");
        }
        return numberA / numberB;
    }


}