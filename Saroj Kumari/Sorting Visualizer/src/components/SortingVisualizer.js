import React, { useState, useEffect } from "react";
import { bubbleSort, selectionSort, insertionSort, mergeSort, quickSort } from "../algorithms/SortingAlgorithms";
import "./SortingVisualizer.css";

const SortingVisualizer = () => {
  const [array, setArray] = useState([]);
  const [arraySize, setArraySize] = useState(10);
  const [minRange, setMinRange] = useState(5);
  const [maxRange, setMaxRange] = useState(100);
  const [selectedAlgorithm, setSelectedAlgorithm] = useState("bubble");
  const [speed, setSpeed] = useState(150);
  const [darkMode, setDarkMode] = useState(false);
  const [isSorting, setIsSorting] = useState(false);
  const [isPaused, setIsPaused] = useState(false);
  const [animations, setAnimations] = useState([]);
  const [animationIndex, setAnimationIndex] = useState(0);
  const [intervalId, setIntervalId] = useState(null);

  useEffect(() => {
    generateArray();
  }, [arraySize, minRange, maxRange]);

  const generateArray = () => {
    if (intervalId) {
      clearInterval(intervalId);
    }
    let newArray = Array.from({ length: arraySize }, () => Math.floor(Math.random() * (maxRange - minRange + 1)) + minRange);
    setArray(newArray);
    setIsSorting(false);
    setIsPaused(false);
    setAnimationIndex(0);
    setAnimations([]);
    setIntervalId(null);
  };

  const handleAlgorithmChange = (event) => {
    setSelectedAlgorithm(event.target.value);
  };

  const startSorting = () => {
    if (isSorting) return;

    let copyArray = [...array];
    let newAnimations = [];

    switch (selectedAlgorithm) {
      case "bubble":
        newAnimations = bubbleSort(copyArray);
        break;
      case "selection":
        newAnimations = selectionSort(copyArray);
        break;
      case "insertion":
        newAnimations = insertionSort(copyArray);
        break;
      case "merge":
        newAnimations = mergeSort(copyArray);
        break;
      case "quick":
        newAnimations = quickSort(copyArray);
        break;
      default:
        return;
    }

    setAnimations(newAnimations);
    setIsSorting(true);
    setIsPaused(false);
    animateSorting(newAnimations, 0);
  };

  const animateSorting = (animations, startIndex) => { 
    clearInterval(intervalId); 
    if (startIndex >= animations.length) {
       setIsSorting(false); return; 
      } 
      const id = setInterval(() => { 
        if (startIndex >= animations.length) {
           clearInterval(id);
            setIsSorting(false); 
            setIsPaused(false); 
            return; 
          } 
          setArray([...animations[startIndex]]);
          setAnimationIndex(startIndex + 1);
          startIndex++; 
        }, speed); 
      setIntervalId(id); 
  };
  

  const pauseAnimation = () => {
    if (isSorting) {
      setIsPaused(true);
      setIntervalId(null);
      clearInterval(intervalId);
    }
  };

  const resumeAnimation = () => {
    if (isPaused) {
      setIsSorting(true);
      setIsPaused(false);
      animateSorting(animations, animationIndex);
    }
  };

  const toggleDarkMode = () => {
    setDarkMode(!darkMode);
    document.body.classList.toggle("dark-mode");
  };

  return (
    <div className="container">
      <h1>Sorting Visualizer</h1>
      <div className="input-group">
        <button onClick={generateArray} disabled={isSorting}>Generate Random Array</button>
      </div>
      <br />
      <div className="input-group">
        <label>Array Size:</label>
        <input type="number" value={arraySize} min="1" max="30" onChange={(e) => setArraySize(Number(e.target.value))} disabled={isSorting} />
      </div>
      <br/>
      <div className="input-group">
        <label>Range:</label>
        <div className="range-inputs">
          <input type="number" value={minRange} min="5" max="100" onChange={(e) => setMinRange(Math.max(5, Number(e.target.value)))} disabled={isSorting} />
          <span>   to   </span>
          <input type="number" value={maxRange} min="5" max="100" onChange={(e) => setMaxRange(Math.min(100, Number(e.target.value)))} disabled={isSorting} />
        </div>
      </div>
      <br/>
      <label>Select Sorting Algorithm:</label>
      <select id="algorithmSelect" name="algorithm" onChange={handleAlgorithmChange} disabled={isSorting}>
        <option value="bubble">Bubble Sort</option>
        <option value="selection">Selection Sort</option>
        <option value="insertion">Insertion Sort</option>
        <option value="merge">Merge Sort</option>
        <option value="quick">Quick Sort</option>
      </select>
      <div id="container">
        {array.map((value, index) => (
          <div key={index} className="bar" style={{ height: `${value * 3}px` }}>
            {value}
          </div>
        ))}
      </div>
      <br/>
      <div>
        <button onClick={startSorting} disabled={isSorting}>Sort</button>
        <button onClick={generateArray} disabled={isSorting && !isPaused}>Reset</button>
        <button onClick={resumeAnimation} disabled={!isPaused}>Start</button>
        <button onClick={pauseAnimation} disabled={!isSorting || isPaused}>Pause</button>
      </div>
      <div>
        <button onClick={toggleDarkMode}>{darkMode ? "Light Mode" : "Dark Mode"}</button>
      </div>
    </div>
  );
};

export default SortingVisualizer;
