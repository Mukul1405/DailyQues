
public class WindowMax {

	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-k+1;i++)
		{
			Max(arr[i],arr[i+1],arr[i+2]);
		}
	}

	public static void Max(int i, int j, int k) {
		if(i>=j&&i>=k)
		{
			System.out.println(i+" ");
		}
		else if(j>=i&&j>=k)
		{
			System.out.println(j+" ");
		}
		else
		{
			System.out.println(k+" ");
		}
	}
}
