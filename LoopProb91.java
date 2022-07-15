import java.util.*;

public class LoopProb91
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int l=n+(n-1),r=n;

    for(int i=1;i<=n;i++)
    {
		for(int k=1;k<i;k++)
		{
			System.out.print(" ");
		}

		int c=r;

        for(int j=l;j>=1;j--)
	    {
		    System.out.print(c);

		    if(j>r)
		    {
				c--;
			}
			else
			{
				c++;
			}
	    }

	    l=l-2;
	    r--;

	    System.out.println();
	}
    System.out.println();
  }
}