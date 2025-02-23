//Time Complexity: O(nlogn+nlogm)
//Space Complexity: O(n+k)
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] soldiers = new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            soldiers[i][0] = binarySearch(mat[i]);
            soldiers[i][1] = i;
        }
        int[] weakest = new int[k];
        Arrays.sort(soldiers, (a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        for(int i=0;i<k;i++){
            weakest[i] = soldiers[i][1];
        }
        return weakest;
    }
    public int binarySearch(int[] matRow){
        int start = 0;
        int end = matRow.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(matRow[mid]==0){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
