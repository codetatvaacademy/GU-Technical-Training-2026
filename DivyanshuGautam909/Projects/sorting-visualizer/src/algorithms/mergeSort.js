function merge(arr, left, mid, right, animations) {
    let leftArr = arr.slice(left, mid + 1);
    let rightArr = arr.slice(mid + 1, right + 1);
    let i = 0, j = 0, k = left;

    while (i < leftArr.length && j < rightArr.length) {
        animations.push([k, leftArr[i], rightArr[j], "compare"]); // Comparison

        if (leftArr[i] <= rightArr[j]) {
            animations.push([k, leftArr[i], "overwrite"]); // Overwrite value
            arr[k++] = leftArr[i++];
        } else {
            animations.push([k, rightArr[j], "overwrite"]); // Overwrite value
            arr[k++] = rightArr[j++];
        }
    }

    while (i < leftArr.length) {
        animations.push([k, leftArr[i], "overwrite"]);
        arr[k++] = leftArr[i++];
    }

    while (j < rightArr.length) {
        animations.push([k, rightArr[j], "overwrite"]);
        arr[k++] = rightArr[j++];
    }
}

function mergeSortHelper(arr, left, right, animations) {
    if (left < right) {
        let mid = Math.floor((left + right) / 2);
        mergeSortHelper(arr, left, mid, animations);
        mergeSortHelper(arr, mid + 1, right, animations);
        merge(arr, left, mid, right, animations);
    }
}

export function mergeSort(array) {
    let animations = [];
    let arr = [...array];
    mergeSortHelper(arr, 0, arr.length - 1, animations);
    return animations;
}
