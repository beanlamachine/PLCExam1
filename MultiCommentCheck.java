/*Question Number 16
 */
import java.util.regex.*;

public class MultiCommentCheck {


  
  
    // Function to validate the string
    public static boolean isitComment(String name)
    {
  
        // Regex to check valid string.
        String regex = "/\\*.*?|[\n]?\\*/";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex, Pattern.DOTALL);
  
        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(name);
  
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
  
    // Driver Code
    public static void main(String[] args)
    {
  
        // Test Case: 1
        String str1 = "/* this is comment \t \n */";
        System.out.println(isitComment(str1));
  

    }

    
}
