public class Java314Berkutov_lesson7 {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        System.out.println(arrays.numberA);
        System.out.println(arrays.numbers[0]);
        System.out.println(arrays.numbers.getClass().getName());
        Double dd = 0.1;
      
        System.out.println(dd.getClass().getName());
        System.out.println("")
        ;

        int[] arr5 = new int[5];

        for(int i =0; i < arr5.length; i++){
            arr5[i] = i;
        }
        for (int num : arr5) {
            System.out.println(num);
        }

    }
}

class Arrays {
    int numberA;
    int[] numbers;

    public Arrays() {
        numbers = new int[]{1, 2, 3, 4, 5};
    }
}
