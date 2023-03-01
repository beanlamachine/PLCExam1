/*Question Number 9
 */
import java.util.regex.*;
public class FloatLikeAButterflyy {


  
  
    // Function to validate the string
    public static boolean isitFloat(String name)
    {
  
        // Regex to check valid string.
        String regex = "[-+]?([0-9]*.[0-9]+|[0-9]+.)([eE][-+]?[0-9]+)?[LlFf]?|[-+]?[0-9]+[eE][-+]?[0-9]+[LlFf]?";
  
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
        String str1 = "15.73L";
        System.out.println(isitFloat(str1));
  
        // Test Case: 2
        String str3 = "1.575E1";
        System.out.println(isitFloat(str3));
  
        // Test Case: 3
        String str5 = "2.5f";
        System.out.println(isitFloat(str5));

        // Test Case: 4
        String str6 = "--0.00";
        System.out.println(isitFloat(str6));
    }

    
}
