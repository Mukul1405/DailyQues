import java.util.Scanner;

public class Greatest_Primefact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=-1;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{  int j;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						break;
					}
				}
				if(i==j)
				{
					k=i;
				}
					
			}
		}
		System.out.println(k);
	}

}
