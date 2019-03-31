import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner h=new Scanner(System.in);
    int n=h.nextInt();
    int a[]=new int[10];
    for(int i=0;i<n;i++)
    {
      a[i]=h.nextInt();
    }
    int max=a[0],b=0;
    for(int i=0;i<n;i++)
    {
      if(max<a[i])
      {
        max=a[i];
        b=i;
      }
    }
    System.out.println(b);
  }
}