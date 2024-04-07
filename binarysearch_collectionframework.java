import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class binarysearch_collectionframework {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(27);
        list.add(28);
        int k = Collections.binarySearch(list, 125);
        if (k >= 0)
            System.out.println("Yes found");
        else
            System.out.println("Not found");
    }
}
