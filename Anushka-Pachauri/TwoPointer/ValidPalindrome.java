class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
        return true;
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            char charstart=s.charAt(start);
            char charend=s.charAt(end);
            if(!Character.isLetterOrDigit(s.charAt(start)))
            start++;
            else if(!Character.isLetterOrDigit(s.charAt(end)))
            end--;
            else
            {
                if(Character.toLowerCase(charstart)!=Character.toLowerCase(charend))
                return false;
                start++;
                end--;
            }
        }
        return true;
    }
}