const Compare = {
  LESS_THAN: -1,
  BIGGER_THAN: 1
}

const defaultCompare = (a, b) => {
  if (a === b) {
    return 0
  }
  return a < b ? Compare.LESS_THAN : Compare.BIGGER_THAN
}

let swaps = []

const partition = (array, left, right, compareFn) => {
  const pivot = array[Math.floor((right + left) / 2)]

  let i = left
  let j = right

  while (i <= j) {
    while (compareFn(array[i], pivot) === Compare.LESS_THAN) {
      i++
    } while (compareFn(array[j], pivot) === Compare.BIGGER_THAN) {
      j--
    }
    if (i <= j) {
      let temp = array[i]
      array[i] = array[j]
      array[j] = temp
      swaps.push({ firstPostion: i, lastPosition: j })
      i++
      j--
    }
  }

  return i
}

const quick = (array, left, right, compareFn) => {
  let index

  if (array.length > 1) {
    index = partition(array, left, right, compareFn)
    if (left < index - 1) {
      quick(array, left, index - 1, compareFn)
    }
    if (index < right) {
      quick(array, index, right, compareFn)
    }
  }

  return array
}

class SortingAlgorithms {

  bubbleSort(array) {
    const swaps = []
    for (let i = 0; i < array.length; i++) {

      // Last i elements are already in place
      for (let j = 0; j < array.length - i - 1; j++) {

        // Checking if the item at present iteration is greather than the next iteration
        if (array[j] > array[j + 1]) {
          // If the condition is true, swap them
          let temp = array[j]
          array[j] = array[j + 1]
          array[j + 1] = temp
          swaps.push({ firstPostion: j, lastPosition: j + 1 })
        }

      }

    }

    return swaps
  }

  selectionSort(array) {
    const swaps = []
    let min
    for (let i = 0; i < array.length - 1; i++) {
      min = i
      for (let j = i + 1; j < array.length; j++) {
        if (array[j] < array[min]) {
          min = j
        }
      }
      let temp = array[min]
      array[min] = array[i]
      array[i] = temp
      swaps.push({ firstPostion: min, lastPosition: i })
    }

    return swaps
  }

  quickSort(array, compareFn = defaultCompare) {
    swaps = []
    quick(array, 0, array.length - 1, compareFn)
    return swaps
  }

  insertionSort(array) {
    const swaps = [];
    for (let i = 1; i < array.length; i++) {
      let key = array[i];
      let j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        swaps.push({ firstPosition: j, lastPosition: j + 1 });
        j--;
      }
      array[j + 1] = key;
    }
    return swaps;
  }

  mergeSort(array) {
    swaps = [];
    this.mergeSortHelper(array, 0, array.length - 1);
    return swaps;
  }

  mergeSortHelper(array, left, right) {
    if (left < right) {
      let middle = Math.floor((left + right) / 2);
      this.mergeSortHelper(array, left, middle);
      this.mergeSortHelper(array, middle + 1, right);
      this.merge(array, left, middle, right);
    }
  }

  merge(array, left, middle, right) {
    let leftArray = array.slice(left, middle + 1);
    let rightArray = array.slice(middle + 1, right + 1);
    let i = 0, j = 0, k = left;

    while (i < leftArray.length && j < rightArray.length) {
      if (leftArray[i] <= rightArray[j]) {
        array[k] = leftArray[i];
        i++;
      } else {
        array[k] = rightArray[j];
        swaps.push({ firstPosition: left + i, lastPosition: middle + 1 + j });
        j++;
      }
      k++;
    }

    while (i < leftArray.length) {
      array[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < rightArray.length) {
      array[k] = rightArray[j];
      j++;
      k++;
    }
  }
}


export {
  SortingAlgorithms
}