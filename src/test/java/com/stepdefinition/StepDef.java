package com.stepdefinition;

import com.base.BaseClass;
import com.pojo.PojoClass;

import io.cucumber.java.en.*;

public class StepDef extends BaseClass{

@Given("user enter the username and password")
public void user_enter_the_username_and_password() {
  BrowserLaunch("https://www.facebook.com/");	
}
@When("user enter the valid the crdentials")
public void user_enter_the_valid_the_crdentials() {
   PojoClass p=new PojoClass();
   firstName(p.getUserName(), "9789814217");
   firstName(p.getPassWord(), "devipriya");
}
@Then("user verify successfully")
public void user_verify_successfully() {
	 PojoClass p=new PojoClass();
	login(p.getLogin()); 
}
}
