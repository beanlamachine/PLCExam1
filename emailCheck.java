/*Question Number 8
 */
import java.util.regex.*;   //9
public class emailCheck {   //4


  
  
    // Function to validate the string
    public static boolean isStringValid(String name)    //8
    {   //1
  
        // Regex to check valid string.
        String regex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";  //5
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex); //10
  
        // If the username is empty
        // return false
        if (name == null) { //7
            return false;   //3
        }   //1
  
        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(name);    //10
  
        // Return if the string
        // matched the ReGex
        return m.matches(); //7
    }   //1
  
    // Driver Code
    public static void main(String[] args)  //10
    {   //1
  
        // Test Case: 1
        String str1 = "bnguyen69@student.gsu.edu";  //5
        System.out.println(isStringValid(str1));    //12
  
        // Test Case: 2
        String str3 = "-email.email@gmail.com"; //5
        System.out.println(isStringValid(str3));    //12
  
        // Test Case: 3
        String str5 = "what@what.com";  //5
        System.out.println(isStringValid(str5));    //12
    }   //1

    
}   //1

    //total lexems is 130