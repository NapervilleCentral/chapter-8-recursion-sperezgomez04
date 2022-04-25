
/**
 * Write a description of class Fundraiser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fundraiser
{
    public static void main(String [] args)
    {
        System.out.println(countPeople(1000)); 
    }
    public static int countPeople(int money)
    {
        int people = 0; 
        System.out.println(money); 
        for (int i = 0; i<10; i++)
        {
            if (money >1){
               people+=1; 
               people+=countPeople(money/10); 
            }
            else 
            {
                break; 
                }
        }
        return people; 
    }
}
