public class LinearSearch2_boolean {
    static void LinearSearch(String[] arr, String key) {
        boolean flag = false;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(key) == 0) {
                flag = true;
                // System.out.println("Found at index:-"+ i);
                break;
            }
        }
        if (flag == true) {
            System.out.println("Found at index: " + i);
        } else {
            System.out.println("Not found");
        }

    }

    public static void main(String[] args) {
        String[] arr = { "Aman", "Raman", "Amit", "Rekha", "Riya", "Ruchi", "Diya", "Devanshi", "Shubham", "Ankit" };
        LinearSearch(arr, "Amit");
    }
}
