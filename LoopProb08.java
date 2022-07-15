import java.util.Scanner;

public class LoopProb08
{
  public static void main(String[] args)
  {
     int i,j,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     int c=n;

     for(i=1;i<=n;i++)
     {
		 for(j=1;j<=n;j++)
		 {
			 System.out.print(c);
		 }
		 System.out.println();
		 c--;
	 }
	 System.out.println();
  }
}