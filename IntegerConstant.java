/*Question Number 10
 */
import java.util.regex.*;
public class IntegerConstant {


  
  
    // Function to validate the string
    public static boolean isitIntConst(String name)
    {
  
        // Regex to check valid string.
        String regex = "([0-9]|[1-9][0-9]*|[0-7]+|0[xX][0-9a-fA-F]+)(i64|I64|u|U|l|L?)";
  
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
        String str1 = "4000000024u";
        System.out.println(isitIntConst(str1));
  
        // Test Case: 2
        String str3 = "02000000022l";
        System.out.println(isitIntConst(str3));
  
        // Test Case: 3
        String str5 = "0x4a44000000000020I64";
        System.out.println(isitIntConst(str5));

        // Test Case: 4
        String str6 = "0x2a";
        System.out.println(isitIntConst(str6));

        // Test Case: 5
        String str7 = "2.2Xa1";
        System.out.println(isitIntConst(str7));
    }

    
}
