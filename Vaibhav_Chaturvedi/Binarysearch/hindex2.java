package Binarysearch;


class hindex2  {

    public int hIndex(int[] citations) {
    int n = citations.length;    
int min = 0;
int max = citations.length-1;

while(min<=max){ 
    int mid = (min+max)/2;
    if(citations[mid]==n-mid){
    return citations[mid];
    }  
    if(citations[mid]>n-mid){
    max=mid-1;
    }
    else{
min=mid+1;
    }
}
return n-min;
    }
} 