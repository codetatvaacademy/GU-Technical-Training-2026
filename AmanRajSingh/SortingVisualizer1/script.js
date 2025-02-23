document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('generateArray').addEventListener('click', function() {
        console.log("Generate Array button clicked.");
        generateArray();
    });
    document.getElementById('setArray').addEventListener('click', function() {
        console.log("Set Array button clicked.");
        setArrayFromInput();
    });
    document.getElementById('startSorting').addEventListener('click', function() {
        console.log("Start Sorting button clicked.");
        startSorting();
    });
});

function setArrayFromInput() {
    console.log("Setting array from user input...");
    const arrayInput = document.getElementById('arrayInput').value;
    const array = arrayInput.split(',').map(num => parseInt(num.trim())).filter(num => !isNaN(num));
    
    if (array.length === 0) {
        console.error("Invalid input. Please enter a valid comma-separated list of numbers.");
        return;
    }

    displayArray(array);
}

function generateArray() {
    console.log("Generating random array...");
    const arraySize = document.getElementById('arraySize').value;
    console.log("Array size:", arraySize);

    if (isNaN(arraySize) || arraySize < 1 || arraySize > 100) {
        console.error("Invalid array size. Please enter a number between 1 and 100.");
        return;
    }

    const array = Array.from({ length: arraySize }, () => Math.floor(Math.random() * 100) + 1);
    displayArray(array);
}

function displayArray(array) {
    const arrayContainer = document.getElementById('arrayContainer');
    arrayContainer.innerHTML = ''; 
    
    array.forEach(value => {
        const bar = document.createElement('div');
        bar.style.height = `${value * 3}px`; 
        bar.className = 'bar';
        bar.innerText = value;
        bar.style.display = 'flex';
        bar.style.alignItems = 'flex-end';
        bar.style.justifyContent = 'center';
        bar.style.color = 'white';
        bar.style.fontSize = '12px';
        arrayContainer.appendChild(bar);
    });
}

function startSorting() {
    const bars = document.querySelectorAll('.bar');
    const array = Array.from(bars).map(bar => parseInt(bar.innerText)); 

    const selectedAlgorithm = document.querySelector('input[name="sortingAlgorithm"]:checked').value;
    console.log("Selected algorithm:", selectedAlgorithm);
    
    if (array.length === 0) {
        console.error("Array is empty. Please generate or set an array first.");
        return;
    }

    switch (selectedAlgorithm) {
        case 'bubble':
            visualizeBubbleSort(array);
            break;
        case 'selection':
            visualizeSelectionSort(array);
            break;
        case 'insertion':
            visualizeInsertionSort(array);
            break;
        case 'merge':
            visualizeMergeSort(array, 0, array.length - 1);
            break;
        case 'quick':
            visualizeQuickSort(array, 0, array.length - 1);
            break;
    }
}

async function visualizeBubbleSort(array) {
    const bars = document.querySelectorAll('.bar');
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
                await updateBars(array, bars);
            }
        }
    }
}

async function visualizeSelectionSort(array) {
    const bars = document.querySelectorAll('.bar');
    for (let i = 0; i < array.length - 1; i++) {
        let minIndex = i;
        for (let j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        [array[i], array[minIndex]] = [array[minIndex], array[i]];
        await updateBars(array, bars);
    }
}

async function visualizeInsertionSort(array) {
    const bars = document.querySelectorAll('.bar');
    for (let i = 1; i < array.length; i++) {
        let key = array[i];
        let j = i - 1;
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j--;
            await updateBars(array, bars);
        }
        array[j + 1] = key;
        await updateBars(array, bars);
    }
}

async function visualizeMergeSort(array, left, right) {
    if (left >= right) return;
    const mid = Math.floor((left + right) / 2);
    await visualizeMergeSort(array, left, mid);
    await visualizeMergeSort(array, mid + 1, right);
    await merge(array, left, mid, right);
    await updateBars(array, document.querySelectorAll('.bar'));
}

async function merge(array, left, mid, right) {
    const sorted = [...array.slice(left, mid + 1), ...array.slice(mid + 1, right + 1)].sort((a, b) => a - b);
    for (let i = left; i <= right; i++) {
        array[i] = sorted[i - left];
    }
}

async function visualizeQuickSort(array, low, high) {
    if (low >= high) return;
    let pivotIndex = await partition(array, low, high);
    await visualizeQuickSort(array, low, pivotIndex - 1);
    await visualizeQuickSort(array, pivotIndex + 1, high);
}

async function partition(array, low, high) {
    let pivot = array[high];
    let i = low;
    for (let j = low; j < high; j++) {
        if (array[j] < pivot) {
            [array[i], array[j]] = [array[j], array[i]];
            i++;
        }
    }
    [array[i], array[high]] = [array[high], array[i]];
    await updateBars(array, document.querySelectorAll('.bar'));
    return i;
}

async function updateBars(array, bars) {
    for (let i = 0; i < array.length; i++) {
        bars[i].style.height = `${array[i] * 3}px`;
        bars[i].innerText = array[i];
    }
    await new Promise(resolve => setTimeout(resolve, 500));
}
