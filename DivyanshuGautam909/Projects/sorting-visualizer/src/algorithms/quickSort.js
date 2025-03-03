function partition(arr, low, high, animations) {
    let pivot = arr[high];
    animations.push([high, null, "pivot"]); // Mark pivot

    let i = low - 1;
    for (let j = low; j < high; j++) {
        animations.push([j, high, "compare"]); // Compare with pivot
        if (arr[j] < pivot) {
            i++;
            [arr[i], arr[j]] = [arr[j], arr[i]];
            animations.push([i, arr[i], "overwrite"]);
            animations.push([j, arr[j], "overwrite"]);
        }
    }
    [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
    animations.push([i + 1, arr[i + 1], "overwrite"]);
    animations.push([high, arr[high], "overwrite"]);

    return i + 1;
}

function quickSortHelper(arr, low, high, animations) {
    if (low < high) {
        let pi = partition(arr, low, high, animations);
        quickSortHelper(arr, low, pi - 1, animations);
        quickSortHelper(arr, pi + 1, high, animations);
    }
}

export function quickSort(array) {
    let animations = [];
    let arr = [...array];
    quickSortHelper(arr, 0, arr.length - 1, animations);
    return animations;
}
