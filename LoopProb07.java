import java.util.Scanner;

public class LoopProb07
{
  public static void main(String[] args)
  {
     int i,j,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     for(i=1;i<=n;i++)
     {
		 int c=n;

		 for(j=1;j<=n;j++)
		 {
			 System.out.print(c);
			 c--;
		 }
		 System.out.println();
	 }
	 System.out.println();
  }
}