const insertionSortBtn=document.querySelector(".InsertionSort");

insertionSortBtn.addEventListener('click',async()=>{
    document.querySelector('#fullbody').style.height ='184vh';
    console.log('Insertion sort');
    disableSortingBtn();
    await insertionSort();
    enableSortingBtn();
});

async function insertionSort(){
    const bars=document.querySelectorAll('.bar');
    const n=bars.length;
    for (let i=1;i<n;i++){
        let j=i-1;
        let currentHeight=bars[i].style.height;
        bars[i].style.background='rgb(250, 5, 54)';
        await waitforme(delay);
        while (j>=0&&parseInt(bars[j].style.height)>parseInt(currentHeight)){
            bars[j].style.background='rgb(9, 102, 2)';
            bars[j+1].style.height=bars[j].style.height;
            j--;
            await waitforme(delay);
        }
        bars[j+1].style.height=currentHeight;
        bars[i].style.background='rgb(245, 212, 24)';
        await waitforme(delay);
        for(let k=0;k<=i;k++){
            bars[k].style.background='rgb(3, 252, 11)';
        }
    }
    for(let k=0;k<n;k++){
        bars[k].style.background='rgb(0,255,0)';
    }
}
