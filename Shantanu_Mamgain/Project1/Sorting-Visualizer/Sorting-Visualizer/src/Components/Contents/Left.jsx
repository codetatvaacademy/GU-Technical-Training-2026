import Characterstics from "./Characterstic.jsx";
import Algorithm from "./Algorithm.jsx";
import FirstSection from "./FirstSection.jsx";
import { useState } from "react";
import "./Left.css";
import { selectData } from "./ImageMenu.js";
import { returnSortingName } from "./AlgoMenu.js";

function Left() {
    const [isToggled, setIsToggled] = useState(false);
    const [sort, setSort] = useState("Sorting Algorithm");
    const [title, setTitle] = useState("Vizualizer");


  const [source, setSource] = useState(
    "https://titrias.com/files/2015/08/Untitled.png"
  );
  const [definition, setDefinition] = useState(
    "Sorting algorithms are fundamental techniques used in computer science to arrange elements in a particular order, typically ascending or descending. These algorithms help in organizing data efficiently, enabling quicker searches, comparisons, and optimizations in various applications."
  );
  const [bestCase, setBestCase] = useState(
    "Best case time complexity is the minimum time an algorithm takes to complete, assuming the most favorable input configuration."
  );
  const [averageCase, setAverageCase] = useState(
    "The average case time complexity is the expected time taken by an algorithm over all possible inputs, assuming a uniform distribution of inputs."
  );
  const [worstCase, setWorstCase] = useState(
    "Worst case time complexity is the maximum amount of time an algorithm takes to complete, given the least favorable input of size n."
  );
  const [spaceComplexity, setSpaceComplexity] = useState(
    "Space complexity is the amount of memory an algorithm uses relative to the input size."
  );
  const [stablity, setStability] = useState(
    "Stability in sorting algorithms means that equal elements retain their original relative order after sorting."
  );
  const [in_place, setInPlace] = useState(
    "An in-place sorting algorithm sorts the array without needing extra space proportional to the input size, typically using only a constant amount of additional memory (O(1) space)."
  );
  const [algorithms, setAlgorithms] = useState([
    "1. Select the size of array.", "2. Select desired Sorting Algorithm.", "3. Click on Submit button to visualize sorting.","4. Pause Button: You can use this button to pause the sorting at any point and understand it.", "5. Reset Button: You can use this button to reset the sorted data to its default format.", "6. Start Button: You can use this button to start sorting the data to again after resetting."]
  );

  let data = selectData(sort);

  const RefreshData = (e) => {
    e.preventDefault();
    if (!isToggled) {
        const newSort = returnSortingName();
        setTitle(newSort);
        setSort(newSort);
        data = selectData(newSort);
        setSource(data[0]);
        setDefinition(data[1]);
        setBestCase(data[2]);
        setAverageCase(data[3]);
        setWorstCase(data[4]);
        setSpaceComplexity(data[5]);
        setStability(data[6]);
        setInPlace(data[7]);
        setAlgorithms(data[8]);
    }
    setIsToggled(!isToggled);
  };

  return (
    <div id="left">
      <FirstSection IntroData={definition} ImageSource={source} Name={sort===""?"Sorting Algorithm":sort} />
      <Characterstics
        BestCase={bestCase}
        AverageCase={averageCase}
        WorstCase={worstCase}
        SpaceComplexity={spaceComplexity}
        Stability={stablity}
        InPlace={in_place}
        Name={sort===""?"Sorting Algorithm":sort}

      />
      <Algorithm Algorithm={algorithms.join('\n')} Title={title===""?"Vizualizer":title}/>
      <button onClick={RefreshData}>Refresh</button>
    </div>
  );
}

export default Left;
