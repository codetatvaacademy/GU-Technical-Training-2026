export function bubbleSort(array) {
    const animations = [];
    let arr = [...array];
    let n = arr.length;

    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            animations.push([j, j + 1, "compare"]); // Compare two elements
            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                animations.push([j, arr[j], "overwrite"]);
                animations.push([j + 1, arr[j + 1], "overwrite"]);
            }
        }
    }
    return animations;
}
