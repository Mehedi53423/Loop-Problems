import java.util.*;

public class LoopProb84
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
		int m=0;

		if(i%2==0)
		{
			m=2;
	    }
	    else
	    {
			m=1;
	    }
        for(int j=1;j<=m;j++)
	    {
		    System.out.print(c);
		    c++;
	    }
	    System.out.println();
	}
    System.out.println();
  }
}