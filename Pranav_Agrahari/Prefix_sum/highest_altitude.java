public class highest_altitude {
    public static int highest_altitude(int gain[]){
        int alt = 0;
        int high_alt = 0;
        for (int i = 0; i < gain.length; i++) {
            alt +=gain[i];
        }
        if (alt > high_alt) {
            high_alt = alt ;
        }
        return high_alt;
    }
   
    public static void main(String[] args) {
        
        int gain[] = {-4,-3,-2,-1,4,3,2};
        System.out.println(highest_altitude(gain));
    }
}
