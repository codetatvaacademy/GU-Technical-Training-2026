public class ReversePrefixWord {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index= i;
                break;
            }
        }
        if(index==-1){
            return word;
        }
        StringBuilder rev= new StringBuilder(word.substring(0,index+1)).reverse();
        rev.append(word.substring(index+1));
        return rev.toString();
    }
}
