import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner ha=new Scanner(System.in);
      int n=ha.nextInt();
     int a=n/100;
      int b=n%10;
     int sum=a+b;
      System.out.println(sum);
	}
}