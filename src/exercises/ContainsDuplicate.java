package exercises;

//217 easy
import java.util.ArrayList;
import java.util.HashMap;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("is duplicate " + isDuplicate(arr));

    }

    static boolean isDuplicate(int[] num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int n : num) {
            if (arrayList.contains(n)) {
                return true;
            } else {
                arrayList.add(n);
            }
        }
        return false;

    }
}
