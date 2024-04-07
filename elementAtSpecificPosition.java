import java.util.Scanner;

public class elementAtSpecificPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the m ");
        int m = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int ele, pos;
        System.out.println("Enter the element: ");
        ele = sc.nextInt();
        System.out.println("Enter the specific position: ");
        pos = sc.nextInt();
        for (int j = m - 1; j >= pos; j--)
            arr[j + 1] = arr[j];

        arr[pos] = ele;
        m++;
        for (int i = 0; i < m; i++)
            System.out.print(arr[i] + " ");

    }
}
