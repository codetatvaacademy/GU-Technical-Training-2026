import React, { useState, useRef } from "react";
import { useParams } from "react-router-dom";
import sortingAlgorithms from "../utils/sortingAlgorithms";
import "../App.css";

const descriptions = {
  bubble: {
    text: "Bubble Sort repeatedly swaps adjacent elements if they are in the wrong order. It continues until the entire array is sorted.",
    time: "O(n²) (Worst & Average), O(n) (Best)",
    space: "O(1) (In-place)",
  },
  selection: {
    text: "Selection Sort selects the smallest element from the unsorted part and swaps it with the first unsorted element, gradually sorting the array.",
    time: "O(n²) (Worst & Average), O(n²) (Best)",
    space: "O(1) (In-place)",
  },
  insertion: {
    text: "Insertion Sort builds the sorted array one element at a time by inserting elements into their correct position.",
    time: "O(n²) (Worst & Average), O(n) (Best)",
    space: "O(1) (In-place)",
  },
  merge: {
    text: "Merge Sort is a divide-and-conquer algorithm that splits the array, sorts both halves, and merges them back together.",
    time: "O(n log n) (Worst, Average, Best)",
    space: "O(n) (Not in-place)",
  },
  quick: {
    text: "Quick Sort selects a pivot, partitions the array into elements smaller and larger than the pivot, and sorts them recursively.",
    time: "O(n²) (Worst), O(n log n) (Average & Best)",
    space: "O(log n) (Best case), O(n) (Worst case)",
  },
};

function Algo() {
  const { sortType } = useParams();
  const [array, setArray] = useState([10,15,11,20,17,70,50,90,65]);
  const [speed, setSpeed] = useState(500);
  const [userInput, setUserInput] = useState("");
  const [sorting, setSorting] = useState(false);
  const [paused, setPaused] = useState(false);

  const pausedRef = useRef(false);
  const shouldResetRef = useRef(false);

  function handleUserInputChange(e) {
    setUserInput(e.target.value);
  }

  function handleArraySubmit() {
    const newArray = userInput
      .split(",")
      .map((num) => parseInt(num.trim(), 10))
      .filter((num) => !isNaN(num));
    setArray(newArray);
  }

  async function handleSort() {
    if (!sortingAlgorithms[sortType]) {
      alert("Sorting algorithm not found!");
      return;
    }

    setSorting(true);
    setPaused(false);
    pausedRef.current = false;
    shouldResetRef.current = false;

    await sortingAlgorithms[sortType](array, setArray, speed, pausedRef, shouldResetRef);

    setSorting(false);
  }

  function handlePauseResume() {
    pausedRef.current = !pausedRef.current;
    setPaused(pausedRef.current);
  }

  function handleRestart() {
    shouldResetRef.current = true;
    setArray([]);
    setUserInput("");
    setSorting(false);
    setPaused(false);
  }

  return (
    <div className="algo-container">
      {/* Sorting Name & Description - Centered */}
      <h1 className="sort-title">
        {sortType.replace(/^\w/, (c) => c.toUpperCase())} Sort
      </h1>

      <div className="description-container">
        <p className="sort-description">{descriptions[sortType]?.text || "Sorting Algorithm"}</p>
        <p className="complexity">
          <strong>Time Complexity:</strong> {descriptions[sortType]?.time}
        </p>
        <p className="complexity">
          <strong>Space Complexity:</strong> {descriptions[sortType]?.space}
        </p>
      </div>

      {/* Visualizer & Controls - Centered using Flexbox */}
      <div className="visualizer-controls-container">
        {/* Visualizer - Centered */}
        <div className="visualizer">
          {array.map((value, index) => (
            <div key={index} className="bar" style={{ height: `${value * 3}px` }}></div>
          ))}
        </div>

        {/* Controls */}
        <div className="controls">
          <button onClick={handleSort} disabled={sorting || array.length === 0}>
            Play
          </button>
          <button onClick={handlePauseResume} disabled={!sorting}>
            {paused ? "Resume" : "Pause"}
          </button>
          <button onClick={handleRestart} disabled={!sorting && array.length === 0}>
            Reset
          </button>
          <div className="slider-group">
            <label>Speed: {speed}</label>
            <input
              type="range"
              min="50"
              max="1000"
              step="50"
              value={speed}
              onChange={(e) => setSpeed(Number(e.target.value))}
              disabled={sorting}
            />
          </div>
        </div>
      </div>

      {/* User Input - Set Array Button Aligned */}
      <div className="user-input">
        <input
          type="text"
          placeholder="Enter numbers separated by commas"
          value={userInput}
          onChange={handleUserInputChange}
        />
        <button className="set-array-btn" onClick={handleArraySubmit} disabled={sorting}>
          Set Array
        </button>
      </div>
    </div>
  );
}

export default Algo;
