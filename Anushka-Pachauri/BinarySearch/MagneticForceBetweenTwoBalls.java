class MagneticForceBetweenTwoBalls {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min=1;
        int max=position[position.length-1]-position[0];
        if(m==2){
            return max;
        }
        while(min<=max){
            int balls=m-1;
            int mid=(min+max)/2;
            int minPos=position[0];
            for(int pos : position){
            if(pos-minPos>=mid){
                --balls;
                minPos=pos;
             }
            }
            if(balls<=0){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return max;
    }
}