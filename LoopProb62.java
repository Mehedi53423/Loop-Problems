import java.util.Scanner;

public class LoopProb62
{
   public static void main(String[] args)
   {
      int i,j,n;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      char c;

      for(i=1;i<=n;i++)
      {
		  for(j=1;j<=i;j++)
		  {
			  if(i%2==0)
			  {
				  if(j%2==0)
				  {
					  c='A';
				  }
				  else
				  {
					  c='B';
				  }
			  }
			  else
			  {
				  if(j%2==0)
				  {
					  c='B';
				  }
				  else
				  {
					  c='A';
				  }
			  }
		  	  System.out.print(c);
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}