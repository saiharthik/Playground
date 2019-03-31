import java.util.Scanner;
class Main
{
  public static int sn(int n)
  {
      int sum=0;
    for(int i=0;i<=n;i++)
    {
  
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner h=new Scanner(System.in);
      int n=h.nextInt();
      int sa=sn(n);
      System.out.println(sa);
	}
}