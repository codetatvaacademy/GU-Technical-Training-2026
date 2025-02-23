export function selectionSort(array) {
    const animations = [];
    let arr = [...array];
    let n = arr.length;

    for (let i = 0; i < n - 1; i++) {
        let minIdx = i;
        animations.push([minIdx, null, "pivot"]); // Mark current min as pivot

        for (let j = i + 1; j < n; j++) {
            animations.push([j, minIdx, "compare"]); // Compare current with min
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
                animations.push([minIdx, null, "pivot"]); // Update pivot
            }
        }

        if (minIdx !== i) {
            [arr[i], arr[minIdx]] = [arr[minIdx], arr[i]];
            animations.push([i, arr[i], "overwrite"]);
            animations.push([minIdx, arr[minIdx], "overwrite"]);
        }
    }
    return animations;
}
