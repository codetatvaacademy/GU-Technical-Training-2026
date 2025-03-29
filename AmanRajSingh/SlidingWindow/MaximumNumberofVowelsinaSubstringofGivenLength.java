class Solution {
    public int maxVowels(String s, int k) {
        int max_vowels = 0;
        int window_vowels = 0;

        Set <Character> vowels = new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');

        for(int i = 0 ; i < k; i++){
            if(vowels.contains(s.charAt(i))){
                window_vowels++;
            }
            max_vowels = window_vowels;
        }

        for(int i = k ; i < s.length(); i++){
            if(vowels.contains(s.charAt(i-k))){
                window_vowels--;
            }
            if(vowels.contains(s.charAt(i))){
                window_vowels++;
            }
            max_vowels = Math.max(max_vowels,window_vowels);
        }
        return max_vowels;
    }
}