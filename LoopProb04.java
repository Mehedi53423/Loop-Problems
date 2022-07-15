import java.util.Scanner;

public class LoopProb04
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
		 for(j=1;j<=n;j++)
		 {
			 if(i>=j)
			 {
				 System.out.print("#      ");
			 }
			 else
			 {
				 System.out.print("       ");
			 }
		 }
		 System.out.println();
	 }
	 System.out.println();
  }
}