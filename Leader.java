import java.util.Scanner;

public class Leader {

	public static int max(int a,int n,int arr[])
	{
		int max=0;
		for(int i=a;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			int c=max(i+1,n,arr);
			if(arr[i]>=c)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
