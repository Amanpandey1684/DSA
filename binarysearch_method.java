import java.util.Arrays;

public class binarysearch_method {
    public static void main(String[] args) {
        int[] arr = { 22, 44, 55, 66, 66, 77, 88 };
        int k = 66;
        int value = Arrays.binarySearch(arr, k);
        if (value >= 0)
            System.out.println("Yes found");
        else
            System.out.println("Not found");
    }
}
