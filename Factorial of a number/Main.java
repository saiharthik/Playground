import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner h=new Scanner(System.in);
      int n=h.nextInt();
      int fact=1;
      for(int i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
	}
}