import java.util.*;

public class LoopProb90
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int m=0;

    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>i;j--)
	    {
		    System.out.print("#");
	    }

	    System.out.print("*");

	    for(int k=1;k<m;k++)
		{
			System.out.print("#");
	    }

	    m=m+2;

	    if(i!=1)
	    {
			System.out.print("*");
		}

	    for(int o=n;o>i;o--)
		{
			System.out.print("#");
		}

	    System.out.println();
	}
    System.out.println();
  }
}