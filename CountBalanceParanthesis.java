import java.util.Scanner;
import java.util.Stack;

public class CountBalanceParanthesis {
	
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
		int count =0;
		Stack<Character> s1=new Stack();
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)=='('||s[i].charAt(j)=='{'||s[i].charAt(j)=='[')
				{
					s1.push(s[i].charAt(j));
				}
				else if((s[i].charAt(j)==')'&&s1.peek()=='(')||(s[i].charAt(j)=='}'&&s1.peek()=='{')||(s[i].charAt(j)==']'&&s1.peek()=='['))
				{
					count+=2;
					s1.pop();
				}
			}
			System.out.println(count);
		}
	}
}
