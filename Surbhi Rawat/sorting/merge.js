document.querySelector(".MergeSort").addEventListener('click', async () => {
    await mergeSort(0, array.length - 1);
});

async function mergeSort(left, right) {
    if (left >= right) return;
    const mid = left + Math.floor((right - left) / 2);
    await mergeSort(left, mid);
    await mergeSort(mid + 1, right);
    await merge(left, mid, right);
}

async function merge(left, mid, right) {
    let bars = document.querySelectorAll('.bar');
    let leftArr = array.slice(left, mid + 1);
    let rightArr = array.slice(mid + 1, right + 1);
    let i = 0, j = 0, k = left;

    while (i < leftArr.length || j < rightArr.length) {
        let leftVal = i < leftArr.length ? leftArr[i] : Infinity;
        let rightVal = j < rightArr.length ? rightArr[j] : Infinity;
        bars[k].style.height = leftVal <= rightVal ? `${leftArr[i++]}px` : `${rightArr[j++]}px`;
        bars[k].style.background = 'lightgreen';
        await new Promise(resolve => setTimeout(resolve, speed));
        k++;
    }
}
