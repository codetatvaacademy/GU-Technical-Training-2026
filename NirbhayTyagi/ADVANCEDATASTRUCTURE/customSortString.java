import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class customSortString{
    public static String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                for (int i = 0; i < count; i++) {
                    result.append(c);
                }
                map.remove(c);
            }
        }
        for (char c : map.keySet()) {
            int count = map.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String order = sc.nextLine();
        System.out.println("Enter the second string");
        String s = sc.nextLine();
        System.out.println("The output string will be : " + customSortString(order, s));
    }
}