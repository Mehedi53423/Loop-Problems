import java.util.Scanner;

public class LoopProb56
{
  public static void main(String[] args)
  {
    int n,i,j,k,l,m;

    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    n = sc.nextInt();

    System.out.println();

    for(i=1;i<=n;i++)
    {
        for(j=n;j>=i;j--)
	    {
	       System.out.print("*");
	    }
	    for(k=1;k<i;k++)
		{
		   System.out.print(" ");
	    }
	    for(l=1;l<i;l++)
	    {
		   System.out.print(" ");
	    }
	    for(m=n;m>=i;m--)
		{
		   System.out.print("*");
	    }
	    System.out.println();
	}
    System.out.println();
  }
}