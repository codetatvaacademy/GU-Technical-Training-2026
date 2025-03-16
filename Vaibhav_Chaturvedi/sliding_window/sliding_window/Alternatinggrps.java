package sliding_window;

import java.util.Scanner;

class Alternatinggrps{
    public static int numberOfAlternatingGroups(int[] colors) {
            int res = 0;
            for (int i = 2; i < colors.length; i++) {
                if (colors[i - 2] != colors[i - 1] && colors[i - 1] != colors[i]) {
                    res++;
                }
            }
      
            if (colors[0] != colors[1] && colors[0] != colors[colors.length - 1]) {
                res++;
            }
            if (colors[0] != colors[colors.length - 1] && colors[colors.length - 2] != colors[colors.length - 1]) {
                res++;
            }
            return res;
        }
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
                    System.out.println("enter colors array length");
                    int n = sc.nextInt();
                    int nums[] = new int[n];
                    for(int i=0;i<n;i++){
                        nums[i]=sc.nextInt();
                    }
                    int ans = numberOfAlternatingGroups(nums);
                System.out.println(ans);
    }
} 