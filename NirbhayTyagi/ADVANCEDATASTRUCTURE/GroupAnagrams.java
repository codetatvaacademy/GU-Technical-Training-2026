import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class GroupAnagrams{
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        
        for(String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(s);
        
        }
        return new ArrayList(anagrams.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            strs[i] = sc.nextLine();
        }
        System.out.println("The resultant array is: " + groupAnagrams(strs));
    }
}

//time complexity of the function is: O(n⋅mlogm)
//space complexity of the function is: O(n⋅m)

//time complexity of the function is: O(n⋅mlogm)
//space complexity of the function is: O(n⋅m)