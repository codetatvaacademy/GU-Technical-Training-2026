import Introduction from "./Introduction";
import GraphImage from "./GraphImage";
import './FirstSection.css'

function FirstSection({IntroData, ImageSource, Name}) {
  return (
    <div id="first-section">
      <Introduction Intro = {IntroData} SortingName={Name}/>
      <GraphImage Image = {ImageSource}/>
    </div>
  );
}

export default FirstSection;