import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem11 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs=new HashSet<>();

        for(int i=0 ; i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char ch=board[i][j];
                if(ch!= '.')
                {
                    if(!hs.add(ch+"in row"+i)||
                    !hs.add(ch+"in col"+j)||
                    !hs.add(ch+"in square"+i/3 +" - "+j/3)
                    )
                    return false;
                }
                
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the rows");
        System.out.println("Enter the columns");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][] arr=new char[r][c];
        System.out.println("Enter the array elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.next().charAt(0);
            }
        }
        problem11 p=new problem11();
        boolean ans= p.isValidSudoku(arr);
        System.out.println(ans);

    }
}
