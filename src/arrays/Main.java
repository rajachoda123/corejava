package arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] mainArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chunkSize = 3;

        List<int[]> subArrays = new ArrayList<>();
        List strList = new ArrayList<>();
        for (int i = 0; i < mainArray.length; i += chunkSize) {
            int endIndex = Math.min(i + chunkSize, mainArray.length);
            int[] subArray = new int[endIndex - i];
            System.arraycopy(mainArray, i, subArray, 0, endIndex - i);
            subArrays.add(subArray);
        }

        for (int[] subArray : subArrays) {
            for (int num : subArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
