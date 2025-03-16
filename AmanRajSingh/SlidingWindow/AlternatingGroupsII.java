class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        
        int count = 1;
        int ans = 0;
        int n = colors.length;
        for(int i =1; i < n+k-1 ;i++){
            if(colors[(i-1)%n] != colors[i%n]){
                count++;
            }
            else{
                count = 1;
            }

            if(count==k){
                ans++;
                count = count - 1;
            }
        }
    
 
        
        return ans;
    }
}