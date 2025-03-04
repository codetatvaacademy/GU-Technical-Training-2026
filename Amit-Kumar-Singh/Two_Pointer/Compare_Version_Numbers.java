class Solution {
    public int compareVersion(String version1, String version2) {
        int v1 =0;
        int v2 =0;
        char[] ver1 = version1.toCharArray();
        char[] ver2 = version2.toCharArray();
        int v1L = ver1.length;
        int v2L = ver2.length;
        while(v1<v1L ||v2<v2L){
            int ver1Val = 0;
            int ver2Val = 0;
            
            while(v1<v1L && ver1[v1]!='.'){
                ver1Val = ver1Val*10+(ver1[v1]-'0');
                v1++;
            }
            while(v2<v2L && ver2[v2]!='.'){
                ver2Val = ver2Val*10+(ver2[v2]-'0');
                v2++;
            }
            v1++;
            v2++;
            if(ver1Val>ver2Val){
                return 1;
            }
            else if(ver1Val<ver2Val){
                return -1;
            }
        }
        return 0;
    }
}