import java.util.*;

public class LoopProb87
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Value Of n : ");
    int n = sc.nextInt();

    int l=n*2;
    int k=1,c=1;

    System.out.println("\nNumber Of Rows : "+l+"\n");

    for(int i=1;i<=l;i++)
    {
         for(int j=1;j<=k;j++)
	     {
			 if(j%2==0)
			 {
		         System.out.print("*");
			 }
			 else
			 {
				 System.out.print(c);
			 }
	     }

	     if(i<n)
		 {
		 	 k=k+2;
		 	 c++;
		 }
		 else if(i==n)
		 {
		 	 k=n+(n-1);
		 	 c=n;
		 }
		 else
		 {
		 	 k=k-2;
		 	 c--;
	     }

	     System.out.println();
	}
    System.out.println();
  }
}