

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
  
  export function mergeSort(arr) {
    const animations = [];
    function recursiveMergeSort(left, right) {
      if (left >= right) return;
      const mid = Math.floor((left + right) / 2);
      recursiveMergeSort(left, mid);
      recursiveMergeSort(mid + 1, right);
      merge(left, mid, right);
    }
  
    function merge(left, mid, right) {
      let temp = [];
      let i = left, j = mid + 1;
      while (i <= mid && j <= right) {
        animations.push({ type: 'compare', idxA: i, idxB: j });
        if (arr[i] <= arr[j]) {
          temp.push(arr[i]);
          i++;
        } else {
          temp.push(arr[j]);
          j++;
        }
      }
      while (i <= mid) temp.push(arr[i++]);
      while (j <= right) temp.push(arr[j++]);
  
      for (let k = 0; k < temp.length; k++) {
        animations.push({ type: 'overwrite', idxA: left + k, value: temp[k] });
        arr[left + k] = temp[k];
      }
    }
  
    recursiveMergeSort(0, arr.length - 1);
    return animations;
  }

  export function quickSort(arr) {
    const animations = [];
    function recursiveQuickSort(start, end) {
      if (start >= end) return;
      let pivotIndex = partition(arr, start, end, animations);
      recursiveQuickSort(start, pivotIndex - 1);
      recursiveQuickSort(pivotIndex + 1, end);
    }
  
    function partition(arr, start, end, animations) {
      let pivot = arr[end];
      let i = start - 1;
      for (let j = start; j < end; j++) {
        animations.push({ type: 'compare', idxA: j, idxB: end });
        if (arr[j] < pivot) {
          i++;
          animations.push({ type: 'swap', idxA: i, idxB: j });
          [arr[i], arr[j]] = [arr[j], arr[i]];
        }
      }
      animations.push({ type: 'swap', idxA: i + 1, idxB: end });
      [arr[i + 1], arr[end]] = [arr[end], arr[i + 1]];
      return i + 1;
    }
  
    recursiveQuickSort(0, arr.length - 1);
    return animations;
  }