import java.util.Scanner;

public class LoopProb52
{
   public static void main(String[] args)
   {
      int i,j,k,n,p=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Value Of n : ");
      n = sc.nextInt();

      System.out.println("\nThe Number Of Rows Are : "+(n+(n-1)));

      System.out.println();

      int l = n + (n-1);
      int m = l;

      for(i=1;i<=l;i++)
      {
		  for(j=1;j<p;j++)
		  {
			  System.out.print(" ");
		  }
		  for(k=1;k<=m;k++)
		  {
			  System.out.print("*");
		  }

		  if(i<n)
		  {
			  m = m-2;
			  p++;
		  }
		  else
		  {
			  m = m+2;
			  p--;
		  }

		  System.out.println();
	  }
	  System.out.println();
   }
}