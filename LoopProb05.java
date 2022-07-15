import java.util.Scanner;

public class LoopProb05
{
  public static void main(String[] args)
  {
     int i,j,k,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     for(i=1;i<=n;i++)
     {
		 for(j=n;j>i;j--)
		 {
			 System.out.print("        ");
		 }
		 for(k=1;k<=i;k++)
		 {
		 	 System.out.print("@       ");
		 }
		 System.out.println();
	 }
	 System.out.println();
  }
}