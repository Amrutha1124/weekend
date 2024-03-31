package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class UserModule extends BaseClass {
	
	@Test(groups="smoketest")
	public void createUser() {
		Reporter.log("createUser",true);
	}@Test(groups="regressiontest")
	public void deleteUser() {
		Reporter.log("deleteUser",true);
	}
	@Test(groups="regressiontest")
	public void modifyUser() {
		Reporter.log("modifyUser",true);
	}

}
