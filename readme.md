# 🎨 Sorting Visualizer

An interactive Sorting Visualizer that helps understand various sorting algorithms through real-time animations and an engaging UI.

🔗 **Live Demo:** [Sorting Visualizer](https://dsa-algo-v6wf.vercel.app/)  

---

## 📌 Project Overview  

The **Sorting Visualizer** provides an interactive way to visualize different sorting algorithms, making it useful for **students, developers, and educators**.  

---

## 🎯 Key Features  

✅ **Interactive UI** – Generate arrays, adjust size, and set sorting speed  
✅ **Multiple Sorting Algorithms** – Implement and visualize various sorting techniques  
✅ **Color-Coded Bars** – Highlights elements being compared and swapped  
✅ **Real-Time Animation** – Step-by-step execution of sorting logic  
✅ **User Controls** – Start, pause, reset, and modify sorting speed  
✅ **Dark & Light Mode** – Toggle between themes   
✅ **Performance Comparison** – Graphical representation of time complexity  

---

## 🛠️ Tech Stack  

### **Frontend:**  
- ✅ React.js (Component-based UI)  
- ✅ React Router (Navigation)  
- ✅ Tailwind CSS (Styling)  
- ✅ D3.js (For animations)  

### **Backend:**  
- ✅ Node.js (Server-side logic)  
- ✅ Express.js (API handling)  
- ✅ MongoDB (Database for storing user settings/history)  
- ✅ bcrypt (For authentication if needed)  

---

## 🔢 Sorting Algorithms Included  

1️⃣ **Bubble Sort**  
2️⃣ **Selection Sort**  
3️⃣ **Insertion Sort**  
4️⃣ **Merge Sort**  
5️⃣ **Quick Sort**  

---

## 🚀 How It Works  

1️⃣ User selects an array size and sorting algorithm  
2️⃣ A random array is generated  
3️⃣ The sorting process starts with **real-time visualization**  
4️⃣ Bars dynamically change color to show **swaps and comparisons**  
5️⃣ Sorting completes, and the sorted array is displayed  

---

## 🎨 UI/UX Enhancements  

🎨 **Dark & Light Mode** – Toggle themes for better user experience  
🎵 **Sound Effects** – Audio feedback for swaps and operations  
📊 **Time Complexity Graph** – Compare sorting algorithms performance  

---

## 📌 Installation & Setup  

### **Clone the Repository**  
```bash
git clone https://github.com/Satyam-Sharma-coder/sorting-visualizer.git
cd sorting-visualizer

cd backend
npm install
node server.js

cd frontend
npm install
npm start