Feature: Veify Orange Login Page with DataTable with no header
Scenario: Verify the login with DataTable with no header
	Given Open the Orange hrm url 
	When enter the below given credential
	|Admin | admin123 |
	And click submit button
	Then Login should be successfull via DataTable with no header