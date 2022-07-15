import java.util.*;

public class LoopProb77
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int c=1;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
	    {
			if(i%2==0)
			{
				if(j%2==0)
				{
					c=1;
				}
				else
				{
					c=0;
				}
			}
			else
			{
				if(j%2==0)
				{
					c=0;
				}
				else
				{
					c=1;
				}
		    }
	        System.out.print(c);
	    }
	    System.out.println();
	}
    System.out.println();
  }
}