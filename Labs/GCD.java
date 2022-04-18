
/**
 * Write a description of class GCD here.
 *
 * @Santiago Perez
 * @4/19/2022
 */
public class GCD
{
    public GCD()
    {
    }
    
    public static int gcd(int eins, int zwei)
    {
        int lastNum = 0; 
        if ((zwei<=eins)&&(zwei%eins==0)){
            lastNum = zwei; 
        }
        else if (eins<zwei)
        {
            lastNum = gcd(zwei, eins); 
        }
        else
        {
            lastNum = gcd(zwei, eins%zwei);  
        }
        return lastNum; 
    }
}
