import { useState, useEffect } from "react";
import { BubbleSort, QuickSort } from "./sortingAlgorithm";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faPlay, faPause, faForward, faBackward, faRedo, faSort } from "@fortawesome/free-solid-svg-icons";

const SortingVisualizer = () => {
  const [array, setArray] = useState([]);
  const [speed, setSpeed] = useState(100);
  const [activeIndex, setActiveIndex] = useState([]);
  const [sorted, setSorted] = useState([]);
  const [algorithm, setAlgorithm] = useState("BubbleSort");
  const [arraySize, setArraySize] = useState(20);
  const [currentStep, setCurrentStep] = useState(0);
  const [isAutoPlaying, setIsAutoPlaying] = useState(false);
  const [autoPlayInterval, setAutoPlayInterval] = useState(null);
  const [sortingSteps, setSortingSteps] = useState([]);
  const [swapcount, setswapcount] = useState(0);
  const [comparisonscount, setcomparisonscount] = useState(0);
  const [sortorder, setsortorder] = useState("ascending");



  const generateArray = () => {
    const screenWidth = window.innerWidth;
    const barCount = screenWidth < 600 ? 10 : screenWidth < 1024 ? 18 : 25;
    const newArr = Array.from(
      { length: barCount },
      () => Math.floor(Math.random() * 100) + 1
    );
    setArray(newArr);
    setActiveIndex([]);
    setSorted([]);
    setSortingSteps([]);
    setCurrentStep(0);
    setIsAutoPlaying(false);
  };

  useEffect(() => {
    generateArray();
    window.addEventListener("resize", generateArray);
    return () => window.removeEventListener("resize", generateArray);
  }, []);


  const animateSortedBars = (sortedIndices) => {
    sortedIndices.forEach((index, i) => {
      setTimeout(() => {
        setSorted((prev) => [...prev, index]);
      }, i * 200);
    });
  };

  const handleSort = async () => {
    let steps = [];
    setswapcount(0);
    setcomparisonscount(0);
    setSorted([]);
    setSortingSteps([]);
    setCurrentStep(0);

    if (algorithm === "BubbleSort") {
      steps = BubbleSort(array, setswapcount, setcomparisonscount);
    } else if (algorithm === "QuickSort") {
      steps = QuickSort(array, setswapcount, setcomparisonscount);
    }

    if (sortorder === "descending") {
      steps = steps.map(step => ({ ...step, array: [...step.array].reverse(), }));
    }

    if (steps.length > 0) {
      setSortingSteps(steps);
      setCurrentStep(0);
      setArray(steps[0].array);
      setActiveIndex(steps[0].activeIndex || []);

      setTimeout(() => {
        setArray(steps[steps.length - 1].array);
        setSorted([...Array(array.length).keys()]);
        setActiveIndex([]);
      }, steps.length * 50)
    }
    startAutoPlay(steps, () => {
      animateSortedBars([...Array(array.length).keys()]);
    });
  };

  const startAutoPlay = (steps) => {
    setIsAutoPlaying(true);
    let step = currentStep;

    const interval = setInterval(() => {
      if (step < steps.length - 1) {
        step++;
        setCurrentStep(step);
        setArray(steps[step].array);
        setActiveIndex(steps[step].activeIndex || []);
        setSorted(steps[step].sorted || []);
      } else {
        clearInterval(interval);
        setIsAutoPlaying(false);
      }
    }, speed + 50);

    setAutoPlayInterval(interval);
  };

  const stopAutoPlay = () => {
    clearInterval(autoPlayInterval);
    setIsAutoPlaying(false);
  };

  const nextStep = () => {
    if (currentStep < sortingSteps.length - 1) {
      setCurrentStep(currentStep + 1);
      setArray(sortingSteps[currentStep + 1].array);
      setActiveIndex(sortingSteps[currentStep + 1].activeIndex || []);
      setSorted(sortingSteps[currentStep + 1].sorted || []);
    }
  };

  const prevStep = () => {
    if (currentStep > 0) {
      setCurrentStep(currentStep - 1);
      setArray(sortingSteps[currentStep - 1].array);
      setActiveIndex(sortingSteps[currentStep - 1].activeIndex || []);
      setSorted(sortingSteps[currentStep - 1].sorted || []);
    }
  };

  return (
    <div className="flex flex-row">
      <div className="flex flex-col items-center mt-2">
        <div className="m-auto mb-5 flex flex-row gap-5 text-xl font-semibold">
          <div className="flex m-auto flex-row">Step : <div className="mx-1 text-purple-700">{currentStep + 1}</div> / {sortingSteps.length || 1}</div>
          <div className="flex m-auto flex-row">Swaps : <div className="mx-1 text-purple-700">{swapcount}</div></div>
          <div className="flex m-auto flex-row">Comparisons : <div className="mx-1 text-purple-700">{comparisonscount}</div></div>
        </div>

        <div className="flex mx-4 space-x-2 mt-10 mb-3 items-end h-[300px]">
          {array.map((value, index) => (
            <div
              key={index}
              className={`w-4 transition-all duration-500 ease-in-out ${sorted.includes(index) ? "bg-purple-700 rounded-lg" :
                activeIndex.includes(index) ? "bg-red-500 rounded" : "bg-black rounded-lg"
                }`}
              style={{ width: "20px", height: `${value * 3.5}px`, transition: "height 0.3 ease-in-out,background-color 0.5s ease-in-out" }}
            ></div>
          ))}
        </div>

        <div className="w-[400px] mb-0 bg-black h-4 rounded-lg">
          <div
            className="h-4 bg-purple-700 rounded border-gray-900 border-2"
            style={{ width: `${sortingSteps.length > 0 ? ((currentStep + 1) / (sortingSteps.length)) * 100 : 0}%` }}
          ></div>
        </div>

        <div className="text-lg flex flex-row font-semibold mt-2">
          Progress : <div className="mx-2 text-purple-700">{Math.round(((currentStep + 1) / (sortingSteps.length || 1)) * 100)}%</div>
        </div>

        <div className=" mt-0 flex flex-row gap-5">
          <div className="mt-4 flex flex-col items-center">
            <label className="m-auto p-1 text-lg font-normal">Speed : {speed}ms</label>
            <input
              type="range"
              min="10"
              max="500"
              value={speed}
              onChange={(e) => setSpeed(Number(e.target.value))}
              className="w-30 appearance-none bg-black rounded-lg cursor-pointer accent-white hover:accent-purple-600"
            />
          </div>

          <div className="mt-4 flex flex-col items-center">
            <label className="m-auto p-1 text-lg font-normal">Array Size : {arraySize}</label>
            <input
              type="range"
              min="5"
              max="50"
              value={arraySize}
              onChange={(e) => setArraySize(Number(e.target.value))}
              className="w-50 appearance-none rounded-lg bg-black cursor-pointer accent-white hover:accent-purple-600"
            />
          </div>
        </div>
        <div className="mt-2 mx-2 flex flex-row space-x-6 m-auto">
          <div className="mt-4 space-x-3">
            <button onClick={prevStep} className=" bg-gray-900 text-white px-4 py-2 rounded-lg border-2 border-purple-600 hover:text-purple-600" disabled={currentStep === 0}>
              <FontAwesomeIcon icon={faBackward} />
            </button>
            <button onClick={isAutoPlaying ? stopAutoPlay : () => startAutoPlay(sortingSteps)} className="bg-gray-900 border-2 border-purple-600 text-white px-4 py-2 rounded-lg hover:text-purple-700">
              {isAutoPlaying ? <FontAwesomeIcon icon={faPause} /> : <FontAwesomeIcon icon={faPlay} />}
            </button>
            <button onClick={nextStep} className="bg-gray-900 text-white px-4 py-2 rounded-lg border-2 border-purple-600 hover:text-purple-600" disabled={currentStep >= sortingSteps.length - 1}>
              <FontAwesomeIcon icon={faForward} />
            </button>
          </div>
          <div className="mt-4 space-x-4">
            <button onClick={() => generateArray(arraySize)} className="text-white bg-gray-900 px-4 py-2 border-2 border-purple-600 rounded-lg hover:text-purple-500"><FontAwesomeIcon icon={faRedo} /> New</button>
            <button onClick={handleSort} className="bg-gray-900 text-white px-4 py-2 rounded-lg border-2 border-purple-600 hover:text-purple-500"><FontAwesomeIcon icon={faSort} /> Sort</button>
          </div>
        </div>
        <div className="flex flex-row gap-4 mt-5 mb-4 mx-4">
          <div className="mt-4">
            <label className="m-auto p-2 text-xl font-semibold">Algorithm :</label>
            <select
              className="ml-3 px-4 text-white py-2 bg-gray-900 border-purple-400 border-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-purple-500 hover:text-purple-400 "
              value={algorithm}
              onChange={(e) => setAlgorithm(e.target.value)}
            >
              <option value="BubbleSort">Bubble Sort</option>
              <option value="QuickSort">Quick Sort</option>
            </select>
          </div>
          <div className="mt-4 mb-4">
            <label className="m-auto p-2 text-xl font-semibold">SortOrder :</label>
            <select
              className="ml-3 text-white px-4 py-2 bg-gray-900 border-purple-400 border-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-purple-500 hover:text-purple-400 "
              value={sortorder}
              onChange={(e) => setsortorder(e.target.value)}
            >
              <option value="ascending">Ascending</option>
              <option value="descending">Descending</option>
            </select>
          </div>
        </div>
      </div>
    </div>
  );
};

export default SortingVisualizer;
