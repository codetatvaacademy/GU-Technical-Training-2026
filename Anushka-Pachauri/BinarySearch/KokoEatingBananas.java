class KokoEatingBananas {
    public boolean isValid(int[] piles,int h,int mid){
        int hours=0;
        for(int pile : piles){
            hours+=Math.ceil((double)pile/mid);
            if(hours>h){
                return false;
            }
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h){
        Arrays.sort(piles);
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int pile : piles){
            max=Math.max(pile,max);
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(isValid(piles,h,mid)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
}