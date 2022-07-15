import java.util.Scanner;

public class LoopProb09
{
  public static void main(String[] args)
  {
     int i,j,n,c=1;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     for(i=1;i<=n;i++)
     {
		 for(j=1;j<=n;j++)
		 {
			 System.out.print(c);
		 }
		 System.out.println();
		 c++;
	 }
	 System.out.println();
  }
}