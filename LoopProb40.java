import java.util.Scanner;

public class LoopProb40
{
  public static void main(String[] args)
  {
     int i,j,k,n,p=0,m=1;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     int l=n+(n-1);

     for(i=1;i<=l;i++)
     {
		 char c='@';

		 if(i>n)
		 {
			 p--;
		 }
		 else
		 {
			 p++;
		 }

		 for(j=n;j>p;j--)
		 {
			 System.out.print(" ");
		 }

		 for(k=1;k<=m;k++)
		 {
			 c++;
			 System.out.print(c);
		 }
		 System.out.println();

		 if(i<n)
		 {
		     m++;
		 }
		 else
		 {
		 	 m--;
		 }
	 }
	 System.out.println();
  }
}