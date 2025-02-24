import './App.css';
import Graph from './components/Graph';

function App() {

  return (
    <div className="App">
      <h1 style={{fontFamily: 'pixalFont', 
        fontSize: '40px'
      }}>
        SORTING VISUALIZER
      </h1>
      <Graph />
      <p><h3>Important - </h3>Maximum number - 500  & Do not excide the limit or size 30 for optimal visual experience<br/>
        if the Input Cross 500 it will be taken, as (numebr % 501) - bar size</p>
    </div>
    
  );
}
export default App;

