package flightQEdge.testCases;

import flightQEdge.library.LoginPage;
import flightQEdge.library.Ticket;
import utils.AppUtils;

public class BooingFlightTicket {

	public static void main(String[] args) throws InterruptedException {
		
        AppUtils.launchApp("http://flights.qedgetech.com");
		LoginPage lp = new LoginPage();
		lp.login("vinodkumarpv1994@gmail.com", "Kumar@1994");
		Ticket tk = new Ticket();
		boolean res = tk.bookTicket("29/02/1994", "Hyderabad", "Kolkatha", "Vinod Kumar");
        
		if(res)
        {
        	System.out.println("User booked ticket successfull ---> Test Pass");
        }
        else
        {
        	System.out.println("User not book ticket---> Test Fail");
        } 
		
		lp.logout();
        AppUtils.closeApp();


	}

}
