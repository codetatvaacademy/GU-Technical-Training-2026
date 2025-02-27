import React from "react";

const SortingBar = ({ height, color }) => {
  return (
    <div 
      style={{ 
        width: "30px",
        height: `${height}px`,
        backgroundColor: color || "lightblue",
        border: "1px solid black",
        margin: "0", // Ensure no margin between bars
        display: "inline-block", // Make bars inline-block to be adjacent
      }} 
    />
  );
};

export default SortingBar;