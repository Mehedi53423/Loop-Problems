import java.util.*;

public class LoopProb67
{
   public static void main(String[] args)
   {
      int n,m=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      int l=n+(n-1);

      for(int i=1;i<=n;i++)
      {
		  for(int j=l;j>=m;j--)
		  {
		  	  System.out.print("*");
		  }
		  m=m+2;
		  System.out.println();
	  }
	  System.out.println();
   }
}