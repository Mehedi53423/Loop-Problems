import java.util.*;

public class LoopProb75
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      int n = sc.nextInt();

      System.out.println();

      for(int i=1;i<=n;i++)
      {
		  int c=i;
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(c);
			  c--;
		  }

		  for(int k=n;k>=i;k--)
		  {
			  System.out.print(" ");
		  }
          int d=i;
		  for(int j=1;j<=i;j++)
		  {
			  int z=96+d;
			  char a=(char)z;
		  	  System.out.print(a);
		  	  d--;
		  }

		  System.out.println();
	  }
	  System.out.println();
   }
}