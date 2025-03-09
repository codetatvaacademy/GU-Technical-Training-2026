document.querySelector(".QuickSort").addEventListener('click', async () => {
    await quickSort(0, array.length - 1);
});

async function quickSort(low, high) {
    if (low < high) {
        let pivot = await partition(low, high);
        await quickSort(low, pivot - 1);
        await quickSort(pivot + 1, high);
    }
}

async function partition(low, high) {
    let bars = document.querySelectorAll('.bar');
    let pivot = parseInt(bars[high].style.height);
    let i = low - 1;
    bars[high].style.background = 'red';

    for (let j = low; j < high; j++) {
        bars[j].style.background = 'yellow';
        await new Promise(resolve => setTimeout(resolve, speed));
        if (parseInt(bars[j].style.height) < pivot) {
            i++;
            [bars[i].style.height, bars[j].style.height] = [bars[j].style.height, bars[i].style.height];
            bars[i].style.background = 'orange';
        }
        bars[j].style.background = 'cyan';
    }
    [bars[i + 1].style.height, bars[high].style.height] = [bars[high].style.height, bars[i + 1].style.height];
    bars[high].style.background = 'cyan';
    bars[i + 1].style.background = 'green';
    return i + 1;
}
