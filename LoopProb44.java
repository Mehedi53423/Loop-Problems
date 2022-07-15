import java.util.Scanner;

public class LoopProb44
{
  public static void main(String[] args)
  {
    int n,i,j,k,l,m;

    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    n = sc.nextInt();

    System.out.println();

    int d = n;

    for(i=1;i<=n;i++)
    {
		int c = 1;

        for(j=n;j>=i;j--)
	    {
	        System.out.print(c);
	        c++;
	    }
	    for(k=1;k<i;k++)
		{
		    System.out.print("_");
	    }
	    for(l=1;l<i;l++)
	    {
		    System.out.print("_");
	    }
	    for(m=n;m>=i;m--)
		{
		    System.out.print(d);
		    d--;
	    }
	    System.out.println();
	    d = n-i;
	}
    System.out.println();
  }
}