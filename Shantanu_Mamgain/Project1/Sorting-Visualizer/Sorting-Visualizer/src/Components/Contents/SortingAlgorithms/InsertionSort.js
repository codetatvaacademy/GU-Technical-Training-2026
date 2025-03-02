
export async function insertionSort(arr, updateGraph, changeColor)
{
    let newArray=[...arr];
    for(let i=1;i<newArray.length;i++){
        let key=newArray[i];
        let j=i-1;
        while(j>=0 && newArray[j]>key){
            updateGraph(newArray);
            changeColor(j, j-1);
            await new Promise((resolve) => setTimeout(resolve, 1200));
            newArray[j+1]=newArray[j];
            j=j-1;
            updateGraph(newArray);
            changeColor(j, j-1);
            await new Promise((resolve) => setTimeout(resolve, 1200));
        }
        newArray[j+1]=key;
    }
    return newArray;
}