import java.util.Scanner;

public class LoopProb28
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
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(i+" ");
		 }
		 System.out.println();
	 }
	 System.out.println();
  }
}