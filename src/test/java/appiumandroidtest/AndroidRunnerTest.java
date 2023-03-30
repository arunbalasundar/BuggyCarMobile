package appiumandroidtest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses({
	AndroidLogin.class,	
	AndroidRegister.class,
	AndroidChangePassword.class,
	AndroidUpdateProfile.class,
	AndroidVoteCar.class,
	})

public class AndroidRunnerTest extends setup {
	
    @BeforeClass
   	public static void set() throws Exception{
        setup();
        System.out.println("Running runner file");
	} 	

	@AfterClass
	public static void End() {	   		
		driver.quit();
	}
}	 

	