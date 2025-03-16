let arr = [];
let parentDiv = document.querySelector('.parentDiv');
let startBtn = document.querySelector('.startbtn');
let stopBtn = document.querySelector('.stopbtn');
let sound = new Audio('swap-sound.mp3');
let sorting = false;
let currentAlgorithm = null;

const arraySizeInput = document.getElementById('arraySize');
const createArrayBtn = document.getElementById('createArrayBtn');
const arrayInputContainer = document.getElementById('arrayInputContainer');
const arrayElementsInput = document.getElementById('arrayElements');
const sortArrayBtn = document.getElementById('sortArrayBtn');

createArrayBtn.addEventListener('click', () => {
    const size = parseInt(arraySizeInput.value);
    if (isNaN(size) || size <= 0) {
        alert("Please enter a valid array size.");
        return;
    }

    arrayInputContainer.style.display = 'flex';
    arrayElementsInput.focus();
});

sortArrayBtn.addEventListener('click', () => {
    const elements = arrayElementsInput.value.split(',').map(Number);

    if (elements.length !== parseInt(arraySizeInput.value)) {
        alert("Number of elements entered does not match the array size.");
        return;
    }

    if (elements.some(isNaN)) {
        alert("Please enter valid numbers separated by commas.");
        return;
    }

    arr = elements;
    createBars();
    arrayInputContainer.style.display = 'none';
    arraySizeInput.value = '';
    arrayElementsInput.value = '';
});

function createBars() {
    parentDiv.innerHTML = "";
    arr.forEach((e, i) => {
        let innerDiv = document.createElement('div');
        innerDiv.style.height = '200px';
        innerDiv.style.width = '30px';
        innerDiv.style.margin = '4px';
        innerDiv.classList.add("innerDiv");
        innerDiv.style.position = 'relative';
        innerDiv.id = 'elem' + i;

        let bar = document.createElement('div');
        bar.classList.add('bar');
        bar.style.height = (e * 1.5) + 'px';
        innerDiv.appendChild(bar);

        let valueDiv = document.createElement('div');
        valueDiv.textContent = e;
        innerDiv.appendChild(valueDiv);

        parentDiv.appendChild(innerDiv);
    });
}

// Algorithm button event listeners
document.getElementById('bubbleSortBtn').addEventListener('click', () => {
    currentAlgorithm = bubbleSort;
});
document.getElementById('selectionSortBtn').addEventListener('click', () => {
    currentAlgorithm = selectionSort;
});
document.getElementById('mergeSortBtn').addEventListener('click', () => {
    currentAlgorithm = mergeSort;
});
document.getElementById('quickSortBtn').addEventListener('click', () => {
    currentAlgorithm = quickSort;
});
document.getElementById('insertionSortBtn').addEventListener('click', () => {
    currentAlgorithm = insertionSort;
});

startBtn.addEventListener("click", async () => {
    if (!sorting && arr.length > 0 && currentAlgorithm) {
        sorting = true;
        startBtn.disabled = true;
        stopBtn.disabled = false;
        await currentAlgorithm(arr);
        sorting = false;
        startBtn.disabled = false;
        stopBtn.disabled = true;
    } else if (arr.length === 0) {
        alert("Please create an array first.");
    } else if (!currentAlgorithm) {
        alert("Please select a sorting algorithm.");
    }
});

stopBtn.addEventListener("click", () => {
    sorting = false;
    startBtn.disabled = false;
    stopBtn.disabled = true;
});

const sleep = (time) => new Promise(resolve => setTimeout(resolve, time));


// Sorting Algorithms

async function bubbleSort(arr) {
    let len = arr.length;
    for (let i = 0; i < len && sorting; i++) {
        for (let j = 0; j < (len - i - 1) && sorting; j++) {
            let e1 = document.getElementById('elem' + j);
            let e2 = document.getElementById('elem' + (j + 1));

            e1.classList.add("comparing");
            e2.classList.add("comparing");
            await sleep(200);

            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];

                let v1 = e1.querySelector('div:not(.bar)');
                let v2 = e2.querySelector('div:not(.bar)');
                let tempValue = v1.textContent;
                v1.textContent = v2.textContent;
                v2.textContent = tempValue;

                swapColorHeight(j);
                sound.play();
                await sleep(300);

                e1.classList.remove("comparing");
                e2.classList.remove("comparing");
                e1.classList.add("swapping");
                e2.classList.add("swapping");
                await sleep(100);
                e1.classList.remove("swapping");
                e2.classList.remove("swapping");

            } else {
                e1.classList.remove("comparing");
                e2.classList.remove("comparing");
                e1.style.backgroundColor = 'lightgreen';
                e2.style.backgroundColor = 'lightgreen';
                await sleep(100);
                e1.style.backgroundColor = '';
                e2.style.backgroundColor = '';
            }
        }
        document.getElementById('elem' + (len - i - 1)).classList.add("sorted");
    }
    document.getElementById('elem0').classList.add("sorted");
}

async function selectionSort(arr) {
    let n = arr.length;
    for (let i = 0; i < n - 1 && sorting; i++) {
        let min_idx = i;
        let e1 = document.getElementById('elem' + i);
        e1.classList.add("comparing");
        for (let j = i + 1; j < n && sorting; j++) {
            let e2 = document.getElementById('elem' + j);
            e2.classList.add("comparing");
            await sleep(100);
            if (arr[j] < arr[min_idx]) {
                if (min_idx != i) {
                    let e_min = document.getElementById('elem' + min_idx);
                    e_min.classList.remove("comparing");
                }
                min_idx = j;
            } else {
                e2.classList.remove("comparing");
            }
        }
        if (min_idx != i) {
            [arr[i], arr[min_idx]] = [arr[min_idx], arr[i]];

            let v1 = e1.querySelector('div:not(.bar)');
            let v2 = document.getElementById('elem' + min_idx).querySelector('div:not(.bar)');
            let tempValue = v1.textContent;
            v1.textContent = v2.textContent;
            v2.textContent = tempValue;
            swapColorHeight(i, min_idx);
            sound.play();
            await sleep(300);

            e1.classList.remove("comparing");
            let e_min = document.getElementById('elem' + min_idx);
            e_min.classList.remove("comparing");
            e1.classList.add("swapping");
            e_min.classList.add("swapping");
            await sleep(100);
            e1.classList.remove("swapping");
            e_min.classList.remove("swapping");
        } else {
            e1.classList.remove("comparing");
        }
    }
    document.getElementById('elem0').classList.add("sorted");
}

async function mergeSort(arr) {
    async function merge(left, mid, right) {
        let n1 = mid - left + 1;
        let n2 = right - mid;

        let L = new Array(n1);
        let R = new Array(n2);

        for (let i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (let j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        let i = 0, j = 0, k = left;

        while (i < n1 && j < n2 && sorting) {
            let e1 = document.getElementById('elem' + (left + i));
            let e2 = document.getElementById('elem' + (mid + 1 + j));
            e1.classList.add("comparing");
            e2.classList.add("comparing");
            await sleep(100);

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                let ev1 = document.getElementById('elem' + k);
                let v1 = ev1.querySelector('div:not(.bar)');
                v1.textContent = L[i];
                i++;
            } else {
                arr[k] = R[j];
                let ev1 = document.getElementById('elem' + k);
                let v1 = ev1.querySelector('div:not(.bar)');
                v1.textContent = R[j];
                j++;
            }
            e1.classList.remove("comparing");
            e2.classList.remove("comparing");
            k++;
            swapColorHeight(left, right);
            await sleep(100);
        }

        while (i < n1 && sorting) {
            arr[k] = L[i];
            let ev1 = document.getElementById('elem' + k);
            let v1 = ev1.querySelector('div:not(.bar)');
            v1.textContent = L[i];
            i++;
            k++;
            swapColorHeight(left, right);
            await sleep(100);
        }

        while (j < n2 && sorting) {
            arr[k] = R[j];
            let ev1 = document.getElementById('elem' + k);
            let v1 = ev1.querySelector('div:not(.bar)');
            v1.textContent = R[j];
            j++;
            k++;
            swapColorHeight(left, right);
            await sleep(100);
        }
    }

    async function mergeSortHelper(l, r) {
        if (l < r && sorting) {
            let m = l + Math.floor((r - l) / 2);

            await mergeSortHelper(l, m);
            await mergeSortHelper(m + 1, r);
            await merge(l, m, r);
        }
    }
    await mergeSortHelper(0, arr.length - 1);
    for (let i = 0; i < arr.length; i++) {
        document.getElementById('elem' + i).classList.add("sorted");
    }
}

async function quickSort(arr) {
    async function partition(low, high) {
        let pivot = arr[high];
        let i = (low - 1);

        for (let j = low; j <= high - 1 && sorting; j++) {
            let e1 = document.getElementById('elem' + j);
            let e2 = document.getElementById('elem' + high);
            e1.classList.add("comparing");
            e2.classList.add("comparing");
            await sleep(100);
            if (arr[j] < pivot) {
                i++;
                [arr[i], arr[j]] = [arr[j], arr[i]];

                let v1 = document.getElementById('elem' + i).querySelector('div:not(.bar)');
                let v2 = document.getElementById('elem' + j).querySelector('div:not(.bar)');
                let tempValue = v1.textContent;
                v1.textContent = v2.textContent;
                v2.textContent = tempValue;
                swapColorHeight(i, j);
                sound.play();
                await sleep(300);

                e1.classList.remove("comparing");
                e2.classList.remove("comparing");
                e1.classList.add("swapping");
                e2.classList.add("swapping");
                await sleep(100);
                e1.classList.remove("swapping");
                e2.classList.remove("swapping");
            } else {
                e1.classList.remove("comparing");
                e2.classList.remove("comparing");
            }
        }
        [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];

        let v1 = document.getElementById('elem' + (i + 1)).querySelector('div:not(.bar)');
        let v2 = document.getElementById('elem' + high).querySelector('div:not(.bar)');
        let tempValue = v1.textContent;
        v1.textContent = v2.textContent;
        v2.textContent = tempValue;
        swapColorHeight(i + 1, high);
        sound.play();
        await sleep(300);

        return (i + 1);
    }

    async function quickSortHelper(low, high) {
        if (low < high && sorting) {
            let pi = await partition(low, high);

            await quickSortHelper(low, pi - 1);
            await quickSortHelper(pi + 1, high);
        }
    }

    await quickSortHelper(0, arr.length - 1);
    for (let i = 0; i < arr.length; i++) {
        document.getElementById('elem' + i).classList.add("sorted");
    }
}

async function insertionSort(arr) {
    let n = arr.length;
    for (let i = 1; i < n && sorting; i++) {
        let key = arr[i];
        let j = i - 1;
        let e1 = document.getElementById('elem' + i);
        e1.classList.add("comparing");

        while (j >= 0 && arr[j] > key && sorting) {
            let e2 = document.getElementById('elem' + j);
            e2.classList.add("comparing");
            await sleep(100);

            arr[j + 1] = arr[j];
            let v1 = document.getElementById('elem' + (j + 1)).querySelector('div:not(.bar)');
            let v2 = document.getElementById('elem' + j).querySelector('div:not(.bar)');
            let tempValue = v1.textContent;
            v1.textContent = v2.textContent;
            v2.textContent = tempValue;

            swapColorHeight(j + 1, j);
            sound.play();
            await sleep(300);

            e2.classList.remove("comparing");
            j = j - 1;
        }
        arr[j + 1] = key;
        let ev1 = document.getElementById('elem' + (j + 1));
        let v1 = ev1.querySelector('div:not(.bar)');
        v1.textContent = key;
        e1.classList.remove("comparing");
    }
    for (let i = 0; i < arr.length; i++) {
        document.getElementById('elem' + i).classList.add("sorted");
    }
}


function swapColorHeight(j, k = null) {
    let e1 = document.getElementById('elem' + j);
    let h1 = e1.querySelector('.bar').clientHeight;
    if (k != null) {
        let e2 = document.getElementById('elem' + k);
        let h2 = e2.querySelector('.bar').clientHeight;
        e1.querySelector('.bar').style.height = h2 + "px";
        e2.querySelector('.bar').style.height = h1 + "px";
    } else {
        let ev1 = document.getElementById('elem' + j);
        ev1.querySelector('.bar').style.height = h1 + "px";
    }
}

createBars();
stopBtn.disabled = true;