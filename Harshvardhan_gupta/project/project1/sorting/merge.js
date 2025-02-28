const mergeSortBtn=document.querySelector(".MergeSort");
mergeSortBtn.addEventListener('click',async()=>{
    disableSortingBtn();
    await mergeSort();
    enableSortingBtn(); 
});

async function mergeSort(){
    const bars=document.querySelectorAll('.bar');
    await mergeSortHelper(bars,0,bars.length-1);
    bars.forEach(bar=>bar.style.background='rgb(0,255,0)');
}

async function mergeSortHelper(bars,left,right){
    if(left>=right){
        return;
    }
    const mid=left+Math.floor((right-left)/2);
    await mergeSortHelper(bars,left,mid);
    await mergeSortHelper(bars,mid+1,right);
    await merge(bars,left,mid,right);
}

async function merge(bars,left,mid,right){
    let leftArr=Array.from({length:mid-left+1},(_,i)=>bars[left+i].style.height);
    let rightArr=Array.from({length:right-mid},(_,i)=>bars[mid+1+i].style.height);
    let [i,j,k]=[0,0,left];
    for(let x=left;x<=mid;x++){
        bars[x].style.background='red';   
    } 
    for(let x=mid+1;x<=right;x++){
        bars[x].style.background='yellow';
    }
    await waitforme(delay);

    while(i<leftArr.length||j<rightArr.length){
        let leftVal=i<leftArr.length?parseInt(leftArr[i]):Infinity;
        let rightVal=j<rightArr.length?parseInt(rightArr[j]):Infinity;
        bars[k].style.background='lightgreen';
        bars[k].style.height=leftVal<=rightVal?leftArr[i++]:rightArr[j++];
        await waitforme(delay);
        k++;
    }
}
