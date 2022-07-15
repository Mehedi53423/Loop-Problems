import java.util.Scanner;

public class LoopProb20
{
  public static void main(String[] args)
  {
     int i,j,c=1,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     for(i=1;i<=n;i++)
     {
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(c+" ");
			 c++;
		 }
		 System.out.println();
	 }
	 System.out.println();
  }
}