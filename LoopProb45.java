import java.util.Scanner;

public class LoopProb45
{
   public static void main(String[] args)
   {
      int i,j,k,n,m=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  int c=1;

		  for(j=n;j>i;j--)
		  {
			  System.out.print("  ");
		  }
		  for(k=1;k<=m;k++)
		  {
			  System.out.print(c+" ");
			  c++;
		  }
		  System.out.println();
		  m=m+2;
	  }
	  System.out.println();
   }
}