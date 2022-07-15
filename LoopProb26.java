public class LoopProb26
{
  public static void main(String[] args)
  {
	int i,j,k=0,n=5;
    char[] a = new char[n];

    a[0]='I';
    a[1]='N';
    a[2]='D';
    a[3]='I';
    a[4]='A';

	int l=2*n;

	System.out.println();

	for(i=1;i<=l;i++)
	{
	   if(i<=n)
	   {
		  k++;
	   }
	   else if(i==n+1)
	   {
		   k=n;
	   }
	   else
	   {
		  k--;
	   }
	   for(j=0;j<k;j++)
	   {
		   System.out.print(a[j]);
	   }
	   System.out.println();
	 }
	 System.out.println();
  }
}