import java.util.Scanner;

public class LoopProb38
{
  public static void main(String[] args)
  {
     int i,j,k,m=1,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     for(i=1;i<=n;i++)
     {
		 char c='@';

		 for(j=n;j>i;j--)
		 {
			 System.out.print(" ");
		 }
		 for(k=1;k<=m;k++)
		 {
			 if(k<=i)
			 {
				 c++;
			 }
			 else
			 {
				 c--;
			 }
			 System.out.print(c);
		 }
		 System.out.println();

         m=m+2;
	 }
	 System.out.println();
  }
}