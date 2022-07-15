public class LoopProb93
{
  public static void main(String[] args)
  {
    System.out.println();

    int r=9,n=5;

    for(int i=1;i<=n;i++)
    {
		int c=r;

		if(i==n-1)
		{
			c=n-1;
		}

		else if(i==n)
		{
			c=1;
		}

        for(int j=1;j<=i;j++)
	    {
			if(i==n)
			{
		       System.out.print(c+" ");
		       c=c-2;
		    }
		    else
		    {
			   if(i==4&&j==4||i==4&&j==3)
			   {
				   System.out.print(c+" ");
		           c=c-2;
			   }
			   else
			   {
				   System.out.print(c+"  ");
		           c=c-2;
			   }
			}
	    }

	    r--;

	    System.out.println();
	}
    System.out.println();
  }
}