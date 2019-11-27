import java.util.Scanner;


public class Arrays_pairs_Sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the size of second array");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter sum value");
        int k=sc.nextInt();
        System.out.println("Enter first array Elements");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter second array Elements");
        for(int j=0;j<m;j++)
        {
            arr2[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i]+arr2[j]==k)
                {
                    System.out.print("("+arr1[i]+","+arr2[j]+")"+" ");
                }
            }
        }
    }
}
