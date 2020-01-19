import java.util.Scanner;

public class reverse {

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
			k=0;
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)=='.')
				{
					k++;
				}
			}
			//System.out.println(k+1);
			String str[]=new String[k+1];
		int n1=0;
				for(int m=0;m<s[i].length();m++)
				{
					if(s[i].charAt(m)!='.')
					{
						str[n1]+=s[i].charAt(m);
					}
					else
					{
						//System.out.println(str[n1]+" ......");
						n1++;
					}
				}
			for(int j=k;j>0;j--)
			{
				System.out.print(str[j].substring(4)+".");
			}
			System.out.print(str[0].substring(4));
		}
		
	}
}
