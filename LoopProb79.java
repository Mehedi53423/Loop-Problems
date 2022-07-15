import java.util.*;

public class LoopProb79
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int l=n+2;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=l;j++)
	    {
			if(i==1||i==n||j==1||j==l)
			{
               System.out.print("*");
			}
			else
			{
               System.out.print(" ");
		    }
	    }
	    System.out.println();
	}
    System.out.println();
  }
}