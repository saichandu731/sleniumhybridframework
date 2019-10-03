package pageobjectmodel;

import org.testng.Assert;

public class ValidationHelperclass 
{
    public static  String verifythetestscript(String exp,String act)
    {
         try
         {
        	 Assert.assertEquals(exp, act);
        	 return "pass";
         }
         catch(AssertionError rv)
         {
        	 return "fail";
         }
    }
    
}
