import java.util.Scanner;

public class FarDistance {

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
		int ans=0,diff=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					ans=j-i;
					if(diff<ans)
					{
						diff=ans;
					}
				}
			}
		}
		System.out.println(diff);
	}
}
