import java.util.Scanner;

public class LoopProb29
{
  public static void main(String[] args)
  {
     int i,j,k,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     int l=n+(n-1);
     int c=0;

     for(i=1;i<=n;i++)
     {
		 for(j=1;j<i;j++)
		 {
			 System.out.print(" ");
		 }
		 for(k=l;k>=i;k--)
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
		 l--;
	 }
	 System.out.println();
  }
}