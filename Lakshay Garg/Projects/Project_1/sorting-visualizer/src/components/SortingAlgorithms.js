function runAnimations(animations, updateGraph) {
    let i = 0;
    function step() {
        if (i < animations.length) {
            const { array, swapIndices } = animations[i]; 
            updateGraph(array, swapIndices);
            i++;
            setTimeout(step, 500); 
        }
    }
    step();
}

// Bubble Sort
export function BubbleSort(arr, updateGraph) {
    let len = arr.length;
    let animations = [];

    for (let i = 0; i < len - 1; i++) {
        for (let j = 0; j < len - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                animations.push({ array: [...arr], swapIndices: [j, j + 1] });
            }
        }
    }
    runAnimations(animations, updateGraph);
}

// Selection Sort
export function SelectionSort(arr, updateGraph) {
    let len = arr.length;
    let animations = [];
    for (let i = 0; i < len; i++) {
        let minIndex = i;
        for (let j = i + 1; j < len; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex !== i) {
            [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
            animations.push({ array: [...arr], swapIndices: [i, minIndex] });
        }
    }

    runAnimations(animations, updateGraph);
}

// Insertion Sort
export function InsertionSort(arr, updateGraph) {
    let len = arr.length;
    let animations = [];
    for (let i = 1; i < len; i++) {
        let key = arr[i];
        let j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            animations.push({ array: [...arr], swapIndices: [j, j + 1] }); 
            j--;
        }
        arr[j + 1] = key;
        animations.push({ array: [...arr], swapIndices: [j + 1, i] });
    }
    runAnimations(animations, updateGraph);
}

// Merge Sort 
export function MergeSort(arr, updateGraph) {
    let animations = [];
    function merge(arr, l, m, r) {
        let left = arr.slice(l, m + 1);
        let right = arr.slice(m + 1, r + 1);
        let i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                animations.push({ array: [...arr], swapIndices: [k, l + i] }); 
                i++;
            } else {
                arr[k] = right[j];
                animations.push({ array: [...arr], swapIndices: [k, m + 1 + j] }); 
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            animations.push({ array: [...arr], swapIndices: [k, l + i] });
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            animations.push({ array: [...arr], swapIndices: [k, m + 1 + j] });
            j++;
            k++;
        }
    }

    function mergeSortHelper(arr, l, r) {
        if (l >= r) return;
        let m = Math.floor((l + r) / 2);
        mergeSortHelper(arr, l, m);
        mergeSortHelper(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    mergeSortHelper(arr, 0, arr.length - 1);
    runAnimations(animations, updateGraph);
}

// Quick Sort
export function QuickSort(arr, updateGraph) {
    let animations = [];

    function partition(low, high) {
        let pivot = arr[high];
        let i = low - 1;
        for (let j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                [arr[i], arr[j]] = [arr[j], arr[i]];
                animations.push({ array: [...arr], swapIndices: [i, j] });
            }
        }
        [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
        animations.push({ array: [...arr], swapIndices: [i + 1, high] });
        return i + 1;
    }

    function quickSortHelper(low, high) {
        if (low < high) {
            let pi = partition(low, high);
            quickSortHelper(low, pi - 1);
            quickSortHelper(pi + 1, high);
        }
    }

    quickSortHelper(0, arr.length - 1);
    runAnimations(animations, updateGraph);
}