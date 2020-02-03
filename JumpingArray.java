import java.util.Scanner;

public class JumpingArray {
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
		int refarr[]= {0,1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<n;i++)
		{
			if(arr[i]<=10)
			{
				for(int j=0;j<=arr[i];j++)
				{
					System.out.print(j+" ");
				}
			}
			else
			{
				for(int j=0;j<10;j++)
				{
					System.out.print(j+" ");
				}
				for(int j=1;j<9;j++)
				{
					if((refarr[j]*10+refarr[j-1])<=arr[i])
					{
						System.out.print((refarr[j]*10+refarr[j-1])+" ");
					}
					if((refarr[j]*10+refarr[j+1])<=arr[i])
					{
						System.out.print((refarr[j]*10+refarr[j+1])+" ");
					}
					else {
						break;
					}
				}
			}
		}
	}
}
