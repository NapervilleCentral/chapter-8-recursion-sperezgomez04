
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
        System.out.println(gcd(10,100)); 
        System.out.println(gcd(2,3));
        System.out.println(gcd(14,21));
    }
    
    public static int gcd(int num1, int num2)
    { 
        if ((num2<=num1)&&((num1%num2)==0)){
            return num2; 
        }
        else if (num1<num2)
        {
            return gcd(num2, num1); 
        }
        else
        {
            return gcd(num2, num1%num2);  
        } 
 
    }
}
