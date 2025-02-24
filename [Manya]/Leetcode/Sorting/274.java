package Sorting;

class Solution {
    public int hIndex(int[] citations) {

        int arr[] = new int[citations.length + 1];
        for(int i : citations){
            if(i >= citations.length){
                arr[citations.length]++;
            }
            else{
                arr[i]++;
            }
        }
        int suffix = 0;
        for(int i = citations.length; i >= 0; i--){
            suffix += arr[i];
            if(suffix >= i){
                return i;
            }
        }
        return 0;
    }
}
