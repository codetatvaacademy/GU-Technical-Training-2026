document.querySelector(".SelectionSort").addEventListener('click', async () => {
    let bars = document.querySelectorAll('.bar');
    for (let i = 0; i < bars.length - 1; i++) {
        let minIdx = i;
        for (let j = i + 1; j < bars.length; j++) {
            if (parseInt(bars[j].style.height) < parseInt(bars[minIdx].style.height)) {
                minIdx = j;
            }
        }
        [bars[i].style.height, bars[minIdx].style.height] = [bars[minIdx].style.height, bars[i].style.height];
    }
});
