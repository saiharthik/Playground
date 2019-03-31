import java.util.Scanner;
//import java.lang.Math;
class Main
{
  public static int power(int b,int c)
  {
    int temp=1;
    for(int i=1;i<=c;i++)
    {
     temp=temp*b;
    }
    return temp;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner h=new Scanner(System.in);
      int b=h.nextInt();
      int c=h.nextInt();
      int d=power(b,c);
      System.out.println(d);
	}
}