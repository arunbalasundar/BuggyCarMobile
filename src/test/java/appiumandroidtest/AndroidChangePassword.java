package appiumandroidtest;

import org.junit.Test;

import Pages.LoginScreen;
import Pages.ProfileScreen;

public class AndroidChangePassword extends setup {	  
	    @Test	
	    public void updatepass() throws Exception {	
	    	LoginScreen login = new LoginScreen();		    	 
	    	login.loginclicks();
	    	ProfileScreen update = new ProfileScreen();		    	 
	    	update.updatepass();			    	 
		}	
	    
	    @Test	
	    public void updatelogin() throws Exception {	
	    	LoginScreen login = new LoginScreen();		    	 
	    	login.go_to_homepage();
	    	login.entercorrectdetails1();
	    	login.clicklogin();
	    	login.verifylogin();	    	
		}	   
}
