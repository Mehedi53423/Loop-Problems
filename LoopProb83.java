public class LoopProb83
{
  public static void main(String[] args)
  {
	  int n=4;
      int[] a= new int[n];

      a[0]=4;
	  a[1]=5;
	  a[2]=7;
	  a[3]=2;

      System.out.println();

      for(int i=0;i<n;i++)
      {
		  int c=i;

          for(int j=n;j>i;j--)
	      {
			  System.out.print(a[c]);
			  c++;
	      }
	      System.out.println();
	  }
      System.out.println();
  }
}