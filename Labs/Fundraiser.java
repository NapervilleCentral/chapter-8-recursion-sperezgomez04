
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
        System.out.println(countPeople(2000)); 
    }
    public static int countPeople(int money)
    {
        int people = 0; 
        for (int i = 0; i<10; i++)
        {
            if (money >1){
               people+=2; 
               people+=countPeople(money/20); 
            }
            else 
            {
                break; 
                }
        }
        return people; 
    }
}
