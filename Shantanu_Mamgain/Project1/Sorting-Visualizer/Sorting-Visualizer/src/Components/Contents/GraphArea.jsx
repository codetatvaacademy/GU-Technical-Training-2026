import "./graphArea.css";
import "../button.css";
import { BarChart } from "./barChart";
import { useState, useEffect, useRef } from "react";
import { returnArray } from "./RandomArray.js";
import { returnSortingName, selectAlgo } from "./AlgoMenu.js";

function GraphArea() {
  const [isStartToggled, setIsStartToggled] = useState(false);
  const [isPauseToggled, setIsPauseToggled] = useState(false);
  const [array, setArray] = useState([]);
  const [first, setFirst] = useState();
  const [second, setSecond] = useState();

  const isSortingActive = useRef(false);
  const isPaused = useRef(false);
  const sortingTimeoutRef = useRef(null);

  useEffect(() => {
    setArray(returnArray());
  }, []);

  const updateGraph = (newArray) => {
    if (!isSortingActive.current || isPaused.current) return;
    setArray([...newArray]);
  };

  const changeColor = (first, second) => {
    if (!isSortingActive.current || isPaused.current) return;
    setFirst(first);
    setSecond(second);
  };

  const handleStart = (e) => {
    e.preventDefault();

    if (isSortingActive.current) return; // Prevent multiple starts

    isSortingActive.current = true;
    setIsStartToggled(true);
    isPaused.current = false;

    const sortingAlgoName = returnSortingName();
 
    selectAlgo(
      sortingAlgoName,
      [...array], 
      setArray,
      updateGraph,
      changeColor,
      isPaused,
      () => (isSortingActive.current = false) 
    );
  };


  const handlePause = (e) => {
    e.preventDefault();
    if (!isStartToggled) return;

    isPaused.current = !isPaused.current;
    setIsPauseToggled(isPaused.current);
  };


  const handleReset = (e) => {
    e.preventDefault();

    isSortingActive.current = false; 
    isPaused.current = false; 

    if (sortingTimeoutRef.current) {
      clearTimeout(sortingTimeoutRef.current);
      sortingTimeoutRef.current = null;
    }

    const newArray = returnArray();
    setArray(newArray);
    setFirst(undefined);
    setSecond(undefined);
    setIsStartToggled(false);
    setIsPauseToggled(false);
  };

  return (
    <div id="graphArea">
      <div id="graph">
        <BarChart dataArray={array} firstIndex={first} secondIndex={second} />
      </div>
      <div id="graphButtons">
        <button id="startButton" onClick={handleStart}>
          {isStartToggled ? "Sorting..." : "Start"}
        </button>
        <button
          id="pauseButton"
          onClick={handlePause}
          disabled={!isStartToggled}
        >
          {isPauseToggled ? "Resume" : "Pause"}
        </button>
        <button id="resetButton" onClick={handleReset}>
          Reset
        </button>
      </div>
    </div>
  );
}

export default GraphArea;