//default array size
 let n=22;
const array = [];
const container = document.getElementById("container");
//default speed
let speed=50;
let paused=false;
init();
document.addEventListener("DOMContentLoaded", () => {
    const themeToggle = document.getElementById("theme-toggle");
    const body = document.body;
    if (localStorage.getItem("theme") === "light") {
        body.classList.remove("bg-gray-900", "text-white");
        body.classList.add("bg-white", "text-black");
    }
    themeToggle.addEventListener("click", () => {
        if (body.classList.contains("bg-gray-900")) {
            body.classList.remove("bg-gray-900", "text-white");
            body.classList.add("bg-white", "text-black");
            localStorage.setItem("theme", "light");
        } else {
            
            body.classList.remove("bg-white", "text-black");
            body.classList.add("bg-gray-900", "text-white");
            localStorage.setItem("theme", "dark");
        }
    });
});
//sound
let audioCtx = null;

function playNote(freq) {
    if (!audioCtx) {
        audioCtx = new (window.AudioContext || window.webkitAudioContext)();
    }
    const dur = 0.1;
    const osc = audioCtx.createOscillator();
    osc.frequency.value = freq;
    osc.start();
    osc.stop(audioCtx.currentTime + dur);
    const node = audioCtx.createGain();
    node.gain.value = 0.1;
    node.gain.linearRampToValueAtTime(0, audioCtx.currentTime + dur);
    osc.connect(node);
    node.connect(audioCtx.destination);
}
function init() {
    array.length=0;
    for (let i = 0; i < n; i++) {
        array[i] = Math.floor(Math.random() * 100) + 10; 
    }
    showBars();
}
//sorting start
function sortArray() {
    const algorithm = document.getElementById("algorithm-select").value;
    play(algorithm);
}

function play(algorithm) {
    paused=false;
    const copy = [...array];
    let moves=[];
    if (algorithm === "bubble") {
        moves = bubbleSort(copy);
    } else if (algorithm === "selection") {
        moves = selectionSort(copy);
    } else if (algorithm === "insertion") {
        moves = insertionSort(copy);
    } else if (algorithm === "merge") {
        moves = mergeSort(copy);
    } else if (algorithm === "quick") {
        moves = quickSort(copy, 0, copy.length - 1);
    }
    Animate(moves);
}
function pause(){
    paused=true;
}
function reset(){
    paused=true;
    init();
    showBars();
}

function Animate(moves) {
    if (paused||moves.length === 0) {
        showBars();
        return;
    }

    const move = moves.shift();
    const [i, j] = move.indices||[];

    if (move.type === "swap") {
        [array[i], array[j]] = [array[j], array[i]];
    }
    else if(move.type==="overwrite"){
        array[i]=move.value;
    }
    playNote(200+array[i]*500);
    if(j!==undefined){
    playNote(200+array[j]*500);
    
    }
    
    showBars(move);
    setTimeout(() => Animate(moves), 50);
}

function bubbleSort(arr) {
    const moves = [];
    let n = arr.length;
    
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            moves.push({ indices: [j, j + 1], type: "comp" });

            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                moves.push({ indices: [j, j + 1], type: "swap" });
            }
        }
    }
    return moves;
}

function selectionSort(arr) {
    const moves = [];
    for (let i = 0; i < arr.length; i++) {
        let minIndex = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex !== i) {
            [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
            moves.push({ indices: [i, minIndex], type: "swap" });
        }
    }
    return moves;
}
function insertionSort(arr) {
    const moves = [];
    let n = arr.length;

    for (let i = 1; i < n; i++) {
        let key = arr[i];
        let j = i - 1;

        while (j >= 0 && arr[j] > key) {
            moves.push({ indices: [j, j + 1], type: "comp" });
            arr[j + 1] = arr[j];
            moves.push({ indices: [j, j + 1], type: "swap" });
            j--;
        }
        arr[j + 1] = key;
    }
    return moves;
}

function mergeSort(arr) {
    const moves = [];

    function merge(left, mid, right) {
        let leftArr = arr.slice(left, mid + 1);
        let rightArr = arr.slice(mid + 1, right + 1);

        let i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {
            moves.push({ indices: [left + i, mid + 1 + j], type: "compare" });

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                moves.push({ indices: [k], type: "overwrite", value: leftArr[i] });
                i++;
            } else {
                arr[k] = rightArr[j];
                moves.push({ indices: [k], type: "overwrite", value: rightArr[j] });
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            moves.push({ indices: [k], type: "overwrite", value: leftArr[i] });
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            moves.push({ indices: [k], type: "overwrite", value: rightArr[j] });
            j++;
            k++;
        }
    }

    function mergeSortHelper(left, right) {
        if (left < right) {
            const mid = Math.floor((left + right) / 2);

            mergeSortHelper(left, mid);
            mergeSortHelper(mid + 1, right);
            merge(left, mid, right);
        }
    }

    mergeSortHelper(0, arr.length - 1);
    return moves;
}
// Quick Sort
function quickSort(arr, low, high) {
    const moves = [];
    if (low < high) {
        const pivot = arr[high];
        let i = low - 1;
        for (let j = low; j < high; j++) {
            moves.push({ indices: [j, high], type: "comp" });
            if (arr[j] < pivot) {
                i++;
                [arr[i], arr[j]] = [arr[j], arr[i]];
                moves.push({ indices: [i, j], type: "swap" });
            }
        }
        [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
        moves.push({ indices: [i + 1, high], type: "swap" });

        quickSort(arr, low, i);
        quickSort(arr, i + 2, high);
    }
    return moves;
}


function showBars(move) {
    container.innerHTML = "";
    for (let i = 0; i < array.length; i++) {
        const bar = document.createElement("div");
        bar.style.height = array[i] + "px";
        bar.classList.add("bg-blue-500", "flex-1", "min-w-[5px]", "mx-0.5");

        if (move && move.indices && move.indices.includes(i)) {
            bar.classList.replace("bg-blue-500", move.type === "swap" ? "bg-green-500" : "bg-red-500");
        }

        container.appendChild(bar);
    }
}
//control for array size and speed:
document.getElementById("arraySize").addEventListener("input", function () {
    n = parseInt(this.value);
    init();
});
document.getElementById("speed").addEventListener("input", function () {
    speed = parseInt(this.value);
});