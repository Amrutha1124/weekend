package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplemetation.class)
public class CustomerModule extends BaseClass{
	
	@Test(groups={"smoketest","regressiontest"})
	public void createCustomer() {
		Reporter.log("createCustomer", true);
	}
	@Test(groups="regressiontest")
	public void deleteCustomer() {
		Assert.fail();
		Reporter.log("deleteCustomer", true);
	}

	@Test(groups="regressiontest",dependsOnMethods = "deleteCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer", true);
	}
}
