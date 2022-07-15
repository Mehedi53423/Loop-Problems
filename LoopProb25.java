import java.util.Scanner;

public class LoopProb25
{
  public static void main(String[] args)
  {
     int i,j,k=0,n,c=0;

     Scanner sc = new Scanner(System.in);

     System.out.print("\nEnter The Number Of Row : ");
     n = sc.nextInt();

     System.out.println();

     int l=n+(n-1);

     for(i=1;i<=l;i++)
     {
		 if(i<=n)
		 {
			 c++;
			 k++;
		 }
		 else
		 {
			 c--;
			 k--;
		 }
		 for(j=1;j<=k;j++)
		 {
			 System.out.print(c+" ");
		 }
		 System.out.println();
	 }
	 System.out.println();
  }
}