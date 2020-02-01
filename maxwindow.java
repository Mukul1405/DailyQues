import java.util.Scanner;

public class maxwindow {
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
		int k=sc.nextInt();
		int max=0;
		for(int i=0;i<n-k+1;i++)
		{
			max=arr[i];
			for(int j=i+1;j<i+k;j++)
			{	
				if(max<arr[j])
				{
					max=arr[j];
				}
			}
			System.out.print(max+" ");
		}
	}

}
