Feature: Veify Orange Login Page with DataTable with  header pair
Scenario: Verify the login with DataTable with  header
	Given Open the Orange hrm url with header pair
	When enter the below given credential with header pair
	|Username|Password |
	|vinoalphaq@gmail.com | Puspam@3118 |
	And click the submit button
	Then Login should be successful with header pair