import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int a[]=new int[10];
      Scanner h=new Scanner(System.in);
      int size=h.nextInt();
      for(int i=0;i<size;i++)
      {
         a[i]=h.nextInt();
      }
      int max=a[0];
      for(int i=0;i<size;i++)
      {
        if(max<a[i])
        {
          max=a[i];
        }
      }
      System.out.println(max);
    }
}