export async function countingSort(array, updateGraph, changeColor){
    let k = array[0];
    for(let i=1; i<array.length; i++){
        changeColor(i,-1);
        updateGraph([...array]);
        await new Promise((resolve) => setTimeout(resolve, 1200));
        if(array[i]>k){
            k = array[i];
        }
    }
    const freq = new Array(k+1).fill(0);

    for(let i=0; i<array.length; i++){
        freq[array[i]]++;
        
    }

    for(let i=1; i<freq.length; i++){
        freq[i] += freq[i-1];
    }

    const ans = new Array(array.length);
    
    for(let i=array.length-1; i>=0; i--){
        freq[array[i]]--;
        ans[freq[array[i]]] = array[i];
     }
     for (let i = 0; i < array.length; i++) {
        array[i] = ans[i];
        changeColor(i, -1);
        updateGraph([...array]);
        await new Promise((resolve) => setTimeout(resolve, 1200));
    }

    return ans;
}