/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//Time Complexity: O(nlogn)
//Space Compelxity: O(1)
    public class First_Bad_Version extends VersionControl {
        public int firstBadVersion(int n) {
            long start = 1;
            long end = n;
            while(start<=end){
                long mid = start+(end-start)/2;
                if(isBadVersion((int)mid)){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return (int) end;
        }
    }