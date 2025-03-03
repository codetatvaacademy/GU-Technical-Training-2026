public class Piglatin {
    public static void main(String[] args) {
        String[] words = args[0].split(" ");
        for (String word : words) {
            System.out.print(word.substring(1) + word.charAt(0) + "ay ");
        }
        System.out.println();
    }
}
