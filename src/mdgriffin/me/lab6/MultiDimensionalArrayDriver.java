package mdgriffin.me.lab6;

public class MultiDimensionalArrayDriver {
    public static void main(String[] args) {
        int[][] edgedArr = {
            {-1, -1, -1, -1},
            {-1, 0, 0, -1},
            {-1, 0, 0, -1},
            {-1, -1, -1, -1}
        };

        System.out.println(MultiDimensionalArrays.tablePrint(edgedArr, 4, 4));
    }
}
