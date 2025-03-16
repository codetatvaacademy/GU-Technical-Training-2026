import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem7 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int r1=0;
        int c1=0;
        int r2=matrix.length-1;
        int c2=matrix[0].length-1;

        while(r1<=r2 && c1<=c2)
    {
             for(int i=c1;i<=c2;i++)
        {
            list.add(matrix[r1][i]);
        }

        for(int i=r1+1;i<=r2;i++)
        {
            list.add(matrix[i][c2]);
        }
        if(r1<r2 && c1<c2)
    {
            for(int i=c2-1;i>=c1;i--)
        {
            list.add(matrix[r2][i]);
        }
        for(int i=r2-1;i>r1;i--)
        {
            list.add(matrix[i][c1]);
        }
    }
        
        r1++;
        c1++;
        r2--;
        c2--;
    }

    return list;
    }
    public static void main(String[] args) {
        System.out.println("Enter the rows");
        System.out.println("Enter the columns");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the array elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        problem7 p=new problem7();
        List<Integer> list=p.spiralOrder(arr);
        System.out.println(list);

    }
}
