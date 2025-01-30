# BMI Calculator using Servlet

This web application calculates the Body Mass Index (BMI) based on user inputs for height and weight. The application uses Java servlets for the backend and handles the calculation logic. The result is displayed to the user based on their input.

## Features
- **User Input:** 
  - Users can input their height and weight via a simple form.
  
- **BMI Calculation:**
  - The servlet calculates the Body Mass Index (BMI) using the formula:  
    `BMI = weight / (height * height)`  
  - The formula takes height (in meters) and weight (in kilograms) to calculate the BMI value.

- **Result Display:**
  - The calculated BMI value is displayed to the user on a new page.
  
## Flow of the Application
1. **Form Submission:**
   - Users enter their height and weight into a form and submit it.
   
2. **Servlet Processing:**
   - The data is sent to the `/calculate` endpoint, which is handled by the `Apple` servlet.
   - The servlet calculates the BMI by parsing the height and weight from the request parameters.
   
3. **Forwarding Result:**
   - After the calculation, the BMI value is forwarded to the result page using a `RequestDispatcher`.

4. **Display Result:**
   - The BMI value is shown to the user on a separate page.

# WebServlet:
- The @WebServlet("/calculate") annotation defines the URL pattern (/calculate) that maps to this servlet, making it accessible via the web browser.
# Result Page:
- The result page displays the calculated BMI value passed by the servlet.

# Prerequisites:
- Java Development Kit (JDK) installed
- Apache Tomcat server for servlet execution
- IDE (Eclipse, IntelliJ, etc.) with support for Java EE (servlets)

# Usage Example:
# Input Fields:
- Height (in meters)
- Weight (in kilograms)
# Output:
- The calculated BMI will be displayed.

