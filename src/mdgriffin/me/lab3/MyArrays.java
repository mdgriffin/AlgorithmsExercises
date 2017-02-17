package mdgriffin.me.lab3;

import java.util.Arrays;

/**
 * Utility Class that provides useful Array methods
 */

public class MyArrays {

    /**
     * Sums an int array
     * @param arr The array to sum
     * @param arrLen  The length of the array
     * @return An int of the sum of the array
     */

    public static int sum (int[] arr, int arrLen) {
        int sum = 0;

        for (int i = 0; i < arrLen; i++) {
            sum += arr[i];
        }

        return sum;
    }

    /**
     * Overloads sum to handle cases where length is no provided
     * Assumes length is the length of the array
     * @param arr The array to sum
     * @return An int sum of the array
     */

    public static int sum (int[] arr) {
        return sum(arr, arr.length);
    }

    /**
     * Finds the largest numbest in an array
     * @param arr The arr to find the largest number in
     * @param arrLen The length of the array
     * @return The largest number in the array
     */

    public static int findMax (int[] arr, int arrLen) {
        int max = arr[0];

        for (int i = 1; i < arrLen; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * Overloads the findMax method when no length is provided
     * Passes the array length
     * @param arr The array to find the largest number of
     * @return The largest number in the array
     */

    public static int findMax (int[] arr) {
        return findMax(arr, arr.length);
    }

    /**
     * Finds the largest smallest in an array
     * @param arr The arr to find the smallest number in
     * @param arrLen The length of the array
     * @return The smallest number in the array
     */

    public static int findMin (int[] arr, int arrLen) {
        int min = arr[0];

        for (int i = 1; i < arrLen; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    /**
     * Overloads the findMin method when no length is provided
     * Passes the array length
     * @param arr The array to find the smallest number of
     * @return The smallest number in the array
     */

    public static int findMin (int[] arr) {
        return findMin(arr, arr.length);
    }

    /**
     * Removes
     * @param arr The arr to remove an element from
     * @param arrLen The length of the array
     * @param pos The position to remove from
     * @return The new length of the array
     */

    public static int remove (int[] arr, int arrLen, int pos) {
        for (int i = pos; i < arrLen - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return --arrLen;
    }

    /**
     * Removes
     * @param arr The arr to add an element to
     * @param arrLen The length of the array
     * @param pos The position to add to
     * @return The new length of the array
     */

    public static int insert(int[] arr, int arrLen, int el, int pos) {
        if (arr.length > arrLen) {
            for (int i = arrLen; i > pos; i--) {
                arr[i] = arr[i - 1];
            }

            arr[pos] = el;
            arrLen++;
        }

        return arrLen;
    }

}
