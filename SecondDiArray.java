package hackerrank.solutions.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondDiArray {

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<arr.size()-2;i++) {
            for (int j=0;j<arr.size()-2;j++) {
                int sum = (arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+
                        arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2));
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {

        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,1,0,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,0,2,4,4,0));
        arr.add(Arrays.asList(0,0,0,2,0,0));
        arr.add(Arrays.asList(0,0,1,2,4,0));

        System.out.println("Size = " +arr.size());
        for (int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
        System.out.println(hourglassSum(arr));
    }

}
