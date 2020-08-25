@Food
Feature: Preparation of food
Background:
# this Background will help to run pre-condition(not having post condition like After) steps  while hook having both pre & post condition but it will not mention in feature file.
# One feature file should have 1 Background only
# if a program having hook & background then hook will have 1st priority ( Hook will execute first & then background)
	Given person should know how to cook

Scenario: Prepare Breakfast item
	Given should have batter
	When Switch on stove
	Then prepare Dosa
	And have Breakfast
	
	Scenario: Prepare lunch item
	Given should have rice
	When power on stove
	Then prepare veg rice
	And have lunch
	