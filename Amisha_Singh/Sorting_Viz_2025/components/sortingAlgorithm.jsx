export const BubbleSort = (arr, setswapcount, setcomparisoncount) => {
  let array = [...arr];
  let n = array.length;
  let steps = [];
  let swap = 0, comparisons = 0;

  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      comparisons++;
      steps.push({ array: [...array], activeIndex: [j, j + 1] }); // Before swap

      if (array[j] > array[j + 1]) {
        swap++;
        [array[j], array[j + 1]] = [array[j + 1], array[j]];
        steps.push({ array: [...array], activeIndex: [j, j + 1] }); // After swap
      }
    }
    steps.push({ array: [...array], sorted: [...Array(n - i).keys()] }); // Mark sorted
  }

  steps.push({ array: [...array], activeIndex: [], sorted: [...Array(n).keys()] }); // Fully sorted
  setswapcount(swap);
  setcomparisoncount(comparisons);
  return steps;
};


export const QuickSort = (arr, setswapcount, setcomparisoncount) => {
  let array = [...arr];
  let steps = [];
  let swap = 0, comparisons = 0;
  console.log("Initial Array:", array);

  const quickhelper = (array, low, high) => {
    if (low < high) {
      let pivot = partition(array, low, high);
      steps.push({ array: [...array], activeIndex: [pivot] });

      console.log(`Pivot placed at index ${pivot}:`, array);

      quickhelper(array, low, pivot - 1);
      quickhelper(array, pivot + 1, high);
    }
  };

  const partition = (array, low, high) => {
    let pivot = array[high];
    let i = low - 1;

    console.log(`Partitioning from index ${low} to ${high}, pivot: ${pivot}`);
    for (let j = low; j < high; j++) {
      comparisons++;
      steps.push({ array: [...array], activeIndex: [j, high] });

      if (array[j] < pivot) {
        i++;
        swap++;

        steps.push({ array: [...array], activeIndex: [i, j] });

        console.log(`Swapping ${array[i]} (index ${i}) with ${array[j]} (index ${j})`);

        [array[i], array[j]] = [array[j], array[i]];
        steps.push({ array: [...array], activeIndex: [i, j] });
        console.log("Array after swap:", array);

      }
    }

    swap++;
    [array[i + 1], array[high]] = [array[high], array[i + 1]]
    steps.push({ array: [...array], activeIndex: [i + 1, high] });
    console.log(`Final pivot swap at index ${i + 1}, Array:`, array);

    return i + 1;
  };

  quickhelper(array, 0, array.length - 1);
  console.log("Final Sorted Array:", array);

  steps.push({ array: [...array], sorted: [...Array(array.length).keys()], activeIndex: [] });

  setswapcount(swap);
  setcomparisoncount(comparisons);
  return steps;
};