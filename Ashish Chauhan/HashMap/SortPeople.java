class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer , String > map = new TreeMap<>(Collections.reverseOrder());

        for(int i = 0; i < heights.length; i++) {
            map.put(heights[i] , names[i]);
        }
        String[] str = new String[heights.length];

        int i = 0;
        for(int num : map.keySet()) {
            str[i++] = map.get(num);
        }
        return str;
    }
}
