import java.util.Scanner;

public class search_specific_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element: ");
        int ele = sc.nextInt();
        int flag = 0, index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == ele) {
                flag = 1;
                index = j;
                break;
            }

        }
        if (flag == 1) {
            System.out.print("element found:" + index);
        } else {
            System.out.print("element not found");
        }
    }
}