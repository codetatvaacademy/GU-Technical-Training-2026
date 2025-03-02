

export function bubbleSort(arr) {
    const animations = [];
    let n = arr.length;
    let swapped;
    do {
      swapped = false;
      for (let i = 0; i < n - 1; i++) {
        animations.push({ type: 'compare', idxA: i, idxB: i + 1 });
        if (arr[i] > arr[i + 1]) {
          animations.push({ type: 'swap', idxA: i, idxB: i + 1 });
          [arr[i], arr[i + 1]] = [arr[i + 1], arr[i]];
          swapped = true;
        }
      }
      n--;
    } while (swapped);
    return animations;
  }
  
  export function selectionSort(arr) {
    const animations = [];
    for (let i = 0; i < arr.length - 1; i++) {
      let minIndex = i;
      for (let j = i + 1; j < arr.length; j++) {
        animations.push({ type: 'compare', idxA: j, idxB: minIndex });
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      if (minIndex !== i) {
        animations.push({ type: 'swap', idxA: i, idxB: minIndex });
        [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
      }
    }
    return animations;
  }
  
  export function insertionSort(arr) {
    const animations = [];
    for (let i = 1; i < arr.length; i++) {
      let j = i;
      while (j > 0) {
        animations.push({ type: 'compare', idxA: j, idxB: j - 1 });
        if (arr[j] < arr[j - 1]) {
          animations.push({ type: 'swap', idxA: j, idxB: j - 1 });
          [arr[j], arr[j - 1]] = [arr[j - 1], arr[j]];
        } else {
          break;
        }
        j--;
      }
    }
    return animations;
  }
  