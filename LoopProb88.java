import java.util.*;

public class LoopProb88
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    for(int i=1;i<=n;i++)
    {
         for(int j=1;j<=n;j++)
	     {
			 if(i==j)
			 {
		         System.out.print("*");
			 }
			 else
			 {
				 System.out.print("0");
			 }
	     }

	     System.out.println();
	}
    System.out.println();
  }
}