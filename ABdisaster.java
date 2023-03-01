/*Question Number 14
 */
import java.util.regex.*;

public class ABdisaster {


  
  
    // Function to validate the string
    public static boolean isitTHEONE(String name)
    {
  
        // Regex to check valid string.
        String regex = "(((b*ab*ab*)* && (a*ba*ba*)*(a*ba*))(c|d)*|(cbadcbad)*)";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
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
        String str1 = "cbadcbad";
        System.out.println(isitTHEONE(str1));

    }

    
}
