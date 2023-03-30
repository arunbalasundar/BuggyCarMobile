package appiumandroidtest;

import org.junit.Test;
import Pages.LoginScreen;

public class AndroidLogin extends setup {	  
	    @Test	
	    public void loginpass() throws Exception {	
	    	 LoginScreen login = new LoginScreen();		    	 
	    	 login.loginclicks();			    	 
		}	
	    
	    @Test	
	    public void loginfail() throws Exception {	
	    	 LoginScreen login = new LoginScreen();		    	 
	    	 login.loginclicks1();			    	 
		}
	    
	    @Test	
	    public void loginempty() throws Exception {	
	    	 LoginScreen login = new LoginScreen();		    	 
	    	 login.loginclicks2();			    	 
		}
}
