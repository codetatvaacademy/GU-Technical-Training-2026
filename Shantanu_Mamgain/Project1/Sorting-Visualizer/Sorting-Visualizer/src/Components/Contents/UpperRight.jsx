import "./inputArea.css";
import "../button.css";
import React, { useState } from "react";
import DisplayArea from "./DisplayArea";
import InputArea from "./InputArea";
import { generateArray } from "./RandomArray.js";
import { getSortingName } from "./AlgoMenu.js";


function UpperRight() {
  const [isToggled, setIsToggled] = useState(false);
  const [formData, setFormData] = useState({
    arraySize: 0,
    SortingAlgorithm: "",
  });

  const [array, setArray] = useState([]);

  const toggleComponent = (e) => {
    e.preventDefault();
    if (!isToggled) {
      const form = e.currentTarget;
      const data = new FormData(form);
      const arraysize = parseInt(data.get("ArraySize"),10);
      const SortingAlgorithm = data.get("SortingAlgorithm");
      setFormData({ arraySize: arraysize, SortingAlgorithm });
      const newArray = generateArray(arraysize);
      setArray(newArray);
      getSortingName(SortingAlgorithm);
    }
    else{
      setArray([]);
    }
    setIsToggled(!isToggled);
  };
  

  return (
    <form method="get" onSubmit={toggleComponent}>
      {isToggled && (
        <DisplayArea
          SortingName={formData.SortingAlgorithm}
          GeneratedArray={array.join(", ")}
        />
      )}
      {!isToggled && <InputArea />}
      <button type="Submit" id="submit-container">
        {isToggled ? "Restart" : "Submit"}
      </button>
    </form>
  );
}
export default UpperRight;
