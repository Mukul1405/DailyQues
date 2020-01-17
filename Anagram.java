import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		first=first.toLowerCase();
		second=second.toLowerCase();
		char f[]=first.toCharArray();
		char s[]=second.toCharArray();
		Arrays.sort(f);
		Arrays.sort(s);
		int k=0;
		if(f.length==s.length) {
		for(int i=0;i<f.length;i++)
		 {
			if(f[i]==s[i])
			{
				k=1;
			}
			else
			{
				k=0;
				break;
			}
				
		 }
		if(k==1)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
	}
		else {
			System.out.println("Not Anagram");
		}
	}
}
