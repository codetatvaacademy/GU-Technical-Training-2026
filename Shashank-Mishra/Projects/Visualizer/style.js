let array = [];
let isPaused = false;
let speed = 300;
const barsContainer = document.getElementById("barsContainer");
const arraySizeInput = document.getElementById("arraySize");
const sortingMethodSelect = document.getElementById("sortingMethod");

function generateArray() {
    array = [];
    barsContainer.innerHTML = "";
    const size = arraySizeInput.value;
    
    for (let i = 0; i < size; i++) {
        let value = Math.floor(Math.random() * 300) + 10;
        array.push(value);

        let bar = document.createElement("div");
        bar.classList.add("bar");
        bar.style.height = `${value}px`;
        barsContainer.appendChild(bar);
    }
}

function swap(elements, i, j) {
    return new Promise(resolve => {
        setTimeout(() => {
            let temp = elements[i].style.height;
            elements[i].style.height = elements[j].style.height;
            elements[j].style.height = temp;
            resolve();
        }, speed);
    });
}

function pauseSorting() {
    isPaused = true;
}

async function resumeSorting() {
    isPaused = false;
    await startSorting();
}

document.getElementById("speedControl").addEventListener("input", function() {
    speed = 600 - this.value * 100;
});

async function bubbleSort() {
    let elements = document.querySelectorAll(".bar");
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = 0; j < array.length - i - 1; j++) {
            while (isPaused) await new Promise(resolve => setTimeout(resolve, 100));
            elements[j].style.backgroundColor = "red";
            elements[j + 1].style.backgroundColor = "red";
            if (array[j] > array[j + 1]) {
                await swap(elements, j, j + 1);
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
            }
            elements[j].style.backgroundColor = "teal";
            elements[j + 1].style.backgroundColor = "teal";
        }
    }
}

async function selectionSort() {
    let elements = document.querySelectorAll(".bar");
    for (let i = 0; i < array.length - 1; i++) {
        let minIndex = i;
        for (let j = i + 1; j < array.length; j++) {
            while (isPaused) await new Promise(resolve => setTimeout(resolve, 100));
            elements[j].style.backgroundColor = "red";
            elements[minIndex].style.backgroundColor = "blue";
            await new Promise(resolve => setTimeout(resolve, speed));

            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
            elements[j].style.backgroundColor = "teal";
        }
        if (minIndex !== i) {
            await swap(elements, i, minIndex);
            [array[i], array[minIndex]] = [array[minIndex], array[i]];
        }
        elements[minIndex].style.backgroundColor = "teal";
    }
}

async function insertionSort() {
    let elements = document.querySelectorAll(".bar");
    for (let i = 1; i < array.length; i++) {
        let key = array[i];
        let j = i - 1;
        while (j >= 0 && array[j] > key) {
            while (isPaused) await new Promise(resolve => setTimeout(resolve, 100));
            elements[j + 1].style.height = elements[j].style.height;
            array[j + 1] = array[j];
            j--;
            await new Promise(resolve => setTimeout(resolve, speed));
        }
        elements[j + 1].style.height = `${key}px`;
        array[j + 1] = key;
    }
}

async function mergeSort(left = 0, right = array.length - 1) {
    if (left >= right) return;
    let mid = Math.floor((left + right) / 2);
    await mergeSort(left, mid);
    await mergeSort(mid + 1, right);
    await merge(left, mid, right);
}

async function merge(left, mid, right) {
    let temp = [];
    let i = left, j = mid + 1;

    while (i <= mid && j <= right) {
        while (isPaused) await new Promise(resolve => setTimeout(resolve, 100));
        if (array[i] <= array[j]) {
            temp.push(array[i++]);
        } else {
            temp.push(array[j++]);
        }
    }
    while (i <= mid) temp.push(array[i++]);
    while (j <= right) temp.push(array[j++]);

    for (let k = left, index = 0; k <= right; k++, index++) {
        array[k] = temp[index];
        document.querySelectorAll(".bar")[k].style.height = `${array[k]}px`;
        await new Promise(resolve => setTimeout(resolve, speed));
    }
}

async function quickSort(left = 0, right = array.length - 1) {
    if (left >= right) return;
    let pivotIndex = await partition(left, right);
    await quickSort(left, pivotIndex - 1);
    await quickSort(pivotIndex + 1, right);
}

async function partition(left, right) {
    let elements = document.querySelectorAll(".bar");
    let pivot = array[right];
    let i = left - 1;

    for (let j = left; j < right; j++) {
        while (isPaused) await new Promise(resolve => setTimeout(resolve, 100));
        elements[j].style.backgroundColor = "red";
        await new Promise(resolve => setTimeout(resolve, speed));
        if (array[j] < pivot) {
            i++;
            await swap(elements, i, j);
            [array[i], array[j]] = [array[j], array[i]];
        }
        elements[j].style.backgroundColor = "teal";
    }
    await swap(elements, i + 1, right);
    [array[i + 1], array[right]] = [array[right], array[i + 1]];
    return i + 1;
}

function startSorting() {
    let method = sortingMethodSelect.value;
    if (method === "bubbleSort") bubbleSort();
    else if (method === "selectionSort") selectionSort();
    else if (method === "insertionSort") insertionSort();
    else if (method === "mergeSort") mergeSort();
    else if (method === "quickSort") quickSort();
}

generateArray();
arraySizeInput.addEventListener("input", generateArray);
