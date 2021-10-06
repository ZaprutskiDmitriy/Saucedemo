# Update versions of all libraries in the project
+ mvn versions:display-dependency-updates
  
  [INFO] The following dependencies in Plugin Dependencies have newer versions:
  
  [INFO]   org.aspectj:aspectjweaver .......................... 1.9.6 -> 1.9.8.M1
  
+ mvn versions:use-latest-versions
  
  [INFO] Major version changes allowed
  
  [INFO] Updated org.seleniumhq.selenium:selenium-java:jar:3.141.59 to version 4.0.0-rc-1
  
  [INFO] Updated io.github.bonigarcia:webdrivermanager:jar:4.4.3 to version 5.0.1
  
  [INFO] Updated io.qameta.allure:allure-testng:jar:2.13.9 to version 2.14.0

# Run tests using mvn clean test command

+ mvn clean test

Tests run: 7, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 27.672 s <<< FAILURE!

# Use parameters to run specific tests and methods

+ mvn -Dtest=CheckoutTest test
  
  Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.035 s

+ mvn -Dtest=LogoutTest#logoutTest test
  
  Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.054 s
  
# Pass a parameter from the mvn command line inside the test

+ mvn -Dtest=CheckoutTest test -DtestProp=test123

test123

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.59 s

