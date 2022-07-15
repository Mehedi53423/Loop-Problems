import java.util.Scanner;

public class LoopProb63
{
   public static void main(String[] args)
   {
      int i,j,n,m=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      int l = n+(n-1);

      for(i=1;i<=l;i++)
      {
		  for(j=1;j<=m;j++)
		  {
		  	  System.out.print("*");
		  }

		  if(i>=n)
		  {
		  	  m--;
		  }
		  else
		  {
		  	  m++;
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}