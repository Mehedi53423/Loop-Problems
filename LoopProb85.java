import java.util.*;

public class LoopProb85
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int m=1;

    for(int i=1;i<=n;i++)
    {
		int c=1;

        for(int j=1;j<=m;j++)
	    {
			if(j==1||j==m)
			{
			    c=1;
			}
			else
			{
				c++;
			}
		    System.out.print(c);
	    }

	    if(i==1)
	    {
		    m=m+2;
		}
		else
		{
			m++;
		}

	    System.out.println();
	}
    System.out.println();
  }
}