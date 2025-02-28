const bars=document.querySelector("#mainbody");
let arrayVal=64;
let delay=39;
let array=[];
createNewArray(64);
function createNewArray(arrayVal){
    deleteChild();
    array=[];
    for(let i=0;i<arrayVal;i++){
        array.push(Math.floor(Math.random()*(370-20)+20));
    }
    for(let i=0;i<arrayVal;i++){
        const bar=document.createElement("div");
        bar.style.height=`${array[i]}px`;
        bar.className='bar';
        bar.innerHTML=`${array[i]}`;
        bar.style.width=`${(96 / arrayVal)}vw`;
        bars.appendChild(bar);
    }
}
function deleteChild(){
    while(bars.firstChild){
        bars.removeChild(bars.firstChild);
    }
}
function disableSortingBtn(){
    document.querySelectorAll(".BubbleSort,.InsertionSort,.MergeSort,.QuickSort,.SelectionSort").forEach(btn=>btn.disabled=true);
}
function enableSortingBtn(){
    document.querySelectorAll(".BubbleSort,.InsertionSort,.MergeSort,.QuickSort,.SelectionSort").forEach(btn=>btn.disabled=false);
}
function waitforme(milisec){
    return new Promise(resolve=>setTimeout(resolve,milisec));
}
function swapping(element1,element2){
    let temp=element1.style.height;
    element1.style.height=element2.style.height;
    element2.style.height=temp;
}