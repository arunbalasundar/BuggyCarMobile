package appiumandroidtest;

import org.junit.Test;

import Pages.LoginScreen;
import Pages.ProfileScreen;

public class AndroidVoteCar extends setup {	  
	    @Test	
	    public void votecomment() throws Exception {	
	    	LoginScreen login = new LoginScreen();		    	 
	    	login.loginclicks();
	    	ProfileScreen update = new ProfileScreen();		    	 
	    	update.votecomment();			    	 
		}	
	    
	    @Test	
	    public void votenocomment() throws Exception {	
	    	LoginScreen login = new LoginScreen();		    	 
	    	login.loginclicks();
	    	ProfileScreen update = new ProfileScreen();		    	 
	    	update.votenocomment();	    	
		}	   
}
