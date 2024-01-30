package sorts.log;

import java.util.Arrays;

//O(n*log(n))
public class Merge {
    public static void main(String[] args) {
        int[] array = {-7, 60, 7, -4, 23, 53, 15, -4 -15, -4, 6, 0};
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int startIndex, int endIndex){
        if(startIndex < endIndex) {
            int mid = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, mid);
            mergeSort(array, mid + 1, endIndex);
            mergeArrays(array, startIndex, mid, endIndex);
        }
    }

    private static void mergeArrays(int[] array, int startIndex, int midIndex, int endIndex){
        int[] leftPart = getPart(array, startIndex, midIndex);
        int[] rightPart = getPart(array, midIndex + 1, endIndex);
        int[] result = mergeParts(leftPart, rightPart);
        System.arraycopy(result,0, array, 0, result.length);
    }

    private static int[] mergeParts(int[] leftPart, int[] rightPart) {
        int iLeft = 0;
        int iRight = 0;
        int[] result = new int[leftPart.length + rightPart.length];

        while(iLeft < leftPart.length && iRight < rightPart.length){
            if(leftPart[iLeft] < rightPart[iRight]){
                result[iLeft + iRight] = leftPart[iLeft];
                iLeft++;
            } else {
                result[iLeft + iRight] = rightPart[iRight];
                iRight++;
            }

        }
        if(iLeft == leftPart.length){
            result[iLeft + iRight ]=rightPart[iRight];
        } else {
            result[iLeft + iRight]=leftPart[iLeft];
        }
        return result;
    }

    private static int[] getPart(int[] array, int startIndex, int endIndex){
        int[] part = new int[endIndex - startIndex + 1];
        System.arraycopy(array, startIndex, part, 0, part.length - 1);
        return part;
    }


}
