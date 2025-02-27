
class reverseprefix {
    public String reversePrefix(String word, char ch) {
       
        int right=0;
        for(int i=0;i<word.length();i++){
           if(word.charAt(i)==ch){
            right=i;
            break;
           }
        }
char d[] = word.toCharArray();
int n = right/2;
for(int j=0;j<=n;j++){
     char s = d[j];
     d[j]=d[right];
     d[right]=s;
     right--;
} 
String str = new String();  
String string = str.valueOf(d);
return string;
    }
}    