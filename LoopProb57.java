import java.util.Scanner;

public class LoopProb57
{
  public static void main(String[] args)
  {
    int n,i,j,c=1,m=1;

    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    n = sc.nextInt();

    System.out.println();

    for(i=1;i<=n;i++)
    {
        for(j=1;j<=m;j++)
	    {
	       System.out.print(c+" ");
	       c=c+2;
	    }
	    System.out.println();
	    m = i*3;
	}
    System.out.println();
  }
}