import java.util.Scanner;

public class LoopProb58
{
   public static void main(String[] args)
   {
      int i,j,n;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  for(j=n;j>=i;j--)
		  {
			  System.out.print(j);
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}