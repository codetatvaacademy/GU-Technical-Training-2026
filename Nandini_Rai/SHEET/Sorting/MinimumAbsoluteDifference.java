

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>> list = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
           int diff = arr[i]-arr[i-1];
           min = Math.min(min,diff);
        }
         for(int i=1;i<arr.length;i++){
           int diff = arr[i]-arr[i-1];
          if(diff==min){
            list.add(Arrays.asList(arr[i-1],arr[i]));
          }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        MinimumAbsoluteDifference mb = new MinimumAbsoluteDifference();
        List<List<Integer>> result = mb.minimumAbsDifference(arr);
        for (List<Integer> pair : result) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }
}
