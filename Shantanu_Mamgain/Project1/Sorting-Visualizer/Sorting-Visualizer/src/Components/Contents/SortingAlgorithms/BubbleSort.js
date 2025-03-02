function swap(arr, i , j){
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
} 
export async function bubbleSort(arr, updateGraph, changeColor){
    let n = arr.length;

    let newArray=[...arr];
    for(let i = 0; i < n-1; i++){
        for(let j = 0; j < n- i -1; j++){
            updateGraph(newArray);
            changeColor(j, j+1);
            await new Promise((resolve) => setTimeout(resolve, 1200));
            if(newArray[j] > newArray[j+1]){
                swap(newArray, j, j+1);
                updateGraph(newArray);
                changeColor(j, j+1);
                await new Promise((resolve) => setTimeout(resolve, 1200));
            }
        }
    }
    return newArray;
}