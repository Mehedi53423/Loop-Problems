import java.util.Scanner;

public class LoopProb54
{
   public static void main(String[] args)
   {
      int i,j,n;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Value Of n : ");
      n = sc.nextInt();

      System.out.print("\nThe Number Of Rows Are : "+n*2+"\n");

      System.out.println();

      for(i=1;i<=n*2;i++)
      {
		  for(j=1;j<=i;j++)
		  {
			  if(j==1 || i==j || i==n*2)
			  {
			      System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}