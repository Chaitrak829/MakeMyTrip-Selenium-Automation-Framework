# MakeMyTrip Hotel Automation Framework

This project automates the hotel search functionality in MakeMyTrip using Selenium WebDriver and TestNG. It also includes API automation using Rest Assured and supports parallel execution.

---

## Project Objective

The automation script performs the following steps:

1. Launch the MakeMyTrip website  
2. Search for hotels in Mumbai  
3. Capture the list of available hotels  
4. Print hotel names in the console  
5. Generate TestNG execution report  
6. Validate API responses using Rest Assured  
7. Integrate API and UI for end-to-end validation  
8. Execute tests in parallel  

---

## Tools Used

- Java  
- Selenium WebDriver  
- TestNG  
- Rest Assured  
- Maven  
- Eclipse IDE  
- Git & GitHub  

---

## Framework Design

The framework is developed using:

- Page Object Model (POM)  
- DriverFactory design pattern (ThreadLocal for parallel execution)  
- Reusable BaseTest class  
- TestNG framework  
- Separate modules for UI and API automation  

---

## Test Scenario Covered

### UI Automation
- Verify that the user is able to search hotels in Mumbai and view the list of available hotels  

### API Automation
- Validate API response status codes  
- Extract and validate response data  

### End-to-End
- Fetch data from API and validate in UI  

---

## How to Run the Project

1. Download or clone the project  
2. Open the project in Eclipse  
3. Right click on `testng.xml`  
4. Click **Run As → TestNG Suite**  

---

## Output

After execution:

- Hotel names will be printed in the console  
- TestNG report will be generated in the `test-output` folder  
- API response will be validated and printed  
- Screenshots will be captured on failure  

---

## Author

Automation Tester – 3.5 Years Experience