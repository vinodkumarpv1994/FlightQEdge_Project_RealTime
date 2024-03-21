package flightQEdge.testCases;

import flightQEdge.library.User;
import utils.AppUtils;

public class NewUser_Registration {

	public static void main(String[] args) {
		
		AppUtils.launchApp("http://flights.qedgetech.com");
		
		User us = new User();
		boolean res = us.userRegistration("Uday Kumar", "9999912345", "udaykumar@gmail.com", "Vinod@1994", "Male", "24-08-1994");
        if(res)
        {
        	System.out.println("New User registred succesfull ---> Test Pass");
        }
        else
        {
        	System.out.println("New User not registred  ---> Test Fail");
        }
        
        AppUtils.closeApp();
	}

}
