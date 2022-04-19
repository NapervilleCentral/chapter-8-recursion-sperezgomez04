
/**
 * Write a description of class GCD here.
 *
 * @Santiago Perez
 * @4/19/2022
 */
public class GCD
{ 
    public static void main(String [] args)
    {
        System.out.println(gcd(100,2)); 
    }
    
    public static int gcd(int num1, int num2)
    {
        int lastNum; 
        if ((num2<=num1)&&(num2%num1==0)){
            lastNum = num2; 
        }
        else if (num1<num2)
        {
            lastNum = gcd(num2, num1); 
        }
        else
        {
            lastNum = gcd(num2, num1%num2);  
        } 
        return lastNum; 
    }
}
