import java.util.*;

public class LoopProb73
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      int n = sc.nextInt();

      System.out.println();

      int m=1;

      for(int i=1;i<=n;i++)
      {
		  for(int j=1;j<=m;j++)
		  {
			 System.out.print(j);
		  }
		  System.out.println();
		  m=m+2;
	  }
	  System.out.println();
   }
}