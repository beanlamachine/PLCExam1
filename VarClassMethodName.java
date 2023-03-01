/*Question Number 15
 */
import java.util.regex.*;
public class VarClassMethodName {


  
  
    // Function to validate the string
    public static boolean isitValid(String name)
    {
  
        // Regex to check valid string.
        String regex = "[a-zA-Z_$]+[a-zA-Z_$0-9]*|[public|protected|private|static|\s]+[a-zA-Z_$0-9]*";
  
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
        String str1 = "beans";
        System.out.println(isitValid(str1));
  
        // Test Case: 2
        String str3 = "tester222";
        System.out.println(isitValid(str3));
  
        // Test Case: 3
        String str5 = "public checker";
        System.out.println(isitValid(str5));

    }

    
}
