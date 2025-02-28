const bubbleSortBtn=document.querySelector(".BubbleSort");
bubbleSortBtn.addEventListener('click',async()=>{
    document.querySelector('#fullbody').style.height='184vh';
    console.log('Bubble sort');
    disableSortingBtn();
    await bubbleSort();
    enableSortingBtn(); 
});

async function bubbleSort(){
    const bars=document.querySelectorAll('.bar');
    const n=bars.length;
    for(let i=0;i<n-1;i++){
        for(let j=0;j<n-i-1;j++){
            bars[j].style.background=bars[j+1].style.background='rgb(250, 5, 54)';
            if(parseInt(bars[j].style.height)>parseInt(bars[j + 1].style.height)){
                await waitforme(delay);
                swapping(bars[j],bars[j+1]);
            }
            bars[j].style.background=bars[j + 1].style.background ='rgb(245, 212, 24)';
        }
        bars[n-1-i].style.background ='rgb(0,255,0)';
    }
    bars[0].style.background ='rgb(0,255,0)';
}
