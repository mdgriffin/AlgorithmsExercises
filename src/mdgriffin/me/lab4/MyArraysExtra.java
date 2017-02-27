package mdgriffin.me.lab4;

import mdgriffin.me.lab3.MyArrays;

public class MyArraysExtra extends MyArrays {

    public static int linearSearch(int [] a, int currentSize, int searchKey) {
        int foundIndex = -1;
        int i = 0;
        boolean found = false;

        while (!found && i < currentSize) {
            if (a[i] == searchKey) {
                foundIndex = i;
            }
            i++;
        }

        return foundIndex;
    }

    public static int[] merge(int []a1, int left1, int right1, int []a2, int left2, int right2) {
        int mergedArrayLen = right1 - left1 + right2 - left2 + 2;
        int[] mergedArray = new int[mergedArrayLen];
        int a1Index = left1;
        int a2Index = left2;
        int i = 0;

        while (a1Index < right1 && a2Index < right2) {
            if (a1[a1Index] <= a2[a2Index]) {
                mergedArray[i++] = a1[a1Index++];
            } else {
                mergedArray[i++] = a2[a2Index++];
            }
        }

        for(; i < mergedArrayLen; i++) {
            if (a1Index <= right1) {
                mergedArray[i] = a1[a1Index++];
            } else {
                mergedArray[i] = a2[a2Index++];
            }
        }

        return mergedArray;
    }

    public static void swap (int[] a, int index1, int index2) {
        if (index1 != index2) {
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
    }

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
        return 1;
    }


}
