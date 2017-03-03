package mdgriffin.me.utility;

public class ArrayUtility {

    public static void generateRandomIntArray (int[] arr, int numElements, int range) {
        for (int i = 0; i < numElements; i++) {
            arr[i] = (int) Math.ceil(Math.random() * range);
        }
    }

}
