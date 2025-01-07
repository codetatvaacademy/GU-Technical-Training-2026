package Vikash_Kumar_Sharma.Sorting;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
	int size,i,j,temp;
	int arr[]=new int[50];
	Scanner sn=new Scanner(System.in);
	System.out.println("Enter array size :");
	size=sn.nextInt();
	System.out.println("Enter elements of the array :");
	for(i=0;i<size;i++)
	{
		arr[i]=sn.nextInt();
	}
	System.out.println("------Sorting element:------");
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(i=0;i<size;i++)
	{
	System.out.println("Array elements are sorted by selection sorting :"+arr[i]);
	}
}
}
