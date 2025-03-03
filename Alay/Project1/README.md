# Code_Slumber
# LazySort - Sorting Visualizer

LazySort is a sorting algorithm visualization tool built with **React.js** and **Spring Boot**. It helps users understand how different sorting algorithms work by visualizing the step-by-step process.

## 🚀 Features
- Supports **Merge Sort, Quick Sort, and Selection Sort**
- Allows users to input custom numbers for sorting
- Interactive UI with real-time sorting animations
- Backend powered by **Spring Boot** for sorting logic
- Modern, dark-themed UI

## 🛠 Tech Stack
- **Frontend:** React.js, HTML, CSS
- **Backend:** Spring Boot (Java)

## 📦 Installation & Setup

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/mrvenom17/Code_Slumber.git
cd Code_Slumber
```

### 2️⃣ Install Frontend Dependencies
```sh
cd sorting-visualizer
npm install
```

### 3️⃣ Start the React App
```sh
npm start
```
This runs the app on `http://localhost:3000/`.

### 4️⃣ Start the Backend (Spring Boot)
- Navigate to the backend folder:
```sh
cd backend
```
- Run the Spring Boot application:
```sh
mvn spring-boot:run
```

### Trouble Shooting
- Make sure you have the latest version of Node.js and Maven installed.
- If you encounter any issues, try deleting the `node_modules` folder and running `npm install` again.
```
rm -rf node_modules # Linux
del /s /q node_modules # Windows

npm install
npm start
```
- If the Spring Boot application doesn't start, try deleting the `target` folder and running `mvn spring-boot:run` again.
```
rm -rf target # Linux
del /s /q target # Windows

mvn clean install -U
mvn spring-boot:run

```
- If you're still having trouble, feel free to open an issue on this repository.

## 📌 Usage
1. Select a **sorting algorithm** from the dropdown menu.
2. Enter an array of numbers (comma-separated).
3. Click **Sort** to visualize the sorting process.

## 📷 Screenshot
![LazySort UI](./screenshots/sorting-visualizer.png)

## 🤝 Contributors
- **Alay Sharma** - Complete Integration and Management
- **Nandini Rai** - Backend & API
- **Swati Sinha** - Frontend & UI

## 📝 License
This project is licensed under the MIT License.

---

Happy Coding! 🚀
