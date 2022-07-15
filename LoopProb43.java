import java.util.Scanner;

public class LoopProb43
{
   public static void main(String[] args)
   {
      int i,j,n,c=9;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  for(j=1;j<=i;j++)
		  {
			  if(c==10)
			  {
				  c=0;
			  }

			  System.out.print(c+" ");
			  c++;
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}