package flightQEdge.testCases;

import flightQEdge.library.LoginPage;
import utils.AppUtils;

public class UserLogin_ValidInputs {

	public static void main(String[] args) {
        AppUtils.launchApp("http://flights.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("vinodkumarpv1994@gmail.com", "Kumar@1994");
		boolean res = lp.isUserModuleDisplayed();
        
		if(res)
        {
        	System.out.println("User module is Displayed  ---> Test Pass");
        }
        else
        {
        	System.out.println("User module is displayed ---> Test Fail");
        } 
		
		lp.logout();
        AppUtils.closeApp();

	}

}
