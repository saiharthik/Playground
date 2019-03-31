import java.util.Scanner;
class Main
{
  public static int sq(int n)
  {
    int s=n*n;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner h=new Scanner(System.in);
      int n=h.nextInt();
      int ha=sq(n);
      System.out.println(ha);
	} 
}