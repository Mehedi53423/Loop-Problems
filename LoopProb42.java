import java.util.Scanner;

public class LoopProb42
{
   public static void main(String[] args)
   {
      int i,j,n,p;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  if(i==1)
		  {
			  p=n-1;
		  }
		  else
		  {
			  p=n-i;
		  }

		  for(j=n;j>=i;j--)
		  {
			  int c = 65+p;
			  char a = (char)c;

			  System.out.print(a);
			  p--;
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}