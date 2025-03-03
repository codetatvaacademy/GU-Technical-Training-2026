class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> mapB = new HashMap<>();
        Map<Character,Integer> mapA = new HashMap<>();
        char[] ch1 = s.toCharArray();
        char[] ch2 = p.toCharArray();
        for(char c: ch2){
            if(!mapB.containsKey(c)){
                mapB.put(c,1);
            }
            else{
                mapB.put(c,mapB.get(c)+1);
            }
        }
        int wStart = 0;
        int wEnd = 0;
        while(wEnd<ch1.length){
            if(!mapA.containsKey(ch1[wEnd])){
                mapA.put(ch1[wEnd],1);
            }
            else{
                mapA.put(ch1[wEnd],mapA.get(ch1[wEnd])+1);
            }
            if((wEnd-wStart)==ch2.length){
                mapA.put(ch1[wStart],mapA.get(ch1[wStart])-1);
                if(mapA.get(ch1[wStart])==0){
                    mapA.remove(ch1[wStart]);
                }
                wStart++;
            }
            if(mapB.equals(mapA)){
                list.add(wStart);
            }
            wEnd++;
        }
        return list;
    }
}
