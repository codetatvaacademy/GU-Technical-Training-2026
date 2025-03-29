
class productofarrayexcept {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int up[] = new int[n];
        for(int i=1;i<n;i++){
         up[0]=1;
         up[i]=up[i-1]*nums[i-1];        
        }
        int down[] = new int [n];
        for(int j=n-1;j>0;j--){
         down[n-1]=1; 
         down[j-1]=down[j]*nums[j];        
        }

int ans[] = new int[n];
for(int k=0;k<n;k++){
  ans[k]=up[k]*down[k];
} 
return ans;
    }
} 
