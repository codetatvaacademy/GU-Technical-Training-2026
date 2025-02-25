import React, { useState, useEffect, useRef } from 'react';
import { bubbleSort, selectionSort, insertionSort, mergeSort, quickSort} from './Algorithm';
import './Sorting.css';

const DEFAULT_COLOR = '#3498db';  // Blue
const COMPARE_COLOR = '#f39c12';  // Orange
const SWAP_COLOR    = '#27ae60';  // Green

function SortingVisualizer() {
  const [array, setArray] = useState([]);
  const [arraySize, setArraySize] = useState(20);
  const [sortingSpeed, setSortingSpeed] = useState(100);
  const [isSorting, setIsSorting] = useState(false);
  const [userInput, setUserInput] = useState('');
  const [algorithm, setAlgorithm] = useState('Bubble Sort');
  const [barColors, setBarColors] = useState({});
  const [animations, setAnimations] = useState([]);
  const [currentStep, setCurrentStep] = useState(0);
  const [isPaused, setIsPaused] = useState(false);
  const [comparisonsCount, setComparisonsCount] = useState(0);
  const [swapsCount, setSwapsCount] = useState(0);
  
  const timerRef = useRef(null);
  const currentArrayRef = useRef([]);
    const isPausedRef = useRef(isPaused);
    const abortSortingRef = useRef(false);
  useEffect(() => {
    isPausedRef.current = isPaused;
  }, [isPaused]);

  useEffect(() => {
    generateNewArray();
  }, [arraySize]);

  const generateNewArray = () => {
    if (isSorting) return;
    const temp = [];
    for (let i = 0; i < arraySize; i++) {
      temp.push(Math.floor(Math.random() * 296) + 5);
    }
    setArray(temp);
    currentArrayRef.current = [...temp];
    setBarColors({});
    setAnimations([]);
    setCurrentStep(0);
    setComparisonsCount(0);
    setSwapsCount(0);
  };

  const handleUserInput = () => {
    if (isSorting) return;
    if (!userInput.trim()) return;
    const numbers = userInput
      .split(',')
      .map(num => parseInt(num.trim(), 10))
      .filter(num => !isNaN(num));
    if (numbers.length === 0) {
      alert('Invalid input! Please enter comma-separated integers.');
      return;
    }
    setArray(numbers);
    currentArrayRef.current = [...numbers];
    setBarColors({});
    setAnimations([]);
    setCurrentStep(0);
    setComparisonsCount(0);
    setSwapsCount(0);
  };

  const computeAnimations = () => {
    let anims = [];
    const tempArray = [...array];
    switch (algorithm) {
      case 'Bubble Sort':
        anims = bubbleSort([...tempArray]);
        break;
      case 'Selection Sort':
        anims = selectionSort([...tempArray]);
        break;
      case 'Insertion Sort':
        anims = insertionSort([...tempArray]);
        break;
        case 'Merge Sort':
          anims = insertionSort([...tempArray]);
          break;
          case 'Quick Sort':
            anims = insertionSort([...tempArray]);
            break;
      default:
        anims = bubbleSort([...tempArray]);
    }
    setAnimations(anims);
    return anims;
  };

  const processStep = async (stepIndex, anims) => {
    if (stepIndex >= anims.length) {
      setIsSorting(false);
      setArray([...currentArrayRef.current]);
      return;
    }
    const { type, idxA, idxB } = anims[stepIndex];
    if (type === 'compare') {
      setComparisonsCount(prev => prev + 1);
      setBarColors({ [idxA]: COMPARE_COLOR, [idxB]: COMPARE_COLOR });
      await new Promise(resolve => setTimeout(resolve, sortingSpeed));
      setBarColors({});
    } else if (type === 'swap') {
      setSwapsCount(prev => prev + 1);
      const newArr = [...currentArrayRef.current];
      [newArr[idxA], newArr[idxB]] = [newArr[idxB], newArr[idxA]];
      currentArrayRef.current = newArr;
      setArray(newArr);
      setBarColors({ [idxA]: SWAP_COLOR, [idxB]: SWAP_COLOR });
      await new Promise(resolve => setTimeout(resolve, sortingSpeed));
      setBarColors({});
    }
  };

    const runAllAnimationsFrom = async (anims) => {
      
        for (let i = currentStep; i < anims.length; i++) {
            if (abortSortingRef.current) return;
            while (isPausedRef.current) {
                if (abortSortingRef.current) return;
        await new Promise(resolve => setTimeout(resolve, 50));
      }
      await processStep(i, anims);
      setCurrentStep(i + 1);
        }
        if (!abortSortingRef.current) {
            setIsSorting(false);
            setArray([...currentArrayRef.current]);
          }
    setIsSorting(false);
    setArray([...currentArrayRef.current]);
  };

  const handleSort = async () => {
    if (isSorting) return;
      setIsSorting(true);
      abortSortingRef.current = false;
    currentArrayRef.current = [...array];
    // Compute animations synchronously and store in a local variable.
    const computedAnims = computeAnimations();
    setCurrentStep(0);
    setIsPaused(false);
    isPausedRef.current = false;
    runAllAnimationsFrom(computedAnims);
  };

  const togglePause = () => {
    if (!isSorting) return;
    setIsPaused(prev => {
      const newPaused = !prev;
      isPausedRef.current = newPaused;
      // When resuming, the runAllAnimationsFrom loop is still waiting in its pause loop.
      return newPaused;
    });
  };

  const handleNextStep = async () => {
    if (!isSorting || !isPaused) return;
    const computedAnims = animations.length === 0 ? computeAnimations() : animations;
    if (currentStep >= computedAnims.length) {
      setIsSorting(false);
      setArray([...currentArrayRef.current]);
      return;
    }
    await processStep(currentStep, computedAnims);
    setCurrentStep(currentStep + 1);
  };

  const handleReset = () => {
    abortSortingRef.current = true; // signal the animation loop to abort
    clearTimeout(timerRef.current);
    setIsSorting(false);
    setIsPaused(false);
    setAnimations([]);
    setCurrentStep(0);
    generateNewArray();
  };

  const progressPercent = animations.length > 0 ? (currentStep / animations.length) * 100 : 0;

  return (
    <div className="visualizer-card">
      {/* Top Controls */}
      <div className="controls-container">
        <button className='button' onClick={generateNewArray} disabled={isSorting}>Generate Random Array</button>
        <button className='button' onClick={handleSort} disabled={isSorting}>Start Sorting</button>
        <button className='button' onClick={togglePause} disabled={!isSorting}>
          {isPaused ? 'Resume' : 'Pause'}
        </button>
        <button className='button' onClick={handleNextStep} disabled={!isSorting || !isPaused}>Next Step</button>
        <button className='button' onClick={handleReset}>Reset</button>
      </div>

      {/* User Input */}
      <div className="controls-container">
        <input
          type="text"
          placeholder="e.g. 10, 5, 8, 20"
          value={userInput}
          onChange={(e) => setUserInput(e.target.value)}
          disabled={isSorting}
        />
        <button className='button' onClick={handleUserInput} disabled={isSorting}>Set Array from Input</button>
      </div>

      {/* Algorithm Selection */}
      <div className="controls-container">
        <label>Algorithm: </label>
        <select className='select' value={algorithm} onChange={(e) => setAlgorithm(e.target.value)} disabled={isSorting}>
          <option>Bubble Sort</option>
          <option>Selection Sort</option>
          <option>Insertion Sort</option>
          <option>Merge Sort</option>
          <option>Quick Sort</option>
        </select>
      </div>

      {/* Size and Speed Sliders */}
      <div className="controls-container">
        <label>Array Size: {arraySize}</label>
        <input
          className='input'
          type="range"
          min="5"
          max="50"
          value={arraySize}
          disabled={isSorting}
          onChange={(e) => setArraySize(Number(e.target.value))}
        />
        <label>Speed (ms): {sortingSpeed}</label>
        <input
          className='input'
          type="range"
          min="10"
          max="500"
          value={sortingSpeed}
          disabled={isSorting}
          onChange={(e) => setSortingSpeed(Number(e.target.value))}
        />
      </div>

      {/* Statistics Panel */}
      <div className="statistics-panel">
        <span>Comparisons: {comparisonsCount}</span>
        <span style={{ marginLeft: '1rem' }}>Swaps: {swapsCount}</span>
      </div>

      {/* Progress Bar */}
      <div className="progress-container">
        <div className="progress-bar" style={{ width: `${progressPercent}%` }}></div>
      </div>

      {/* Bars Visualization */}
      <div className="bar-container">
        {array.map((value, idx) => (
          <div key={idx} className="bar" style={{ height: `${value}px`, backgroundColor: barColors[idx] || DEFAULT_COLOR }}></div>
        ))}
      </div>
      </div>
  );
}

export default SortingVisualizer;
