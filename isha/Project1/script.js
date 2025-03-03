let array = [];

function generateArray() {
    array = [];
    const size = document.getElementById("array-size").value;

    for (let i = 0; i < size; i++) {
        array.push(Math.floor(Math.random() * 100) + 1);
    }

    renderArray();
}

function setManualArray() {
    const input = document.getElementById("array-input").value;
    if (!input) {
        alert("Please enter values separated by commas.");
        return;
    }

    array = input.split(",").map(num => parseInt(num.trim(), 10)).filter(num => !isNaN(num));

    if (array.length === 0) {
        alert("Invalid input! Please enter valid numbers.");
        return;
    }

    renderArray();
}

function renderArray() {
    const container = document.getElementById("array-container");
    container.innerHTML = "";

    array.forEach(value => {
        const bar = document.createElement("div");
        bar.style.height = `${value * 3}px`;
        bar.classList.add("bar");
        container.appendChild(bar);
    });
}

async function bubbleSort() {
    let bars = document.getElementsByClassName("bar");
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
                bars[j].style.height = `${array[j] * 3}px`;
                bars[j + 1].style.height = `${array[j + 1] * 3}px`;
            }
            await new Promise(resolve => setTimeout(resolve, 50));
        }
    }
}

async function selectionSort() {
    let bars = document.getElementsByClassName("bar");
    for (let i = 0; i < array.length; i++) {
        let minIdx = i;
        for (let j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIdx]) minIdx = j;
        }
        [array[i], array[minIdx]] = [array[minIdx], array[i]];
        bars[i].style.height = `${array[i] * 3}px`;
        bars[minIdx].style.height = `${array[minIdx] * 3}px`;
        await new Promise(resolve => setTimeout(resolve, 50));
    }
}

async function insertionSort() {
    let bars = document.getElementsByClassName("bar");
    for (let i = 1; i < array.length; i++) {
        let key = array[i],
            j = i - 1;
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            bars[j + 1].style.height = `${array[j + 1] * 3}px`;
            j--;
            await new Promise(resolve => setTimeout(resolve, 50));
        }
        array[j + 1] = key;
        bars[j + 1].style.height = `${key * 3}px`;
    }
}

async function mergeSortHelper(l, r) {
    if (l >= r) return;
    let m = Math.floor((l + r) / 2);
    await mergeSortHelper(l, m);
    await mergeSortHelper(m + 1, r);
    await merge(l, m, r);
}

async function merge(l, m, r) {
    let bars = document.getElementsByClassName("bar");
    let sorted = [],
        i = l,
        j = m + 1;
    while (i <= m && j <= r) {
        sorted.push(array[i] < array[j] ? array[i++] : array[j++]);
    }
    while (i <= m) sorted.push(array[i++]);
    while (j <= r) sorted.push(array[j++]);
    for (let k = l; k <= r; k++) {
        array[k] = sorted[k - l];
        bars[k].style.height = `${array[k] * 3}px`;
        await new Promise(resolve => setTimeout(resolve, 50));
    }
}

async function quickSort(l = 0, r = array.length - 1) {
    if (l >= r) return;
    let pivot = array[r],
        pIndex = l;
    let bars = document.getElementsByClassName("bar");
    for (let i = l; i < r; i++) {
        if (array[i] < pivot) {
            [array[i], array[pIndex]] = [array[pIndex], array[i]];
            bars[i].style.height = `${array[i] * 3}px`;
            bars[pIndex].style.height = `${array[pIndex] * 3}px`;
            pIndex++;
        }
        await new Promise(resolve => setTimeout(resolve, 50));
    }
    [array[pIndex], array[r]] = [array[r], array[pIndex]];
    bars[pIndex].style.height = `${array[pIndex] * 3}px`;
    bars[r].style.height = `${array[r] * 3}px`;
    await quickSort(l, pIndex - 1);
    await quickSort(pIndex + 1, r);
}

async function sortArray() {
    const algorithm = document.getElementById("algorithm").value;
    if (algorithm === "bubble") await bubbleSort();
    else if (algorithm === "selection") await selectionSort();
    else if (algorithm === "insertion") await insertionSort();
    else if (algorithm === "merge") await mergeSortHelper(0, array.length - 1);
    else if (algorithm === "quick") await quickSort();
}

generateArray();