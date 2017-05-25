package mdgriffin.me.lab4;

import mdgriffin.me.lab3.MyArrays;

import java.util.Random;

public class MyArraysExtra extends MyArrays {

    public static int linearSearch(int [] a, int currentSize, int searchKey) {
        int foundIndex = -1;
        int i = 0;
        boolean found = false;

        while (!found && i < currentSize) {
            if (a[i] == searchKey) {
                foundIndex = i;
                found = true;
            }
            i++;
        }

        return foundIndex;
    }

    /**
     * Merges Two Sorted Arrays
     *
     * @param a1       The first array
     * @param left1    The beginning index of the first array
     * @param right1   The end index of the first array
     * @param a2       The second array
     * @param left2    The beginning index of the second array
     * @param right2   The end index of the second array
     * @return         A merged sorted array containing all the element from the provided arrays
     */

    public static int[] merge(int []a1, int left1, int right1, int []a2, int left2, int right2) {
        int mergedArrayLen = right1 - left1 + right2 - left2 + 2;
        int[] mergedArray = new int[mergedArrayLen];
        int a1Index = left1;
        int a2Index = left2;
        int i = 0;

        // keep loop until at end of both arrays
        while (a1Index < right1 && a2Index < right2) {
            // check which array contains the next smallest element
            if (a1[a1Index] <= a2[a2Index]) {
                mergedArray[i++] = a1[a1Index++];
            } else {
                mergedArray[i++] = a2[a2Index++];
            }
        }

        // if not all the element have been added from one array
        // loop over them until they have all been added
        for(; i < mergedArrayLen; i++) {
            if (a1Index <= right1) {
                mergedArray[i] = a1[a1Index++];
            } else {
                mergedArray[i] = a2[a2Index++];
            }
        }

        return mergedArray;
    }

    /**
     * Swaps to elements in an array with each other
     *
     * @param a       The array containing the elements to swap
     * @param index1  The index of the first element
     * @param index2  The index of the second element
     */

    public static void swap (int[] a, int index1, int index2) {
        if (index1 != index2) {
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
    }

    /**
     * Finds the index of the smallest element in an array
     *
     * @param arr          The array to search
     * @param arrLen       The length of the array
     * @param startIndex   The index to start searching for
     * @return             The index of the smallest index
     */

    public static int findMinIndex (int[] arr, int arrLen, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < arrLen; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    /**
     * Overload of the findMinIndex method, check the entire array
     *
     * @param arr   The array to search over
     * @return
     */

    public static int findMinIndex (int[] arr) {
        return findMinIndex(arr, arr.length, 0);
    }

    public static void selectionSort(int [] a, int currentSize) {
        for  (int currentIndex = 0; currentIndex < a.length; currentIndex++) {
            swap(a, currentIndex, findMinIndex(a, a.length, currentIndex));
        }
    }

    public static void insertionSort(int [] a, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            int j = i;

            while (j > 0 && a[j] < a[j - 1]) {
                swap(a, j - 1, j);
                j--;
            }
        }
    }

    public static int binarySearch(int [] a, int currentSize, int searchKey) {
        int lower = 0;
        int upper = currentSize;
        int index = (lower + upper) / 2;
        boolean found = false;

        while (!found && lower <= upper) {
            if (a[index] == searchKey)  {
                found = true;
            } else {
                if (a[index] > searchKey) {
                    upper = index - 1;
                } else {
                    lower = index + 1;
                }
                index = (lower + upper) / 2;
            }
        }

        if (found == true) {
            return index;
        } else {
            return -1;
        }
    }

    public static int binarySearch(String [] a, int currentSize, String searchKey) {
        int lower = 0;
        int upper = currentSize;
        int index = (lower + upper) / 2;
        boolean found = false;

        while (!found && lower <= upper) {
            String currentEl = a[index];

            if (currentEl.equals(searchKey))  {
                found = true;
            } else {
                if (a[index].compareTo(searchKey) > 0) {
                    upper = index - 1;
                } else {
                    lower = index + 1;
                }
                index = (lower + upper) / 2;
            }
        }

        if (found == true) {
            return index;
        } else {
            return -1;
        }
    }

    public static void generateRandomIntArray (int[] arr, int numElements, int seed) {
        Random rnd = new Random(seed);

        for (int i = 0; i < numElements; i++) {
            arr[i] = rnd.nextInt();
        }
    }

}
