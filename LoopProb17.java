import java.util.Scanner;

public class LoopProb17
{
  public static void main(String[] args)
  {
     int i,j,k,l=1,n;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     for(i=1;i<=n;i++)
     {
		 int c=0;

		 for(j=n;j>i;j--)
		 {
			 System.out.print("        ");
		 }
		 for(k=1;k<=l;k++)
		 {
			 if(k<=i)
			 {
				 c++;
			 }
			 else
			 {
				 c--;
			 }
		 	 System.out.print(c+"       ");
		 }
		 System.out.println();
		 l=l+2;
	 }
	 System.out.println();
  }
}