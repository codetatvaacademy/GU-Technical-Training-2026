# Sorting Algorithm Visualizer

This project visualizes the execution of Quick Sort, Merge Sort, and Selection Sort algorithms using a React frontend and a Java Spring Boot backend.

**Table of Contents**

1.  Project Overview
2.  Technology Stack
3.  Prerequisites (Windows Specific)
4.  Setup and Installation
    * Backend (Java/Spring Boot)
    * Frontend (React)
5.  Running the Application
    * Backend
    * Frontend
6.  API Documentation
7.  Contributing
8.  Troubleshooting
9.  License

**1. Project Overview**

This application provides an interactive visualization of common sorting algorithms. Users can input a list of numbers, select a sorting algorithm, and observe the sorting process step-by-step using a bar chart. This project aims to enhance the understanding of these algorithms and their comparative performance.

**2. Technology Stack**

* **Frontend:**
    * React
    * JavaScript
    * HTML
    * CSS
    * Bootstrap (React-Bootstrap)
    * Chart.js (react-chartjs-2)
* **Backend:**
    * Java (JDK 17 or later)
    * Spring Boot
    * Maven

**3. Prerequisites (Windows Specific)**

Before you begin, ensure you have the following software installed on your Windows machine:

* **Java Development Kit (JDK):**
    * Download and install the latest JDK 17 (or later) from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).
    * Set the `JAVA_HOME` environment variable:
        * Search for "Environment Variables" in the Windows Start menu.
        * Click "Edit the system environment variables."
        * Click "Environment Variables..."
        * Under "System variables," click "New..."
        * Variable name: `JAVA_HOME`
        * Variable value: The path to your JDK installation (e.g., `C:\Program Files\Java\jdk-17.0.x`).
        * Edit the `Path` variable and add `%JAVA_HOME%\bin`.
    * Verify installation: Open Command Prompt and run `java -version` and `javac -version`.

* **Maven:**
    * Download the latest Maven binary from [Apache Maven's website](https://maven.apache.org/download.cgi.html).
    * Extract the archive to a directory (e.g., `C:\apache-maven`).
    * Set the `M2_HOME` environment variable:
        * Follow the same steps as for `JAVA_HOME`.
        * Variable name: `M2_HOME`
        * Variable value: The path to your Maven installation (e.g., `C:\apache-maven`).
        * Edit the `Path` variable and add `%M2_HOME%\bin`.
    * Verify installation: Open Command Prompt and run `mvn -version`.

* **Node.js and npm (Node Package Manager):**
    * Download and install the latest LTS version of Node.js from [Node.js website](https://nodejs.org/). This will install both Node.js and npm.
    * Verify installation: Open Command Prompt and run `node -v` and `npm -v`.

* **Git (Optional but Recommended):**
    * Download and install Git for Windows from [Git's website](https://git-scm.com/download/win).
    * Verify installation: Open Git Bash or Command Prompt and run `git --version`.

* **IDE (Integrated Development Environment):**
    * For Java development, IntelliJ IDEA, Eclipse, or VS Code with Java extensions are recommended.
    * For React development, VS Code is recommended.

**4. Setup and Installation**

**a. Backend (Java/Spring Boot)**

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/anyaaseth08/GU-Technical-Training-2026.git
    cd sorting-visualizer/backend
    ```

2.  **Build the project using Maven:**
    ```bash
    mvn clean install
    ```

3.  **(Optional) Import into your IDE:**
    * If using IntelliJ IDEA, open the `pom.xml` file as a Maven project.
    * If using Eclipse, import the project as a Maven project.
    * If using VS Code, install the Java extensions and open the project folder.

**b. Frontend (React)**

1.  **Navigate to the frontend directory:**
    ```bash
    cd ../frontend
    ```

2.  **Install dependencies:**
    ```bash
    npm install
    ```

**5. Running the Application**

**a. Backend**

1.  **Run the Spring Boot application:**
    * **Using Maven:**
        ```bash
        mvn spring-boot:run
        ```
    * **Using your IDE:** Run the `SortingVisualizer.java` class.

    The backend will start on `http://localhost:8080`.

**b. Frontend**

1.  **Start the React development server:**
    ```bash
    npm start
    ```

    The frontend will open in your default browser at `http://localhost:3000`.

**6. API Documentation**

* **Endpoint:** `POST /sort`
* **Request Body (JSON):**
    ```json
    {
      "numbers": [5, 2, 8, 1, 9, 4],
      "algorithm": "quickSort" // or "mergeSort", "selectionSort"
    }
    ```
* **Response Body (JSON):**
    ```json
    [
      [5, 2, 8, 1, 9, 4], // Initial state
      [2, 5, 8, 1, 9, 4], // Step 1
      // ... other steps
      [1, 2, 4, 5, 8, 9] // Final sorted state
    ]
    ```

**7. Contributing**

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes.
4.  Commit your changes and push to your fork.
5.  Submit a pull request.

**8. Troubleshooting**

* **Backend not starting:**
    * Ensure JDK and Maven are installed and configured correctly.
    * Check for port conflicts (port 8080).
    * Review the console output for error messages.
* **Frontend not starting:**
    * Ensure Node.js and npm are installed.
    * Delete the `node_modules` folder and run `npm install` again.
    * Check for port conflicts (port 3000).
    * Review the console output for error messages.
* **API calls failing:**
    * Verify that both the backend and frontend are running.
    * Check the API endpoint and request/response formats.
    * Use browser developer tools (Network tab) to inspect API requests and responses.

**9. License**

This project is licensed under the [MIT License](LICENSE).
