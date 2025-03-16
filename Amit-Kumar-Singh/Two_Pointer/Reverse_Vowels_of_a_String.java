class Solution {
    Character[] v = {'a','e','i','o','u','A','E','I','O','U'};
    Set<Character> set = new HashSet<>(Arrays.asList(v));
    public String reverseVowels(String s) {
        int n = s.length();
        int start = 0;
        int end = n-1;
        char[] str = s.toCharArray();
        while(start<end){
            if(set.contains(str[start])){
                if(set.contains(str[end])){
                    char temp = str[start];
                    str[start] = str[end];
                    str[end] = temp;
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            else{
                start++;
            }
        }
        return new String(str);
    }
}