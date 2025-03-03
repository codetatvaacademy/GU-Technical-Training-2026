/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

import java.util.Scanner;

public class FirstBadVersion {
    static int bad;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bad = sc.nextInt();
        sc.close();
        System.out.println(firstBadVersion(n));
    }
    private static int firstBadVersion(int n) {
        long start = 1;
        long end = n;
        while(start<=end){
            long mid = (start+end)/2;
            if(isBadVersion((int)mid)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return (int)start;
    }
    private static boolean isBadVersion(int version){
        if(version==bad){
            return true;
        }
        return false;
    }
}
