import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner h=new Scanner(System.in);
      int n=h.nextInt();
      for(int i=0;i<=n;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
        }
      }
	}
}