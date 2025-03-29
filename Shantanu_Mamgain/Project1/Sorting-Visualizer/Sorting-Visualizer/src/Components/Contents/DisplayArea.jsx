import './InputArea.css'
function DisplayArea({SortingName, GeneratedArray}){
    return(
        <div>
            <h1>{SortingName}</h1>
            <p>Array Elements - {GeneratedArray}</p>
        </div>
    );
}

export default DisplayArea;