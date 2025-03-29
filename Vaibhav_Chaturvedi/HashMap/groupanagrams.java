import java.util.*;

class groupanagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,ArrayList<String>> map = new HashMap<>();

        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String val = String.valueOf(ch);

           if(!map.containsKey(val)){
            map.put(val,new ArrayList<>());
           }
         map.get(val).add(str);

        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,ArrayList<String>> mp:map.entrySet()){
           result.add(mp.getValue());
        }
        

return result;
    }
}