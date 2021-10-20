package hackerrank.solutions.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayReverse {

    public static List<Integer> reverseArray(List<Integer> arr) {

        List<Integer> result = new ArrayList<>();
        for (int i = arr.size()-1;i>=0;i--) {
            int temp = arr.get(i);
            result.add(temp);
        }
        return result;
    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {

        System.out.println("Give n");
        int n = scan.nextInt();
        System.out.println("ArrayReverse");
        List<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//        arr.add(50);
        for (int i=0;i<n;i++) {
            arr.add(i,scan.nextInt());
        }
        System.out.println(reverseArray(arr));
    }
}
