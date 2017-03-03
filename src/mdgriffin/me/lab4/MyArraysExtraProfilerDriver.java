package mdgriffin.me.lab4;
import mdgriffin.me.utility.ArrayUtility;

public class MyArraysExtraProfilerDriver {

    public static void main(String[] args) {
        int arrSize = 4500;
        int[] arr = new int[arrSize];

        ArrayUtility.generateRandomIntArray(arr, arrSize, 10000);

        long insertionStartTime = System.nanoTime();
        MyArraysExtra.insertionSort(arr, arrSize);
        long insertionEndTime = System.nanoTime();

        double insertionDifference = (insertionEndTime - insertionStartTime)/1e6;

        long selectionStarTime = System.nanoTime();
        MyArraysExtra.selectionSort(arr, arrSize);
        long selectionEndTime = System.nanoTime();

        double selectionDifference = (selectionEndTime - selectionStarTime)/1e6;

        System.out.println("Insertion Difference: " + insertionDifference + "\nSelection Difference: " +  selectionDifference);
    }

}
