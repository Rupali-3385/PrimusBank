Feature: Login feature

Background: user is successfully logged in
When user open the "chrome" browser and exe "C:\AutomationProject\pharma2\src\test\resources\DRIVERS\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com"


Scenario: Login functionali for valid username and valid password
When user enters "Admin" as username
When user enters "Admin" as username
When user click on Login button
Then  user is on "Admin" main page and get message as welcome to admin

 