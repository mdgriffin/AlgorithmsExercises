package mdgriffin.me.lab4;

import java.util.Arrays;

public class MyArraysExtraProfilerDriver {

    public static void main(String[] args) {
        int arrSize = 10000;
        int[] arr = new int[arrSize];
        int[] arr2;
        int[] arr3;
        int[] arr4;

        MyArraysExtra.generateRandomIntArray(arr, arrSize, 567);

        arr2 = arr.clone();
        arr3 = arr.clone();
        arr4 = arr.clone();

        long insertionStartTime = System.nanoTime();
        MyArraysExtra.insertionSort(arr, arrSize);
        long insertionEndTime = System.nanoTime();

        double insertionDifference = (insertionEndTime - insertionStartTime)/1e6;

        long selectionStarTime = System.nanoTime();
        MyArraysExtra.selectionSort(arr2, arrSize);
        long selectionEndTime = System.nanoTime();

        double selectionDifference = (selectionEndTime - selectionStarTime)/1e6;

        long sortStarTime = System.nanoTime();
        Arrays.sort(arr3);
        long sortEndTime = System.nanoTime();

        double sortDifference = (sortEndTime - sortStarTime)/1e6;

        long parallelSortStarTime = System.nanoTime();
        Arrays.parallelSort(arr4);
        long parallelSortEndTime = System.nanoTime();

        double parallelSortDifference = (parallelSortEndTime - parallelSortStarTime)/1e6;


        System.out.println(
            "Insertion Difference: " + insertionDifference +
            "\nSelection Difference: " +  selectionDifference +
            "\nSort Difference: " +  sortDifference +
            "\nParallel Sort Difference: " +  parallelSortDifference
        );
    }

}
