import java.util.*;

public class LoopProb86
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
				if(j<=i)
				{
					c++;
				}
				else
				{
					c--;
				}
			}
		    System.out.print(c);
	    }
	    m=m+2;
	    System.out.println();
	}
    System.out.println();
  }
}