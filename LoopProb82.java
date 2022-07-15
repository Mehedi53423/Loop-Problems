import java.util.*;

public class LoopProb82
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
	    {
		    System.out.print("*");
	    }

	    System.out.print(" ");

	    for(int k=n;k>=i;k--)
		{
			System.out.print("*");
	    }

	    System.out.print(" ");

	    for(int l=n;l>=i;l--)
		{
			System.out.print("*");
	    }

	    System.out.print(" ");

	    for(int m=1;m<=i;m++)
		{
			System.out.print("*");
	    }
	    System.out.println();
	}
    System.out.println();
  }
}