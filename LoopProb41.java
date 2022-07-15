import java.util.Scanner;

public class LoopProb41
{
   public static void main(String[] args)
   {
      int i,j,n,m=0,p=0;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Value Of n : ");
      n = sc.nextInt();

      System.out.print("\nThe Number Of Rows Are : "+(n+(n-1))+"\n");

      System.out.println();

      int l = n+(n-1);

      for(i=1;i<=l;i++)
      {
		  if(i<=n)
		  {
			  m++;
		  }
		  else
		  {
			  m--;
		  }

		  int c = 65+p;

		  for(j=1;j<=m;j++)
		  {
			  char a = (char)c;
			  System.out.print(a);
			  c--;
		  }

		  if(i<n)
		  {
		  	 p++;
		  }
		  else
		  {
		  	 p--;
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}