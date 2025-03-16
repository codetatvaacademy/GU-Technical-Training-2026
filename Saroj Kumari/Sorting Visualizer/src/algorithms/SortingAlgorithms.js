export function bubbleSort(array) {
    let animations = [];
    for (let i = 0; i < array.length - 1; i++) {
      for (let j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          [array[j], array[j + 1]] = [array[j + 1], array[j]];
          animations.push([...array]);
        }
      }
    }
    return animations;
  }
  
  export function selectionSort(array) {
    let animations = [];
    for (let i = 0; i < array.length - 1; i++) {
      let minIdx = i;
      for (let j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIdx]) minIdx = j;
      }
      [array[i], array[minIdx]] = [array[minIdx], array[i]];
      animations.push([...array]);
    }
    return animations;
  }
  
  export function insertionSort(array) {
    let animations = [];
    for (let i = 1; i < array.length; i++) {
      let key = array[i], j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = key;
      animations.push([...array]);
    }
    return animations;
  }
  export function mergeSort(array) {
    let animations = [];
    if (array.length <= 1) return array; 
    
    let auxiliaryArray = [...array];
    mergeSortHelper(array, 0, array.length - 1, auxiliaryArray, animations);
    
    return animations;
  }
  
  function mergeSortHelper(mainArray, left, right, auxiliaryArray, animations) {
    if (left === right) return;
    let mid = Math.floor((left + right) / 2);
  
    mergeSortHelper(auxiliaryArray, left, mid, mainArray, animations);
    mergeSortHelper(auxiliaryArray, mid + 1, right, mainArray, animations);
  
    merge(mainArray, left, mid, right, auxiliaryArray, animations);
  }
  
  function merge(mainArray, left, mid, right, auxiliaryArray, animations) {
    let i = left, j = mid + 1, k = left;
  
    while (i <= mid && j <= right) {
      // Push the comparison between the two elements
      animations.push([i, j]);
      if (auxiliaryArray[i] <= auxiliaryArray[j]) {
        // Push the overwrite operation
        animations.push([k, auxiliaryArray[i]]);
        mainArray[k++] = auxiliaryArray[i++];
      } else {
        animations.push([k, auxiliaryArray[j]]);
        mainArray[k++] = auxiliaryArray[j++];
      }
    }
  
    while (i <= mid) {
      animations.push([i, i]);
      animations.push([k, auxiliaryArray[i]]);
      mainArray[k++] = auxiliaryArray[i++];
    }
  
    while (j <= right) {
      animations.push([j, j]);
      animations.push([k, auxiliaryArray[j]]);
      mainArray[k++] = auxiliaryArray[j++];
    }
  }
    
  
  export function quickSort(array) {
    let animations = [];
    quickSortHelper(array, 0, array.length - 1, animations);
    return animations;
  }
  
  function quickSortHelper(array, low, high, animations) {
    if (low < high) {
      let pivotIndex = partition(array, low, high, animations);
      quickSortHelper(array, low, pivotIndex - 1, animations);
      quickSortHelper(array, pivotIndex + 1, high, animations);
    }
  }
  
  function partition(array, low, high, animations) {
    let pivot = array[high];
    let i = low - 1;
  
    for (let j = low; j < high; j++) {
      if (array[j] < pivot) {
        i++;
        [array[i], array[j]] = [array[j], array[i]];
        animations.push([...array]); 
      }
    }
    [array[i + 1], array[high]] = [array[high], array[i + 1]];
    animations.push([...array]); 
    return i + 1;
  }
    