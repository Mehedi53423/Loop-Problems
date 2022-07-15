import java.util.*;

public class LoopProb80
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
					System.out.print(j);
				}
				else
				{
					System.out.print("*");
				}
			}
			else
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j);
				}
		    }
	    }
	    System.out.println();
	}
    System.out.println();
  }
}