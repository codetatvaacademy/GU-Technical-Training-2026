const quickSortBtn=document.querySelector(".QuickSort");
quickSortBtn.addEventListener('click',async()=>{
    disableSortingBtn();
    await quickSort(document.querySelectorAll('.bar'),0,document.querySelectorAll('.bar').length-1);
    enableSortingBtn(); 
});

async function quickSort(bars,low,high){
    if(low<high){
        let pi=await partition(bars,low,high);
        await quickSort(bars,low,pi-1);
        await quickSort(bars,pi+1,high);
    } 
    else if(low>=0&&high>=0&&low<bars.length&&high<bars.length){
        bars[low].style.background=bars[high].style.background='rgb(0,255,0)';
    }
}

async function partition(bars,low,high){
    let pivot=bars[high].style.height,i=low-1;
    bars[high].style.background='red';
    for(let j=low;j<high;j++){
        bars[j].style.background='yellow';
        await waitforme(delay);
        if(parseInt(bars[j].style.height)<parseInt(pivot)){
            i++;
            [bars[i].style.height,bars[j].style.height]=[bars[j].style.height,bars[i].style.height];
            bars[i].style.background='orange';
            await waitforme(delay);
        }
        bars[j].style.background='cyan';
    }
    [bars[i+1].style.height,bars[high].style.height]=[bars[high].style.height,bars[i+1].style.height];
    bars[high].style.background='cyan';
    bars[i+1].style.background='rgb(0,255,0)';
    return i+1;
}
