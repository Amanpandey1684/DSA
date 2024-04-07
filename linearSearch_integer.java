import java.util.Scanner;

public class linearSearch_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enetr the element you want to find: ");
        int ele = sc.nextInt();
        int flag = 0, index = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (ele == arr[i]) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Found at index" + index);
        else
            System.out.println("not found");
    }

}