package appiumandroidtest;

import org.junit.Test;

import Pages.RegisterScreen;

public class AndroidRegister extends setup {	  
	    @Test	
	    public void registerpass() throws Exception {	
	    	RegisterScreen register = new RegisterScreen();		    	 
	    	 register.registerpass();			    	 
		}	
	    
	    @Test	
	    public void loginfail() throws Exception {	
	    	RegisterScreen register = new RegisterScreen();	    	 
	    	 register.registerfail();			    	 
		}	   
}
