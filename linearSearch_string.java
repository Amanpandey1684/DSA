import java.util.Scanner;

public class linearSearch_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        String s[] = new String[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        System.out.print("Enter the element you want to find: ");
        String cr = sc.next();
        int flag = 0, index = 0;
        for (int i = 0; i < n; i++) {
            if (cr.equals(s[i])) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Found at index " + index);
        else
            System.out.println("Not found");
    }
}