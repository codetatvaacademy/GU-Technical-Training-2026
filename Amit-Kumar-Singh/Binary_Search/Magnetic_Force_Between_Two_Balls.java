//Time Complexity: O(nlogn + nlogm)
//Space Complexity: O(1)
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 1;
        int end = (position[position.length-1]-position[0])/(m-1);
        while(start<=end){
            int mid = (start+end)/2;
            int ballCount=1;
            int previous = position[0];
            for(int i = 1;i<position.length;i++){
                if(position[i]-previous>=mid){
                    ballCount++;
                    previous = position[i];
                }
            }
            if(ballCount>=m){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end;
    }
}
