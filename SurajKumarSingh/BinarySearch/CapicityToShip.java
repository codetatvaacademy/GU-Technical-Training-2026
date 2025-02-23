// Leetcode - 1011

package BinarySearch;

import java.util.*;

class CapicityToShip{
        private boolean ispossible(int [] weights, int capicity, int days){
            int currentload = 0;
            int requiredday = 1;
            for(int i = 0; i< weights.length; i++){
                int weight = weights[i];
                if(currentload + weight > capicity){
                    requiredday++;
                    currentload = weight;
                    if(requiredday > days){
                        return false;
                    }
                }
                else{
                    currentload += weight;
                }
            }
            return true;
        }
        public int shipWithinDays(int[] weights, int days) {
          int left = 0; int right = 0;
           for(int  i= 0; i<weights.length; i++){
            left = Math.max(left, weights[i]);
            right += weights[i];
           }
           while(left <= right){
            int mid = (left + right)/2;
            if(ispossible(weights ,mid,days)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
           }
           return left;
        }

        public static void main(String[] args) {
            CapicityToShip Ship = new CapicityToShip();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array : ");
            int n = sc.nextInt();
            System.out.println("Enter number of days: ");
            int days = sc.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the  weights: ");
            for(int i = 0; i < n ; i++){
               arr[i] = sc.nextInt();
            }
            int ans = Ship.shipWithinDays(arr, days);
            System.out.println("Minimum capacity to ship within " + days + " days: " + ans);
            sc.close();
        }
    }