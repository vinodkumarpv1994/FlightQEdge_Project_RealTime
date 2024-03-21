package flightQEdge.testCases;

import flightQEdge.library.LoginPage;
import utils.AppUtils;

public class UserChangePassword {
     
	public static void main(String[] args) throws InterruptedException {
		AppUtils.launchApp("http://flights.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("vinodkumarpv1994@gmail.com", "Vinod@1994");
		String sucMSG = lp.changePWD("Vinod@1994", "Kumar@1994");
		lp.logout();
		lp.login("vinodkumarpv1994@gmail.com", "Kumar@1994");
        boolean res = lp.isUserModuleDisplayed();
        
		if(res)
        {
        	System.out.println(sucMSG + " ---> Test Pass");
        }
        else
        {
        	System.out.println("Change password is not updated ---> Test Fail");
        }
		lp.logout();
		AppUtils.closeApp();

	}

}
