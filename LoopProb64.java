import java.util.Scanner;

public class LoopProb64
{
   public static void main(String[] args)
   {
      int i,j,n,m=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  int c=i;

		  for(j=1;j<=m;j++)
		  {
		  	  System.out.print(c);

		  	  if(j<i)
		  	  {
				  c++;
			  }
			  else
			  {
				  c--;
			  }
		  }
		  m=m+2;

		  System.out.println();
	  }
	  System.out.println();
   }
}