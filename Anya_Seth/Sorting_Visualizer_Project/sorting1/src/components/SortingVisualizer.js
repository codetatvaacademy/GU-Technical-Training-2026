import React, { useState, useEffect } from "react";
import { fetchSortedData } from "../api/api";
import SortingBar from "./SortingBar";
import DarkToggle from "./DarkModeToggle";
import Controls from "./Controls";

const SortingVisualizer = () => {
    const [algorithm, setAlgorithm] = useState("QuickSort");
    const [numElements, setNumElements] = useState(5);
    const [elements, setElements] = useState("5,2,9,1,6");
    const [bars, setBars] = useState([]);
    const [sortingSteps, setSortingSteps] = useState([]);
    const [currentStep, setCurrentStep] = useState(0);
    const [sorting, setSorting] = useState(false);
    const [speed, setSpeed] = useState(300);
    const [isPlaying, setIsPlaying] = useState(false);

    const handlePlay = () => {
        setIsPlaying(true);
        setCurrentStep(0);
    };

    const handleStop = () => {
        setIsPlaying(false);
    };

    const handleSpeedUp = () => {
        setSpeed((prev) => Math.max(50, prev - 50)); // Minimum speed 50ms
    };

    const handleSpeedDown = () => {
        setSpeed((prev) => prev + 50); // Increase delay
    };

    useEffect(() => {
        if (sorting && currentStep < sortingSteps.length) {
            setTimeout(() => {
                setBars(sortingSteps[currentStep]); // Update bars dynamically
                setCurrentStep((prev) => prev + 1);
            }, 500);
        }
    }, [currentStep, sorting, sortingSteps]);

    const handleSort = async () => {
        const numbers = elements.split(",").map(Number);
        if (numbers.length !== numElements) {
            alert("Number of elements does not match input!");
            return;
        }
        
        try {
            console.log("Sending request to backend:", { algorithm, numbers });
        
            const response = await fetchSortedData(algorithm, numbers);
            console.log("Received response:", response);
        
            if (response && response.steps) {
                const coloredSteps = response.steps.map(step => step.map((bar, index) => {
                    let color = "blue"; // Default color
                    if (bar.color === "red") color = "red"; // Comparing elements
                    if (bar.color === "green") color = "green"; // Swapped elements
                    return { value: bar.value, color };
                }));
        
                setSortingSteps(coloredSteps);
                setBars(coloredSteps[0]);
                setSorting(true);
                setCurrentStep(0);
        
                // Animate the sorting steps
                for (let i = 0; i < coloredSteps.length; i++) {
                    setTimeout(() => {
                        setBars(coloredSteps[i]);
                        setCurrentStep(i);
                    }, i * 500); // Adjust the delay as needed
                }
            } else {
                console.error("Invalid response format:", response);
            }
        } catch (error) {
            console.error("Error fetching sorting data:", error);
        }
    };

    return (
        <div className="flex flex-col items-center p-6 min-h-screen bg-gray-900 text-white">
            <DarkToggle />

            <h1 className="text-4xl font-bold text-green-400 my-4">Sorting Visualizer</h1>
            
            {/* Sorting Algorithm Selection */}
            <div className="mb-4">
                <label className="mr-2">Algorithm:</label>
                <select 
                    value={algorithm} 
                    onChange={(e) => setAlgorithm(e.target.value)} 
                    className="border p-2 rounded text-black"
                >
                    <option value="QuickSort">Quick Sort</option>
                    <option value="MergeSort">Merge Sort</option>
                    <option value="SelectionSort">Selection Sort</option>
                    <option value="BubbleSort">Bubble Sort</option>
                    <option value="InsertionSort">Insertion Sort</option>
                </select>
            </div>

            {/* Number of Elements Input */}
            <div className="mb-4">
                <label className="mr-2">Number of Elements:</label>
                <input 
                    type="number" 
                    value={numElements} 
                    onChange={(e) => setNumElements(Number(e.target.value))} 
                    className="border p-2 rounded text-black"
                />
            </div>

            {/* Elements Input */}
            <div className="mb-4">
                <label className="mr-2">Elements (comma-separated):</label>
                <input 
                    type="text" 
                    value={elements} 
                    onChange={(e) => setElements(e.target.value)} 
                    className="border p-2 rounded text-black"
                />
            </div>

            {/* Start Sorting Button */}
            <button onClick={handleSort} className="bg-blue-500 text-white px-6 py-2 rounded-lg hover:bg-blue-700 transition">
                Start Sorting
            </button>

            {/* Sorting Controls */}
            <div className="flex space-x-4 mt-4">
            <Controls 
                onSort={() => handleSort(algorithm)}
                onPlay={handlePlay}
                onStop={handleStop}
                speed={speed}
                onSpeedUp={handleSpeedUp}
                onSpeedDown={handleSpeedDown}
            />

            </div>
            {/* Sorting Bars Container */}
            <div className="flex mt-6 h-64 items-end border p-4 bg-gray-800 rounded-lg">
                {bars.map((bar, idx) => (
                    <SortingBar key={idx} height={bar.value * 20} color={bar.color} />
                ))}
            </div>
        </div>
    );
};

export default SortingVisualizer;
