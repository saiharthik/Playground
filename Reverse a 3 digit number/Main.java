import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n,r=0;
    Scanner ha=new Scanner(System.in);
    n=ha.nextInt();
    while(n!=0)
    {
      r=r*10;
      r=r+n%10;
      n=n/10;
    }
    System.out.println(r);
    
  }
}