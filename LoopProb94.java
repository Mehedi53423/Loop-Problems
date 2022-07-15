import java.util.*;

public class LoopProb94
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Elements : ");
    int n = sc.nextInt();

    int[] a= new int[n];

    System.out.println("\nEnter The Elements : \n");

    for(int i=0;i<n;i++)
    {
		a[i]=sc.nextInt();
    }

    System.out.println();

    for(int i=0;i<n;i++)
    {
		int c=i;

        for(int j=n;j>i;j--)
	    {
			System.out.print(a[c]);
			c++;
	    }
	    System.out.println();
	}
    System.out.println();
  }
}