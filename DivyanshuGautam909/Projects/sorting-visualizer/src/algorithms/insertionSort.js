export function insertionSort(array) {
    const animations = [];
    let arr = [...array];

    for (let i = 1; i < arr.length; i++) {
        let key = arr[i];
        let j = i - 1;

        animations.push([i, null, "pivot"]); // Highlight key element (Red)

        while (j >= 0 && arr[j] > key) {
            animations.push([j, j + 1, "compare"]); // Compare elements
            animations.push([j + 1, arr[j], "overwrite"]); // Move elements right
            arr[j + 1] = arr[j];
            j--;
        }

        animations.push([j + 1, key, "overwrite"]); // Insert key at correct position
        arr[j + 1] = key;
    }

    return animations;
}
