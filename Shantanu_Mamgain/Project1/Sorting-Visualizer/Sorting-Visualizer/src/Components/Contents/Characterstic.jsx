import './Characterstics.css'

function Charactersitics({BestCase, AverageCase, WorstCase, SpaceComplexity, Stability, InPlace, Name}){
  return (
    <div className="characterstic-container">
      <h2>Characteristics of {Name} - </h2>
      <h3>1. Time Complexity</h3>
      <p>
        Best Case - {BestCase}
      </p>
      <p>
        Average Case - {AverageCase}
      </p>
      <p>
        Worst Case - {WorstCase}
      </p>
      <h3>2. Space Complexity</h3>
      <p>
        Space Complexity - {SpaceComplexity}
      </p>
      <h3>3. Stability</h3>
      <p>
        {Stability}
      </p>
      <h3>4. In-Place</h3>
      <p>
       {InPlace}
      </p>
    </div>
  );
}
export default Charactersitics;
