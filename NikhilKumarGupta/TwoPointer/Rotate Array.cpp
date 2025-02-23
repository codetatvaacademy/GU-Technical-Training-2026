class Solution {
    private:
    void rev(vector<int>& nums,int start,int end){
        
        while(start<=end){
            
             int temp=nums[start];
              nums[start]=nums[end];
              nums[end]=temp;
             start++;
             end--;

        }
       

    }
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
        k=k%n;

        rev(nums,0,n-k-1);
        rev(nums,n-k,n-1);
        rev(nums,0,n-1);
        

        
    }
    
};