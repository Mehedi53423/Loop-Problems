import java.util.*;

public class LoopProb81
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter The Number Of Rows : ");
    int n = sc.nextInt();

    System.out.println();

    int c=1;
    char a=65;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
	    {
			if(i%2==0)
			{
			    System.out.print(a+" ");
			    a++;
			}
			else
			{
			    System.out.print(c+" ");
			    c++;
		    }
	    }
	    System.out.println();
	}
    System.out.println();
  }
}