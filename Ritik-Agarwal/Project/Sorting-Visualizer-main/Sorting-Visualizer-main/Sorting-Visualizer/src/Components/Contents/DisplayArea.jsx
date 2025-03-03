import './InputArea.css'
function DisplayArea({SortingName, GeneratedArray, GeneratedSortedArray}){
    return(
        <div>
            <h1>{SortingName}</h1>
            <p>Array Elements - {GeneratedArray}</p>
            <p>Array Elements Sorted - {GeneratedSortedArray}</p>
        </div>
    );
}

export default DisplayArea;