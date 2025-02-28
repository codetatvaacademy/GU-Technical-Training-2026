public class StringCompression {
    public int compress(char[] chars) {
        int read=0;
        int up=0;
        while(read<chars.length){
            char curr= chars[read];
            int cnt=0;
            while(read<chars.length && chars[read]==curr){
                read++;
                cnt++;
            }
            chars[up++]=curr;
            if(cnt>1){
                for (char c : Integer.toString(cnt).toCharArray()) {
                    chars[up++] = c;
                }
            }
        }
        return up;
    }
}
