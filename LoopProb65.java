import java.util.Scanner;

public class LoopProb65
{
   public static void main(String[] args)
   {
      int m=1,n,o=1,p=1;

      Scanner sc = new Scanner(System.in);

      System.out.print("\nEnter The Number Of Rows : ");
      n = sc.nextInt();

      System.out.println();

      int l=n+(n-1);
      int z=n-1;
      int r=z-1;

      for(int i=1;i<=l;i++)
      {
		  int c = 1;

		  for(int j=n;j>=m;j--)
		  {
		  	  System.out.print(c);
		  	  c++;
		  }

		  for(int k=1;k<m;k++)
		  {
		  	  System.out.print(" ");
		  }

		  for(int y=1;y<o;y++)
		  {
		  	  System.out.print(" ");
		  }

		  int a = r;

		  for(int q=z;q>=p;q--)
		  {
			  if(i==1 || i==2 || i==l-1 || i==l)
			  {
			      System.out.print(q);
			  }
			  else
			  {
				  System.out.print(a);
				  a--;
			  }
		  }

		  if(i>=2 && i<n)
		  {
			  r--;
		  }
		  else
		  {
			  r++;
		  }

		  if(i<n)
		  {
		  	 if(i==1)
		  	 {
		  		 p=1;
		  	 }
		  	 else
		  	 {
		  		 p++;
		  	 }
		  }
		  else
		  {
		  	 if(i==l-1)
		  	 {
		  		 p=1;
		  	 }
		  	 else
		  	 {
			     p--;
			 }
		  }

		  if(i<n)
		  {
		  	  m++;
		  }
		  else
		  {
		  	  m--;
		  }

		  if(i==1 || i==l)
		  {
			  o=1;
		  }
		  else if(i>=n)
		  {
			  o--;
		  }
		  else
		  {
			  o++;
		  }

		  System.out.println();
	  }
	  System.out.println();
   }
}