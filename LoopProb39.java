import java.util.Scanner;

public class LoopProb39
{
  public static void main(String[] args)
  {
     int i,j,k,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     int p=n+(n-1);

     for(i=1;i<=n;i++)
     {
		 char c='@';

		 for(j=1;j<i;j++)
		 {
			  System.out.print(" ");
		 }
		 for(k=p;k>=i;k--)
		 {
		 		if(k>=n)
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
		 p--;
	 }
	 System.out.println();
  }
}