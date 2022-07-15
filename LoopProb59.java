import java.util.Scanner;

public class LoopProb59
{
   public static void main(String[] args)
   {
      int i,j,n;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      for(i=1;i<=n;i++)
      {
		  char a = 65;
		  int c = 1;

		  for(j=1;j<=i;j++)
		  {
		  	  if(i%2==0)
		  	  {
				  System.out.print(a);
				  a++;
			  }
			  else
			  {
				  System.out.print(c);
				  c++;
			  }
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}