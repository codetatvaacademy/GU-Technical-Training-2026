const selectionSortBtn=document.querySelector(".SelectionSort");
selectionSortBtn.addEventListener('click',async()=>{
    disableSortingBtn();
    await selectionSort(document.querySelectorAll('.bar'));
    enableSortingBtn(); 
});

async function selectionSort(bars){
    const n=bars.length;
    for(let i=0;i<n-1;i++){
        let minIdx=i;
        bars[minIdx].style.background='rgb(250, 5, 54)';
        for(let j=i+1;j<n;j++){
            bars[j].style.background ='rgb(245, 212, 24)';
            await waitforme(delay);
            if(parseInt(bars[j].style.height)<parseInt(bars[minIdx].style.height)){
                if(minIdx!== i){
                    bars[minIdx].style.background='cyan';
                } 
                minIdx=j;
            }
            bars[j].style.background='cyan';
        }
        await waitforme(delay);
        [bars[minIdx].style.height,bars[i].style.height]=[bars[i].style.height,bars[minIdx].style.height];
        bars[minIdx].style.background='cyan';
        bars[i].style.background='rgb(0,255,0)';
    }
    bars[n-1].style.background='rgb(0,255,0)'; 
}
