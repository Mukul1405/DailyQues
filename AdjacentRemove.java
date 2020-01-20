import java.util.Scanner;

public class AdjacentRemove {

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String str[]=new String[n];
		String s="";
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			s="";
			char arr[]=str[i].toCharArray();
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]!=arr[j+1])
				{
					s+=arr[j];
				}
				else
				{
					j++;
				}
			}
			System.out.println(s);
		}
	}
}
