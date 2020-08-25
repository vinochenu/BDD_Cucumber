@Validlogin @Invalidlogin
Feature: Veify Orange Login Page
Scenario: Verify the login-positive
	Given Open the url
	When enter username as "Admin" and password as "admin123"
	And click submit
	Then Login should be successfull
	

Scenario: Verify the login- negative
	Given Open the url
	When enter username as "Admin" and password as "admin123"
	And click submit
	Then Login should be successfull