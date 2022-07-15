import java.util.Scanner;

public class LoopProb34
{
  public static void main(String[] args)
  {
     int i,j,k,m=1,n,p=0;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     int l=n+(n-1);

     for(i=1;i<=l;i++)
     {
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
			 System.out.print("*");
		 }
		 System.out.println();

		 if(i<n)
		 {
		     m=m+2;
	     }
	     else
	     {
			 m=m-2;
		 }
	 }
	 System.out.println();
  }
}