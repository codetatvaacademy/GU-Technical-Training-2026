package Binarysearch;

import java.util.Scanner;

class  kthmissing{
        public static int findKthPositive(int[] arr, int k) {
                    int left = 0, right = arr.length - 1;
                    while (left <= right) {
                        int mid = left + (right - left) / 2;
                        if (arr[mid] - mid - 1 < k) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }
                    return left + k;
                }
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                System.out.println("enter value of k");
                int k=sc.nextInt();
                System.out.println(" number values to enter in array");
                int n =sc.nextInt();
                int [] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
               int ans = findKthPositive( arr, k);
               System.out.println(ans);
        }
    }         
         

