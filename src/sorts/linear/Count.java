package sorts.linear;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        //int[] array = {-7, 60, 7, -4, 23, 53, 15, -4 -15, -4, 6, 0};
        int[] array = {7, 6, 7, 4, 23, 13, 15, 4, 5, 4, 6, 2};
        countSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void countSort(int[] array){
        int[] minMax = getMinMax(array);
        int[] bucket = getBucket(array, minMax[0], minMax[1]);
        transform(array, bucket, minMax[0]);
    }

    private static int[] getBucket(int [] array, int min, int max){
        int[] bucket = new int[max - min + 1];
        for (int x : array){
            bucket[x - min]++;
        }
        return bucket;
    }

    private static void transform(int[] array, int[] bucket, int min){
        int index = 0;
        for(int i =0; i < bucket.length; i++){
            for(int j = bucket[i]; j > 0; j--){
                array[index] =  i + min;
                index++;
            }
        }
    }

    private static int[] getMinMax(int[] array){
        int[] minMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for(int x : array){
            if(x < minMax[0] ){
                minMax[0] = x;
            }
            if(x > minMax[1] ){
                minMax[1] = x;
            }
        }
        return minMax;
    }
}
