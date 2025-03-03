import React from "react";
import { useNavigate } from "react-router-dom";
import "../App.css";

const sortingOptions = [
  { value: "bubble", label: "Bubble Sort" },
  { value: "selection", label: "Selection Sort" },
  { value: "insertion", label: "Insertion Sort" },
  { value: "merge", label: "Merge Sort" },
  { value: "quick", label: "Quick Sort" },
];

function Home() {
  const navigate = useNavigate();

  return (
    <div className="home-container">
      <h1>Sorting Visualizer</h1>
      <div className="grid-container">
        {sortingOptions.map((sort) => (
          <div key={sort.value} className="sorting-box">
            <h4>{sort.label}</h4>
            <button onClick={() => navigate(`/visualize/${sort.value}`)}>
              Visualize
            </button>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Home;
