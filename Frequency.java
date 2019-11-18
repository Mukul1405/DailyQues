import java.util.Scanner;

public class Frequency {
public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int arr[]=new int[n];
	int freq[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		freq[i]=0;
	}
	
	int count=1;
	for(int i=0;i<n;i++)
	{
		count=1;
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j]&&freq[j]==0)
			{
				count++;
				freq[j]=1;
			}
		}
		if(freq[i]!=1)
		{
			System.out.println(arr[i]+" "+count);
		}
	}
	
			
}
}
