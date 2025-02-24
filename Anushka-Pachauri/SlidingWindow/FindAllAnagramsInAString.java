class FindAllAnagramsInAString. {
    public List<Integer> findAnagrams(String s, String p) {
        char[] s1=s.toCharArray();
        char[] p1=p.toCharArray();
        int[] sFreq=new int[26];
        int[] pFreq=new int[26];
        List<Integer> answer=new ArrayList<>();

        if(s1.length<p1.length){
            return new ArrayList<>();
        }

        for(int i=0;i<p1.length;i++){
            pFreq[p1[i]-'a']++;
            sFreq[s1[i]-'a']++;
        }
        if(Arrays.equals(sFreq,pFreq)){
            answer.add(0);
        }

        int start=0;
        int end=p1.length;
        while(end<s1.length){
            sFreq[s1[start]-'a']--;
            sFreq[s1[end]-'a']++;
            if(Arrays.equals(sFreq,pFreq)){
                answer.add(start+1);
            }
            start++;
            end++;
        }
        return answer;
    }
}