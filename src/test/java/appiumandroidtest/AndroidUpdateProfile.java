package appiumandroidtest;

import org.junit.Test;

import Pages.LoginScreen;
import Pages.ProfileScreen;

public class AndroidUpdateProfile extends setup {	  
	    @Test	
	    public void updatebasic() throws Exception {	
	    	LoginScreen login = new LoginScreen();		    	 
	    	login.loginclicks();
	    	ProfileScreen update = new ProfileScreen();		    	 
	    	update.updatebasic();			    	 
		}	
	    
	    @Test	
	    public void updateadd() throws Exception {	
	    	LoginScreen login = new LoginScreen();		    	 
	    	login.loginclicks();
	    	ProfileScreen update = new ProfileScreen();		    	 
	    	update.updateadd();		    	
		}	
	    
	    @Test	
	    public void noupdate() throws Exception {	
	    	LoginScreen login = new LoginScreen();		    	 
	    	login.loginclicks();
	    	ProfileScreen update = new ProfileScreen();		    	 
	    	update.noupdate();		
		}	
}
