import java.util.Scanner;

public class LoopProb55
{
  public static void main(String[] args)
  {
    int n,i,j,m=1;

    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    n = sc.nextInt();

    System.out.println();

    for(i=1;i<=n;i++)
    {
        for(j=1;j<=m;j++)
	    {
	       System.out.print("*");
	    }
	    System.out.println();
	    m = i*3;
	}
    System.out.println();
  }
}