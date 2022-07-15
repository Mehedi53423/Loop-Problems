import java.util.Scanner;

public class LoopProb50
{
   public static void main(String[] args)
   {
      int i,j,n;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      int c = n;

      for(i=1;i<=n;i++)
      {
		  for(j=1;j<=i;j++)
		  {
			  System.out.print(c);
			  if(c<n)
			  {
				  c++;
			  }
		  }
		  System.out.println();
		  c=c-i;
	  }
	  System.out.println();
   }
}