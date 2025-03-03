import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public boolean isPossible(int[] position, int m, int mid){
        int count = 1;
        int LastPosition = position[0];

        for(int i = 1; i < position.length; i++){  
            if(position[i] - LastPosition >= mid){
                count++;
                LastPosition = position[i];

                if(count == m){
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min = 1;  
        int max = position[position.length - 1] - position[0];
        int result = 0;

        while(min <= max){
            int mid = min + (max - min) / 2;

            if(isPossible(position, m, mid)){
                result = mid;  
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of positions: ");
        int n = scanner.nextInt();
        int[] position = new int[n];

        System.out.println("Enter position values:");
        for (int i = 0; i < n; i++) {
            position[i] = scanner.nextInt();
        }

        System.out.print("Enter number of balls: ");
        int m = scanner.nextInt();

        Solution sol = new Solution();
        int maxDist = sol.maxDistance(position, m);
        System.out.println("Maximum possible minimum distance: " + maxDist);
        
        scanner.close();
    }
}
