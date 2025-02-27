
import React, { useState, useRef, useEffect } from "react";
import { sortArray } from "../api/sortingAPI";
import "./styles/SortingVisualizer.css";

const Visualizer = () => {
    const [algorithm, setAlgorithm] = useState("");
    const [numElements, setNumElements] = useState("");
    const [arrayInput, setArrayInput] = useState("");
    const [bars, setBars] = useState([]);
    const [isSorting, setIsSorting] = useState(false);
    const [isPaused, setIsPaused] = useState(false);
    const [speed, setSpeed] = useState(300);
    const speedRef = useRef(300);
    const [highlightedIndices, setHighlightedIndices] = useState([]);
    const animationRef = useRef([]);
    const currentStep = useRef(0);
    const stepsRef = useRef([]);

    const handleSort = async () => {
        if (!algorithm || !numElements || !arrayInput) {
            alert("Please enter all fields!");
            return;
        }

        const numbers = arrayInput.split(",").map(Number);
        if (numbers.length !== parseInt(numElements)) {
            alert("Number of elements does not match the entered values!");
            return;
        }

        setBars(numbers);

        setTimeout(async () => {
            setIsSorting(true);
            try {
                const result = await sortArray(algorithm, numbers);
                console.log("API Response:", result);

                if (!result || !Array.isArray(result)) {
                    throw new Error("Invalid response from the server");
                }

                animateSorting(result);
            } catch (error) {
                alert(error.message);
                setIsSorting(false);
            }
        }, 1000);
    };

    const animateSorting = (steps) => {
        if (!steps || !Array.isArray(steps)) {
            console.error("Sorting steps are invalid:", steps);
            return;
        }

        animationRef.current.forEach(timeout => clearTimeout(timeout));
        animationRef.current = [];
        stepsRef.current = steps;
        currentStep.current = 0;
        processStep();
    };

    const processStep = () => {
        if (currentStep.current >= stepsRef.current.length) {
            setIsSorting(false);
            setHighlightedIndices([]);
            return;
        }

        if (!isPaused) {
            const step = stepsRef.current[currentStep.current];
            if (Array.isArray(step)) {
                setBars([...step]);
                if (currentStep.current < stepsRef.current.length - 1) {
                    const nextStep = stepsRef.current[currentStep.current + 1];
                    if (Array.isArray(nextStep)) {
                        const changedIndices = [];
                        for (let i = 0; i < step.length; i++) {
                            if (step[i] !== nextStep[i]) {
                                changedIndices.push(i);
                            }
                        }
                        setHighlightedIndices(changedIndices);
                    }
                }
            }
            currentStep.current++;
        }

        const timeout = setTimeout(() => {
            processStep();
        }, speedRef.current);
        animationRef.current.push(timeout);
    };

    const handlePause = () => {
        setIsPaused(true);
        animationRef.current.forEach(timeout => clearTimeout(timeout));
        animationRef.current = [];
    };

    const handleResume = () => {
        setIsPaused(false);
        processStep();
    };

    const handleSpeedChange = (e) => {
        const newSpeed = parseInt(e.target.value);
        setSpeed(newSpeed);
        speedRef.current = newSpeed;
    };

    useEffect(() => {
        return () => {
            animationRef.current.forEach(timeout => clearTimeout(timeout));
        };
    }, []);

    return (
        <div style={{ textAlign: "center", padding: "20px" }}>
            <div>
                <select onChange={(e) => setAlgorithm(e.target.value)}>
                    <option value="">Select Sorting Algorithm</option>
                    <option value="bubble">Bubble Sort</option>
                    <option value="selection">Selection Sort</option>
                    <option value="insertion">Insertion Sort</option>
                    <option value="merge">Merge Sort</option>
                    <option value="quick">Quick Sort</option>
                </select>

                <input
                    type="number"
                    placeholder="Number of Elements"
                    onChange={(e) => setNumElements(e.target.value)}
                />

                <input
                    type="text"
                    placeholder="Enter numbers (comma-separated)"
                    onChange={(e) => setArrayInput(e.target.value)}
                />

                <button onClick={handleSort} disabled={isSorting}>Sort</button>
                {isSorting && (
                    <>
                        <button onClick={isPaused ? handleResume : handlePause}>
                            {isPaused ? 'Resume' : 'Pause'}
                        </button>
                        <div style={{ marginTop: '10px' }}>
                            <label>Speed: </label>
                            <input
                                type="range"
                                min="50"
                                max="1000"
                                value={speed}
                                onChange={handleSpeedChange}
                            />
                            <span>({speed}ms)</span>
                        </div>
                    </>
                )}
            </div>

            {bars.length > 0 && (
                <div style={{ display: "flex", justifyContent: "center", gap: "10px", marginTop: "20px" }}>
                    {bars.map((num, i) => (
                        <div key={i} className={`array-bar ${
                            highlightedIndices.includes(i) ? 'bar-swap' : ''
                        }`} style={{
                            width: "50px",
                            height: "50px",
                            display: "flex",
                            alignItems: "center",
                            justifyContent: "center",
                            fontSize: "18px",
                            fontWeight: "bold",
                            color: "white",
                            borderRadius: "5px",
                            margin: "0 5px",
                            transition: 'all 0.3s ease-in-out'
                        }}>
                            {num}
                        </div>
                    ))}
                </div>
            )}

            {isSorting && (
                <div style={{ marginTop: "20px" }}>
                    <div className="lds-ellipsis"><div></div><div></div><div></div><div></div></div>
                </div>
            )}
        </div>
    );

};

export default Visualizer;