export async function selectionSort(array, updateGraph, changeColor){
    for(let i = 0; i<array.length-1; i++){
        let min = i;
        for(let j=i+1; j<array.length; j++){
            changeColor(i, j);
            updateGraph(array);
            await new Promise((resolve) => setTimeout(resolve, 1200));
            if(array[j]<array[min]){
                min = j;
            }
        }
       await swap(array, min, i);
       changeColor(min, i);
       updateGraph(array);
       await new Promise((resolve) => setTimeout(resolve, 1200));
    }
    return array;
}

async function swap(array, min, i){
    let temp = array[i];
    array[i] = array[min];
    array[min] = temp;
}