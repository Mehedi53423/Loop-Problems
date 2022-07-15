import java.util.Scanner;

public class LoopProb61
{
   public static void main(String[] args)
   {
      int i,j,k,n;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  int c = i;

		  for(j=1;j<i;j++)
		  {
		  	  System.out.print(" ");
		  }
		  for(k=n;k>=i;k--)
		  {
			  System.out.print(c+" ");
			  c++;
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}