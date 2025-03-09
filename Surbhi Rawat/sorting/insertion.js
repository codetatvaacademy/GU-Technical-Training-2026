document.querySelector(".InsertionSort").addEventListener('click', async () => {
    let bars = document.querySelectorAll('.bar');
    for (let i = 1; i < bars.length; i++) {
        let j = i;
        while (j > 0 && parseInt(bars[j - 1].style.height) > parseInt(bars[j].style.height)) {
            bars[j].classList.add('active');
            bars[j - 1].classList.add('active');
            await new Promise(resolve => setTimeout(resolve, speed));
            [bars[j].style.height, bars[j - 1].style.height] = [bars[j - 1].style.height, bars[j].style.height];
            bars[j].classList.remove('active');
            bars[j - 1].classList.remove('active');
            j--;
        }
    }
});
