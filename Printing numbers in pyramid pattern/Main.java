import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here. 
      Scanner h=new Scanner(System.in);
      int n=h.nextInt();
      int num=1;
      for(int i=1;i<=n;i++)
      {
        for(int s=1;s<=n-i;s++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print(num);
          System.out.print(" ");
          num=num+1;
        }
        System.out.println();
      }
    }    
}