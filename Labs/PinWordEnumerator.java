
import java.util.Scanner;

/**
   Converts a numeric pin to an equivalent word using the digit to
   letter mapping on a standard telephone keypad.
 */
public class PinWordEnumerator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n",num);
        enumerateWords(num);
    }

    /**
       A wrapper for a recursive method that enumerates all the
       phone keypad encodings for a number.
       @param n a string representing the number
     */
    public static void enumerateWords(String n)
    {
         // Implement a recursive method that generates
		 // all possible phone keypad encodings for a
		 // number. Implement additional auxiliary methods
		 // if necessary.
	 String wrd = new String(); 
         for (int i = 0; i<4; i++){
             if (n.substring(i,i+1).equals("2")){
                 wrd = 
                }
             else if (n.substring(i,i+1).equals("3")){
                }
             else if (n.substring(i,i+1).equals("4")){
                }
             else if (n.substring(i,i+1).equals("5")){
                }
             else if (n.substring(i,i+1).equals("6")){
                }
             else if (n.substring(i,i+1).equals("7")){
                }
             else if (n.substring(i,i+1).equals("8")){
                }
             else if (n.substring(i,i+1).equals("9")){
                }
            }

    }

    /**
	       Recursively generates all possible 'words' that represent
	       the telephone keypad encoding of a number.
	       @param pin the number
	       @param word representing the encoding a the pin
	     */
	    public static void enumerateWords(String pin, String word)
	    {
	        if (pin.length() == 0)
	        {
	            System.out.printf("%s%n",word);
			}
			else
			{
				String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

			}
        }

}
