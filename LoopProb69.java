import java.util.*;

public class LoopProb69
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      int n = sc.nextInt();

      System.out.println();

      for(int i=1;i<=n;i++)
      {
		  int c = i;

		  for(int j=1;j<=n;j++)
		  {
			  int b=64+c;
			  char a=(char)b;

		  	  System.out.print(a);

			  if(c==4)
			  {
			  	  c=1;
			  }
			  else
			  {
			  	  c++;
			  }
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}