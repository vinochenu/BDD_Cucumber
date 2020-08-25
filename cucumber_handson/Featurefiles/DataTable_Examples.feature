Feature: Verify Mercury Tours with Examples
Scenario Outline: Verify Mercury Tours with Examples
	Given user enter Mercury URL
	When user enter "<Username>" and "<Password>"
	Then user click login button with example credential
	
	Examples:
	|Username | Password|
	|vinoalphaq@gmail.com | Puspam@3118 |
	|Admin | admin123 |