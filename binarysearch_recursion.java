import java.util.*;

public class binarysearch_recursion {
    static int binarySearch(int arr[], int l, int r, int key) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key)

                return binarySearch(arr, l, mid - 1, key);

            else
                return binarySearch(arr, mid + 1, r, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 22, 44, 55, 66, 66, 77, 88 };
        int k = 166;
        int value = binarySearch(arr, 0, arr.length - 1, k);
        if (value != -1)
            System.out.println("Yes found");
        else
            System.out.println("Not found");
    }
}
