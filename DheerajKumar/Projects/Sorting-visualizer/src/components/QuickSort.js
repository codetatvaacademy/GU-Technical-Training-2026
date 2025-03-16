


export default function QuickSort(arr, updateGraph) {
    let newSortState = [...arr];

    function partition(low, high, callback) {
        let pivot = newSortState[high];
        let i = low - 1;

        for (let j = low; j < high; j++) {
            callback([...newSortState], [j, high]);

            if (newSortState[j] < pivot) {
                i++;
                [newSortState[i], newSortState[j]] = [newSortState[j], newSortState[i]];
                callback([...newSortState], [i, j]); 
            }
        }

        [newSortState[i + 1], newSortState[high]] = [newSortState[high], newSortState[i + 1]];
        callback([...newSortState], [i + 1, high]); 
        return i + 1;
    }

    function quickSortHelper(low, high) {
        if (low < high) {
            let pivotIndex = partition(low, high, updateGraph);

            setTimeout(() => quickSortHelper(low, pivotIndex - 1), 1000);
            setTimeout(() => quickSortHelper(pivotIndex + 1, high), 1000);
        }
    }

    quickSortHelper(0, newSortState.length - 1);
}
