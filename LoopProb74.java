public class LoopProb74
{
   public static void main(String[] args)
   {
      int n=3,c=0;

      System.out.println();

      for(int i=1;i<=n;i++)
      {
		  for(int j=1;j<=n+1;j++)
		  {
			  if(j==1)
			  {
			      c=i;
			  }
			  else if(i==1 && j>1)
			  {
				  c=n;
			  }
			  else if(i==n && j==n+1)
			  {
				  c=1;
			  }
			  System.out.print(c);
		  }
		  System.out.println();
	  }
	  System.out.println();
   }
}