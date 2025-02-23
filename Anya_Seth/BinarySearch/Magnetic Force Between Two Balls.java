class Solution {
    public int maxDistance(int[] position, int m){
        Arrays.sort(position);
        int min = 1;
        int max = position[position.length - 1] - position[0];
        while(min <= max){
            int mid = (min + max)/2;
            if(isValid(position, mid, m)){
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
        return max;
    }
    public static boolean isValid(int[] position, int mid, int m){
        int count = 1;
        int first_pos = position[0];
        for(int i = 1 ; i < position.length ; i++){
           if(position[i] - first_pos >= mid){
             first_pos = position[i];
             count++;
            }
        }
        return count >= m;
    }
}
