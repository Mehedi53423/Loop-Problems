import java.util.*;

public class LoopProb89
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int m=1,r=7;

    for(int i=1;i<=n;i++)
    {
		 int c=r;

         for(int j=1;j<=m;j++)
	     {
			 System.out.print(c+" ");
			 c++;
	     }
	     r=r*2;
	     m=m*2;

	     System.out.println();
	}
    System.out.println();
  }
}