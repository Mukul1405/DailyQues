import java.util.Arrays;
import java.util.Scanner;

public class pythagoras {
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
		Arrays.sort(arr);
		int k=n-1;
		int max=arr[n-1];
		while(k>0)
		{
			max=arr[k];
		for(int i=0;i<k;i++)
		 {
			for(int j=i+1;j<k;j++)
			{
				if(arr[i]*arr[i]+arr[j]*arr[j]==max*max)
				{
					System.out.println("a is :"+arr[i]+" b is : "+arr[j]+" c is : "+max);
				}
			}
		 }
		k--;
		}
	}
}
