package flightQEdge.testCases;

import flightQEdge.library.LoginPage;
import flightQEdge.library.Ticket;
import utils.AppUtils;

public class DeleteFlightTicket {

	public static void main(String[] args) {
		
		AppUtils.launchApp("http://flights.qedgetech.com");
		LoginPage lp = new LoginPage();
		lp.login("vinodkumarpv1994@gmail.com", "Kumar@1994");
		Ticket tk = new Ticket();
		boolean res = tk.delTicket("9795");
        
		if(res)
        {
        	System.out.println("Flight ticket deleted successfull ---> Test Pass");
        }
        else
        {
        	System.out.println("Flight ticker not deleted---> Test Fail");
        } 
		
		lp.logout();
        AppUtils.closeApp();

	}

}
