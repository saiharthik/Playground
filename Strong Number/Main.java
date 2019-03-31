import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner h=new Scanner(System.in);
      int num=h.nextInt();
     int temp, mod, sum = 0;
    
        temp = num;
    
        while(num > 0)
        {
            mod = num % 10;
    
            sum=sum + fact (mod);
    
            num  = num /10;
                    
        }
        if(temp == sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static int fact(int num)
    {
        int fact=1;
    
        for(int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }
}