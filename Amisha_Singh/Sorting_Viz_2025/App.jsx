import './App.css'
import { useState, useEffect } from "react";

// import React from 'react';
import Header from './components/header';
import SortingVisualizer from './components/sorting';
import SortingInfo from './components/SortingInfo';

function App() {

  const [selectedAlgo, setSelectedAlgo] = useState("Bubble Sort");
  const [darkMode, setDarkMode] = useState(
    localStorage.getItem("darkMode") === "false" ? false : true
  );

  useEffect(() => {
    if (darkMode) {
      document.documentElement.classList.add("dark");
    } else {
      document.documentElement.classList.remove("dark");
    }
    localStorage.setItem("darkMode", darkMode);
  }, [darkMode]);


  return (
    <>
      <div className={`flex m-auto w-max gap-4 rounded-lg flex-col-reverse border-4 p-4 border-purple-600 ${darkMode ? "dark bg-black/75 text-white" : "bg-gray-200 text-black"}`}>
        <div className='flex flex-row'>
          <div className="flex rounded-lg w-max border-2 border-purple-600 items-center ">
            <SortingVisualizer />
          </div>
          <div className="flex border-2 w-full rounded-lg mx-4 border-purple-600 items-center text-justify">
            <SortingInfo algorithm={selectedAlgo} />
          </div>
        </div>
        <div className=''>
          <Header darkMode={darkMode} setDarkMode={setDarkMode} />
        </div>

      </div>
    </>
  );
}

export default App
