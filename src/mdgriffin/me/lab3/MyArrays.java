package mdgriffin.me.lab3;


import java.util.Arrays;

public class MyArrays {


    public static int sum (int[] arr, int arrLen) {
        int sum = 0;

        for (int i = 0; i < arrLen; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int sum (int[] arr) {
        return sum(arr, arr.length);
    }

    public static int findMax (int[] arr, int arrLen) {
        int max = arr[0];

        for (int i = 0; i < arrLen; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMax (int[] arr) {
        return findMax(arr, arr.length);
    }

    public static int findMin (int[] arr, int arrLen) {
        int min = arr[0];

        for (int i = 1; i < arrLen; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMin (int[] arr) {
        return findMin(arr, arr.length);
    }


    public static void remove (int[] arr, int arrLen, int pos) {
        for (int i = pos; i < arrLen - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void insert(int[] arr, int arrLen, int el, int pos) {
    }


}
