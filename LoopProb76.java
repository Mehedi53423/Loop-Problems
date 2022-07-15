import java.util.*;

public class LoopProb76
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
	        System.out.print(c%2);
	        c++;
	    }
	    System.out.println();
	}
    System.out.println();
  }
}