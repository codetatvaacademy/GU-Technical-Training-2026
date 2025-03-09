const container = document.getElementById('sorting-container');
const sizeSlider = document.getElementById('sizeSlider');
const speedSlider = document.getElementById('speedSlider');
const generateArrayBtn = document.getElementById('generateArray');

let array = [];
let speed = 500 / speedSlider.value;

function generateArray(size) {
    container.innerHTML = '';
    array = [];
    for (let i = 0; i < size; i++) {
        let value = Math.floor(Math.random() * 300) + 10;
        array.push(value);
        const bar = document.createElement('div');
        bar.classList.add('bar');
        bar.style.height = `${value}px`;
        container.appendChild(bar);
    }
}

generateArrayBtn.addEventListener('click', () => generateArray(sizeSlider.value));
sizeSlider.addEventListener('input', () => generateArray(sizeSlider.value));
speedSlider.addEventListener('input', () => speed = 500 / speedSlider.value);

generateArray(sizeSlider.value);
