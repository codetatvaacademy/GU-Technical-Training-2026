import "./Algorithm.css";

function Algorithm({Algorithm, Title}) {
  return (
    <div id="algorithm-container" >
      <h2>General Flow of {Title} - </h2>
      <pre>
        {Algorithm}
      </pre>
    </div>
  );
}

export default Algorithm;
