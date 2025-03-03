class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int hLen = horizontalCuts.length;
        int vLen = verticalCuts.length;

        long breadth = horizontalCuts[0];
        long length = verticalCuts[0];

        for(int i = 0;i<hLen-1;i++){
            breadth = Math.max(horizontalCuts[i+1]-horizontalCuts[i],breadth);
        }
        breadth = Math.max(h-horizontalCuts[hLen-1],breadth);

        for(int i = 0;i<vLen-1;i++){
            length = Math.max(verticalCuts[i+1]-verticalCuts[i],length);
        }
        length = Math.max(w-verticalCuts[vLen-1],length);

        long area = (length*breadth)%(1000000007);
        return (int)area;
    }
}