import java.util.Scanner;

public class LoopProb14
{
  public static void main(String[] args)
  {
     int i,j,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     int k=1;

     for(i=1;i<=n;i++)
     {
		 int c=k;

		 for(j=1;j<=i;j++)
		 {
			 System.out.print(c);
			 c--;
		 }
		 System.out.println();
		 k++;
	 }
	 System.out.println();
  }
}