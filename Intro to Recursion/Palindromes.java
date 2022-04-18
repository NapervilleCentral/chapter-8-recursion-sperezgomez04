public class Palindromes
{
   public static void main(String[] args)
   {
      String sentence1 = "Madam, I'm Adam!";
      System.out.println(sentence1);
      System.out.println("Palindrome: " + isPalindrome(sentence1));
      String sentence2 = "Sir, I'm Eve!";
      System.out.println(sentence2);
      System.out.println("Palindrome: " + isPalindrome(sentence2));
   }
   
    public static boolean isPalindrome(String text)
   {
    int length = text.length(); 
    
    if (length <=1){return true; }

    else
    {
       char first  = Character.toLowerCase(text.charAt(0));
       char last = Character.toLowerCase(text.charAt(length-1)) ;
       if (Character.isLetter(first) && Character.isLetter(last))
       {
           if (first == last)
           {
               String shorter = text.substring(1,length-1); 
               return isPalindrome(shorter); 
               
            }
           else
           {
               return false;
            } 
       }
       else if (!Character.isLetter(last))
       {
           String shorter = text.substring (0,length-1); 
           return isPalindrome(shorter); 
        }
       else 
       {
          String shorter = text.substring(1,length); 
          return isPalindrome(shorter); 
        }
    }
    }
}
