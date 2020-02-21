/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Hp
 */
//import java.util.Scanner;
public class PasswordValidator {
    final static  int NUMBEROFCHAR =7;
      final static  int CHARCOUNT =1;
    public static String pv(String s){
      boolean validPassword=false;
        String password="";
        while(!validPassword)
        {
           
            password = s;
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>=CHARCOUNT &&password.length()>NUMBEROFCHAR)
            {
                validPassword=true;
            }
        }
    
    
    
    
    return password;
    
    }
}
