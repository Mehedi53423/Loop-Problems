import java.util.*;

public class LoopProb92
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int r=n,m=1;

    for(int i=1;i<=n;i++)
    {
		for(int k=n;k>i;k--)
		{
			System.out.print(" ");
		}

		int c=r;

        for(int j=1;j<=m;j++)
	    {
		    System.out.print(c);

		    if(j<i)
		    {
				c++;
			}
			else
			{
				c--;
			}
	    }

	    m=m+2;
	    r--;

	    System.out.println();
	}
    System.out.println();
  }
}