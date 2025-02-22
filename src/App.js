import React, { useState, useRef, useEffect } from "react";
import { motion } from "framer-motion";
import "./App.css";

const generateArray = (size) => {
  return Array.from({ length: size }, () => Math.floor(Math.random() * 100) + 1);
};
const Button = ({ onClick, children, disabled }) => (
  <button onClick={onClick} disabled={disabled} className="btn">
    {children}
  </button>
);

const playSound = () => {
  return new Promise((resolve) => {
    const audio = new Audio("/beep.wav");
    audio.play().catch(error => console.error("Sound play error:", error));
    audio.onplay = () => resolve();
  });
};

const SortingVisualizer = () => {
  const [array, setArray] = useState(generateArray(10));
  const [sorting, setSorting] = useState(false);
  const [userInput, setUserInput] = useState("");
  const [steps, setSteps] = useState([]);
  const [highlight, setHighlight] = useState([]);
  const [sortType, setSortType] = useState("bubble");
  const [isDarkMode, setIsDarkMode] = useState(true);
  const stepsEndRef = useRef(null);
  const [stopSorting, setStopSorting] = useState(false);

  const scrollToBottom = () => {
    stepsEndRef.current?.scrollIntoView({ behavior: "smooth" });
  };

  useEffect(() => {
    scrollToBottom();
  }, [steps]);

  const toggleDarkMode = () => {
    setIsDarkMode(!isDarkMode);
  };

  const handleUserInput = () => {
    const newArray = userInput.split(",").map(num => parseInt(num.trim(), 10)).filter(num => !isNaN(num));
    if (newArray.length > 0) {
      setArray(newArray);
    }
  };

  const updateSteps = (newStep) => {
    setSteps((prevSteps) => [...prevSteps, newStep]); // Add new step without limiting
  };

  const countingSort = async () => {
    setSorting(true);
    setStopSorting(false); 
    let arr = [...array];
    let max = Math.max(...arr);
    let count = new Array(max + 1).fill(0);
    let output = new Array(arr.length);
    
    arr.forEach(num => count[num]++);
    for (let i = 1; i < count.length; i++) {
      if (stopSorting) break;
      count[i] += count[i - 1];
      updateSteps(`Updated count for ${i}`);
      await new Promise((resolve) => setTimeout(resolve, 500));
    }
    for (let i = arr.length - 1; i >= 0; i--) {
      if (stopSorting) break;
      output[count[arr[i]] - 1] = arr[i];
      count[arr[i]]--;
      updateSteps(`Placed ${arr[i]} in output array`);
      setArray([...output]);
      await new Promise((resolve) => setTimeout(resolve, 500));
    }
    
    setArray([...output]);
    setSorting(false);
    setStopSorting(false);
  };

  const bubbleSort = async () => {
    setSorting(true);
    setStopSorting(false);
    let arr = [...array];
    let n = arr.length;
    setSteps([]);
    for (let i = 0; i < n - 1; i++) {
      for (let j = 0; j < n - i - 1; j++) {
        if (stopSorting) break;
        setHighlight([j, j + 1]);
        await new Promise((resolve) => setTimeout(resolve, 500));
        if (arr[j] > arr[j + 1]) {
          await playSound();
          [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
          updateSteps(`Swapped ${arr[j]} and ${arr[j + 1]}`);
          setArray([...arr]);
          await new Promise((resolve) => setTimeout(resolve, 500));
        }
      }
      if (stopSorting) break;
    }
    setHighlight([]);
    setSorting(false);
    setStopSorting(false);
  };

  const selectionSort = async () => {
    setSorting(true);
    setStopSorting(false);
    let arr = [...array];
    let n = arr.length;
    setSteps([]);
    for (let i = 0; i < n - 1; i++) {
      if (stopSorting) break;
      let minIdx = i;
      for (let j = i + 1; j < n; j++) {
        if (stopSorting) break;
        setHighlight([minIdx, j]);
        await new Promise((resolve) => setTimeout(resolve, 500));
        if (arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }
      if (stopSorting) break;
      await playSound();
      [arr[i], arr[minIdx]] = [arr[minIdx], arr[i]];
      updateSteps(`Swapped ${arr[i]} and ${arr[minIdx]}`);
      setArray([...arr]);
      await new Promise((resolve) => setTimeout(resolve, 500));
    }
    setHighlight([]);
    setSorting(false);
    setStopSorting(false);
  };
  const insertionSort = async () => {
    setSorting(true);
    setStopSorting(false);
    let arr = [...array];
    let n = arr.length;
    setSteps([]);
  
    for (let i = 1; i < n; i++) {
      if (stopSorting) break;
      let key = arr[i];
      let j = i - 1;
  
      while (j >= 0 && arr[j] > key) {
        if (stopSorting) break;
        setHighlight([j, j + 1]);
        await new Promise((resolve) => setTimeout(resolve, 500));
        arr[j + 1] = arr[j];
        j--;
      }
      if (stopSorting) break;
      await playSound();
      arr[j + 1] = key;
      updateSteps(`Inserted ${key} at position ${j + 1}`);
      setArray([...arr]);
      await new Promise((resolve) => setTimeout(resolve, 500));
    }
  
    setHighlight([]);
    setSorting(false);
    setStopSorting(false);
  };
  const quickSortHelper = async (arr, low, high) => {
    if (low < high) {
      if (stopSorting) return;
      let pivotIndex = await partition(arr, low, high);
      await quickSortHelper(arr, low, pivotIndex - 1);
      await quickSortHelper(arr, pivotIndex + 1, high);
    }
  };
  
  const partition = async (arr, low, high) => {
    let pivot = arr[high];
    let i = low - 1;
  
    for (let j = low; j < high; j++) {
      if (stopSorting) return;
      setHighlight([j, high]);
      await new Promise((resolve) => setTimeout(resolve, 500));
      
      if (arr[j] < pivot) {
        i++;
        [arr[i], arr[j]] = [arr[j], arr[i]];
        playSound();
        updateSteps(`Swapped ${arr[i]} and ${arr[j]}`);
        setArray([...arr]);
        await new Promise((resolve) => setTimeout(resolve, 500));
      }
    }
  
    [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
    setArray([...arr]);
    return i + 1;
  };
  
  const quickSort = async () => {
    setSorting(true);
    setStopSorting(false);
    let arr = [...array];
    await quickSortHelper(arr, 0, arr.length - 1);
    setSorting(false);
    setStopSorting(false);
  };

  const mergeSortHelper = async (arr, left, right) => {
    if (left >= right) return;
    if (stopSorting) return;
    let mid = Math.floor((left + right) / 2);
  
    await mergeSortHelper(arr, left, mid);
    await mergeSortHelper(arr, mid + 1, right);
    await merge(arr, left, mid, right);
  };
  
  const merge = async (arr, left, mid, right) => {
    let leftArr = arr.slice(left, mid + 1);
    let rightArr = arr.slice(mid + 1, right + 1);
    let i = 0, j = 0, k = left;
  
    while (i < leftArr.length && j < rightArr.length) {
      if (stopSorting) return;
      setHighlight([k]);
      await new Promise((resolve) => setTimeout(resolve, 500));
  
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
  
      playSound();
      updateSteps(`Merged ${arr[k]}`);
      setArray([...arr]);
      await new Promise((resolve) => setTimeout(resolve, 500));
      k++;
    }
  
    while (i < leftArr.length) {
      if (stopSorting) return;
      arr[k] = leftArr[i];
      i++;
      k++;
    }
  
    while (j < rightArr.length) {
      if (stopSorting) return; 
      arr[k] = rightArr[j];
      j++;
      k++;
    }
  };
  
  const mergeSort = async () => {
    setSorting(true);
    setStopSorting(false);
    let arr = [...array];
    await mergeSortHelper(arr, 0, arr.length - 1);
    setSorting(false);
    setStopSorting(false);
  };
  

  const startSorting = () => {
    if (sortType === "bubble") {
      bubbleSort();
    } else if (sortType === "selection") {
      selectionSort();
    } else if (sortType === "merge") {
      mergeSort();
    } else if (sortType === "insertion") {
      insertionSort();
    } else if (sortType === "quick") {
      quickSort();
    } else if (sortType === "counting") {
      countingSort();
    }
  };
  

  return (
    <div className={`full-screen ${isDarkMode ? "dark-mode" : "light-mode"}`}>
      <h1 className="title">Sorting Visualizer</h1>
      <button onClick={toggleDarkMode} className="toggle-mode">
        {isDarkMode ? "🌞 Light Mode" : "🌙 Dark Mode"}
      </button>
      {/* Sorting Bars */}
    <div className="bar-container">
      {array.map((value, index) => (
        <div
          key={index}
          className={`bar ${highlight.includes(index) ? "highlight" : ""}`}
          style={{ height: `${value * 3}px` }}
        >
          {value}
        </div>
      ))}
    </div>
      <div className="controls">
        <select value={sortType} onChange={(e) => setSortType(e.target.value)} className="input-box">
          <option value="bubble">Bubble Sort</option>
          <option value="selection">Selection Sort</option>
          <option value="merge">Merge Sort</option>
          <option value="insertion">Insertion Sort</option>
          <option value="quick">Quick Sort</option>
          <option value="counting">Counting Sort</option>
        </select>
        <Button onClick={startSorting} disabled={sorting}>Start Sorting</Button>
        <Button onClick={() => setStopSorting(true)} disabled={!sorting}>Stop Sorting</Button>
        <Button onClick={() => setArray(generateArray(10))} disabled={sorting}>Randomize Array</Button>

        <input 
          type="text" 
          value={userInput} 
          onChange={(e) => setUserInput(e.target.value)} 
          placeholder="Enter numbers (e.g., 5,10,15)"
          className="input-box"
        />
        <Button onClick={handleUserInput} disabled={sorting}>Set Custom Array</Button>
      </div>
      {/* Scrollable Steps Container */}
      <div className="steps-box">
        <h3>Sorting Steps:</h3>
        <div className="steps-list">
          {steps.map((step, index) => (
            <p key={index}>{step}</p>
          ))}
          {/* Add the ref here */}
          <div ref={stepsEndRef} />
        </div>
      </div>
    </div>
  );
};

export default SortingVisualizer;
