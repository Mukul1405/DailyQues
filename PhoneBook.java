import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		HashMap<String,Integer>map=new HashMap();
		for(int i=0;i<n;i++)
		{
			map.put(sc.next(),sc.nextInt());
		}
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(str[i]))
			{
				System.out.println(str[i]+" = "+map.get(str[i]));
			}
			else
			{
				System.out.println("No data Found");
			}
		}
	}
}
