package mdgriffin.me.utility;

public class ArrayUtility {

    public static void generateRandomIntArray (int numElements, int[] arr, int range) {
        for (int i = 0; i < numElements; i++) {
            arr[i] = (int) Math.ceil(Math.random() * range);
        }
    }

}
