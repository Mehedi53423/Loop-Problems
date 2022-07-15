import java.util.Scanner;

public class LoopProb60
{
   public static void main(String[] args)
   {
      int i,j,k,n,c=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  for(j=n;j>i;j--)
		  {
		  	  System.out.print(" ");
		  }
		  for(k=1;k<=i;k++)
		  {
			  System.out.print(c+" ");
			  c++;
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}