import java.util.Scanner;

public class LoopProb21
{
   public static void main(String[] args)
   {
      int i,j,k,n,c=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Row : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  for(j=n;j>i;j--)
		  {
              System.out.print("  ");
		  }
		  for(k=1;k<=i;k++)
		  {
			  if(k==1||i==k)
			  {
				  c=1;
			  }
			  else
			  {
				  c=c*((i-1)-(k-1)+1)/(k-1);
			  }
			  if(c>9)
			  {
				   System.out.print(c+"  ");
			  }
			  else
			  {
				   System.out.print(c+"   ");
			  }
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}