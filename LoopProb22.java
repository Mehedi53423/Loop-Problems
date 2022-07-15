import java.util.Scanner;

public class LoopProb22
{
  public static void main(String[] args)
  {
     int i,j,n;
     char c='A';

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     for(i=1;i<=n;i++)
     {
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(c+" ");
		 }
		 System.out.println();
		 c++;
	 }
	 System.out.println();
  }
}