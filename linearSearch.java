
public class linearSearch {
    static void LinearSearch(int arr[], int key) {
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == key) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Yes found");
        else
            System.out.println("Not found");

    }

    public static void main(String[] args) {
        int[] arr = { 22, 44, 55, 66, 66, 77, 88 };
        LinearSearch(arr, 166);
        System.out.println();
        LinearSearch(arr, 66);

    }
}
