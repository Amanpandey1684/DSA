
import java.util.*;

public class binarysearch_loop {
    public static int binarySearch(int arr[], int key) {
        int l = 0, mid;
        int r = arr.length - 1;
        int flag = 0;
        int count = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == key) {
                flag = 1;
                count++;
                int i = mid - 1;
                while (i >= l && arr[i] == key) {
                    count++;
                    i--;
                }

                i = mid + 1;
                while (i <= r && arr[i] == key) {
                    count++;
                    i++;
                }

                return count;
            }
            if (arr[mid] > key) {

                r = mid - 1;

            } else {
                l = mid + 1;

            }
        }
        if (flag == 1)
            System.out.println("Yes found");
        else
            System.out.println("Not found");
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 22, 44, 55, 66, 66, 77, 88 };
        int k = 66;
        System.out.println("Number of occurrences of " + k + ": " + binarySearch(arr, k));
    }
}
