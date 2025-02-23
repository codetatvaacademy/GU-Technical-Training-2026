 int rev = 0;
        while (x!= 0) {
            int re = x%10 ;
            rev = rev*10+re;
            x=x/10;
          //  System.out.println(rev);
        }