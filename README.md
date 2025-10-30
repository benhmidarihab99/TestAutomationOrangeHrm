# Test Automation Project: OrangeHRM

## Project Overview
This project is a comprehensive automated testing suite for the **OrangeHRM** web application, designed to validate key functionalities of the system using **Selenium WebDriver** and **Cucumber (BDD)**. The goal is to ensure that core workflows, such as user authentication and user management, work correctly and reliably.

## Tested Features
- **User Login:** Validates login functionality for different users.  
- **User Search by Username:** Verifies that administrators can search for users by username and see the correct results in the table.  
- **User Search by Role:** Verifies that administrators can filter users based on their role (e.g., ESS, Admin) and see the correct results.
- **User Search by Employe name:** 
- **Navigation & UI Actions:** Includes interactions with buttons, dropdowns, and tables throughout the OrangeHRM interface.

## Framework Details
- **Language:** Java  
- **Testing Framework:** Cucumber with BDD approach  
- **Automation Tool:** Selenium WebDriver  
- **Reporting:** ExtentReports (HTML and PDF)  
- **Design Pattern:** Page Object Model (POM) for cleaner separation of page elements and actions  
- **Browser:** Chrome (configurable via WebDriver)  
- **Waiting Strategy:** Explicit waits to handle dynamic web elements  

## Project Structure
- `src/test/ressources/features` → Feature files defining test scenarios  
- `src/test/java/stepDefinitions` → Step definitions implementing test steps  
- `src/test/java/pageObject` → Page Object classes with locators and actions  
- `reports` → Generated HTML and PDF test reports  

## Key Highlights
- Supports **dynamic role selection** in user search dropdowns.  
- Logs test execution details in console and reports for traceability.  
- Modular and reusable step definitions to reduce duplication.  
- Designed to scale for additional feature automation in the future.
