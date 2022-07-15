public class LoopProb53
{
   public static void main(String[] args)
   {
      int i,j,n=3;

      System.out.println();

      int l = n+(n-1);

      for(i=1;i<=l;i++)
      {
		  int c = n;

		  for(j=1;j<=l;j++)
		  {
			  if(i != 1 && i != l && j != 1 && j != l)
			  {
				if(i == n && j == n)
				{
					c = 1;
				}
				else
				{
					c = n-1;
				}
			  }
			  else
			  {
				  c = n;
			  }
			  System.out.print(c);
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}