import java.util.Scanner;

public class LoopProb49
{
   public static void main(String[] args)
   {
      int i,j,n,m=1,c=0;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  for(j=1;j<=m;j++)
		  {
			   if(i==j)
			   {
			  	   c=9;
			   }
			   else
			   {
			  	   c--;
			   }
			   if(i>2 && j>1 && i>j)
			   {
				   c=c+2;
			   }

			  System.out.print(c);
		  }
		  System.out.println();
		  m=m+2;
	  }
	  System.out.println();
   }
}