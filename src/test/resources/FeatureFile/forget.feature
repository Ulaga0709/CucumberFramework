Feature:
				To Validate Forgot Password Functionality of Facebook WebPage
				
				Background:
									Given Users in Login Page
									Scenario Outline:
																	 To Validate the users enter the phonenumber
																	 When User click the forgot password link
																	 And User ente the "<Phnonenumber>" 
																	 Then User click the search button
																	 
																	 Examples:
																						|Phonenumber|
																						|9944014422	|
																						|1234556677	|
																						|7477754767	|