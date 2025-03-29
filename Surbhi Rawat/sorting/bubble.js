document.querySelector(".BubbleSort").addEventListener('click', async () => {
    let bars = document.querySelectorAll('.bar');
    for (let i = 0; i < bars.length - 1; i++) {
        for (let j = 0; j < bars.length - i - 1; j++) {
            bars[j].classList.add('active');
            bars[j + 1].classList.add('active');

            if (parseInt(bars[j].style.height) > parseInt(bars[j + 1].style.height)) {
                await new Promise(resolve => setTimeout(resolve, speed));
                [bars[j].style.height, bars[j + 1].style.height] = [bars[j + 1].style.height, bars[j].style.height];
            }

            bars[j].classList.remove('active');
            bars[j + 1].classList.remove('active');
        }
    }
});
