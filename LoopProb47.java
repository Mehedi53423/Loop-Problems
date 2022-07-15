import java.util.Scanner;

public class LoopProb47
{
   public static void main(String[] args)
   {
      int i,j,n;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      int s = n;

      for(i=1;i<=n;i++)
      {
		  int c = 64;

		  for(j=s*2;j>=1;j--)
		  {
			  if(j>s)
			  {
			  	  c++;
			  }
			  else if(j==s)
			  {
			  	  c=64+s;
			  }
			  else if(j<s)
			  {
			  	  c--;
		      }

		      char a = (char)c;

			  System.out.print(a);
		  }
		  System.out.println();
		  s--;
	  }
	  System.out.println();
   }
}