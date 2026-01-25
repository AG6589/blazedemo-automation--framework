# ✈️ BlazeDemo Automation Framework

## 📌 Project Overview
This project is a Selenium-based automation framework built to automate the BlazeDemo flight booking web application.  
It covers the complete end-to-end workflow:  
Search flights → Find lowest price → Select flight → Enter passenger details → Confirm booking.

The framework follows the Page Object Model (POM) design pattern to ensure easy maintenance, reusability, and scalability.

---

## 🛠️ Tech Stack
- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Page Object Model (POM)  
- Git & GitHub  
- Eclipse IDE  

---

## 🗂️ Project Structure

blazedemo-automation  
│  
├── src/test/java  
│   ├── com.blazedemo.base      → Browser setup & teardown  
│   ├── com.blazedemo.pages    → Page classes (POM)  
│   └── com.blazedemo.tests    → Test classes  
│  
├── pom.xml  
├── testng.xml  
└── README.md  

---

## ✅ Test Scenario Covered

- Launch BlazeDemo application  
- Select departure and destination city  
- Search available flights  
- Capture all flight prices from web table  
- Identify and select the lowest priced flight dynamically  
- Fill passenger and payment details  
- Book the flight  
- Validate booking confirmation page  

---

## ▶️ How to Run the Project

### 🔹 Prerequisites
- Java installed  
- Maven installed  
- Eclipse / IntelliJ IDEA  
- Google Chrome browser  

---

### 🔹 Steps to Execute

1. Clone the repository  
   git clone <your-github-repo-url>

2. Open the project in Eclipse  
3. Right-click on pom.xml → Maven → Update Project  
4. Open testng.xml  
5. Right-click → Run As → TestNG Suite  

---

## 🧠 Key Automation Highlights

- Page Object Model (POM) based design  
- Dynamic web table handling  
- Lowest flight price detection logic  
- TestNG lifecycle management  
- Assertions for validation  
- Maven dependency management  

---

## 📸 Sample Output

- Automatically selects the cheapest flight  
- Completes booking  
- Verifies confirmation page  

---

## 🚀 Future Enhancements

- Extent Report integration  
- Screenshot capture on failure  
- Cross-browser testing  
- Config file support  
- Jenkins CI integration  

---

## 👤 Author

Suryance Raj  
Aspiring QA / Automation Engineer  
Skilled in Manual + Automation Testing (Selenium, Java, TestNG)

