import React, { useState, useEffect } from "react";
import "./SortingVisualizer.css";
import { bubbleSort } from "../algorithms/bubbleSort";
import { quickSort } from "../algorithms/quickSort";
import { mergeSort } from "../algorithms/mergeSort";
import { insertionSort } from "../algorithms/insertionSort";
import { selectionSort } from "../algorithms/selectionSort";

const SortingVisualizer = () => {
    const [array, setArray] = useState([]);
    const [speed, setSpeed] = useState(5); // Slowed animation
    const [arraySize, setArraySize] = useState(20);
    const [isSorting, setIsSorting] = useState(false);
    const [highlightIndex, setHighlightIndex] = useState(null); // Highlight for pivot/key element

    // Reset array when arraySize changes
    useEffect(() => {
        resetArray();
    }, [arraySize]);

    const resetArray = () => {
        if (isSorting) return;
        const newArr = Array.from({ length: arraySize }, () => Math.floor(Math.random() * 400) + 10);
        setArray(newArr);
        setHighlightIndex(null); // Reset highlighting
    };

    const animateSorting = (animations) => {
        if (!animations || animations.length === 0) return;

        setIsSorting(true);
        animations.forEach(([index1, valueOrIndex2, action], i) => {
            setTimeout(() => {
                setArray((prevArray) => {
                    let newArray = [...prevArray];

                    if (action === "overwrite") {
                        newArray[index1] = valueOrIndex2; // Fix disappearing bars
                    } else if (action === "swap") {
                        [newArray[index1], newArray[valueOrIndex2]] = [newArray[valueOrIndex2], newArray[index1]];
                    }

                    if (action === "pivot") {
                        setHighlightIndex(index1); // Highlight pivot element
                    }

                    return newArray;
                });

                if (i === animations.length - 1) setTimeout(() => setIsSorting(false), 500);
            }, i * (800 / speed));
        });
    };

    const maxHeight = 300; // Define max height for bars
    const maxValue = Math.max(...array); // Find the highest value in array

    return (
        <div className="container">
            <h2>Sorting Visualizer</h2>
            <p>Array Size: {arraySize}</p>

            {/* Bars section shifted downward */}
            <div className="bars-container">
                <div className="bars">
                    {array.map((value, idx) => (
                        <div
                            key={idx}
                            className="bar"
                            style={{
                                height: `${(value / maxValue) * maxHeight}px`, // Proper scaling
                                width: "30px", // Adjusted width
                                backgroundColor: idx === highlightIndex ? "red" : "turquoise"
                            }}>
                            {value}
                        </div>
                    ))}
                </div>
            </div>

            {/* Buttons shifted downward */}
            <div className="buttons">
                <button onClick={resetArray} disabled={isSorting}>Generate New Array</button>
                <button onClick={() => animateSorting(bubbleSort([...array]))} disabled={isSorting}>Bubble Sort</button>
                <button onClick={() => animateSorting(quickSort([...array]))} disabled={isSorting}>Quick Sort</button>
                <button onClick={() => animateSorting(mergeSort([...array]))} disabled={isSorting}>Merge Sort</button>
                <button onClick={() => animateSorting(insertionSort([...array]))} disabled={isSorting}>Insertion Sort</button>
                <button onClick={() => animateSorting(selectionSort([...array]))} disabled={isSorting}>Selection Sort</button>
            </div>

            {/* Controls shifted downward */}
            <div className="controls">
                <label>Speed:</label>
                <select onChange={(e) => setSpeed(Number(e.target.value))} value={speed} disabled={isSorting}>
                    <option value="1">Very Slow</option>
                    <option value="3">Slow</option>
                    <option value="5">Normal</option>
                    <option value="8">Fast</option>
                    <option value="12">Very Fast</option>
                </select>
                <label>Array Size:</label>
                <input
                    type="range"
                    min="5" max="50"
                    value={arraySize}
                    onChange={(e) => setArraySize(Number(e.target.value))}
                    disabled={isSorting}
                />
            </div>
        </div>
    );
};

export default SortingVisualizer;
