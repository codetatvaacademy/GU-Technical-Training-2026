import './Introduction.css'
function Introduction({Intro, SortingName}) {
  return (
    <div className="introduction-container">
      <h2>{SortingName} - </h2>
      <p>
        {Intro}
      </p>
    </div>
  );
}

export default Introduction;