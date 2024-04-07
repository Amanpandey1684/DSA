import java.util.Arrays;

public class binarySearch_method_String {
	public static void main(String[] args) {
		// boolean flag=false;
		String[] arr = { "Aman", "baman", "cmit", "dekha", "eiya", "foke", "giya", "hevanshi", "ihubham", "jnkit" };
		String name = "pjnkit";
		int value = Arrays.binarySearch(arr, name);
		if (value >= 0)

			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}
