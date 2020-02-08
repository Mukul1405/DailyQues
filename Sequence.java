import java.util.*;
public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(n%2==0) {
	     	for(int i=0;i<n/2;i++)
	     	{
	 		   System.out.print(arr[i]+" "+arr[n-i-1]+" ");
		    }
		}
		else
		{
			for(int i=0;i<n/2;i++)
	     	{
	 		   System.out.print(arr[i]+" "+arr[n-i-1]+" ");
		    }
			System.out.print(arr[(n-1)/2]);
		}
	}

}
