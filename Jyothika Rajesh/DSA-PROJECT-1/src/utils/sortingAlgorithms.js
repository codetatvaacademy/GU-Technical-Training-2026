const delay = (ms) => new Promise((resolve) => setTimeout(resolve, ms));

const swap = (array, i, j) => {
  let temp = array[i];
  array[i] = array[j];
  array[j] = temp;
};

const sortingAlgorithms = {
  bubble: async (array, setArray, speed, isPaused, shouldReset) => {
    let arr = [...array];
    let n = arr.length;
    
    for (let i = 0; i < n - 1; i++) {
      for (let j = 0; j < n - i - 1; j++) {
        
        if (shouldReset.current) return;  
        while (isPaused.current) await delay(100); 

        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          setArray([...arr]);
          await delay(1000 - speed);  // ✅ FIXED SPEED
        }
      }
    }
  },

  selection: async (array, setArray, speed, isPaused, shouldReset) => {
    let arr = [...array];
    let n = arr.length;
    
    for (let i = 0; i < n - 1; i++) {
      let minIndex = i;
      
      for (let j = i + 1; j < n; j++) {
        if (shouldReset.current) return;
        while (isPaused.current) await delay(100);

        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      
      if (minIndex !== i) {
        swap(arr, i, minIndex);
        setArray([...arr]);
        await delay(1000 - speed);
      }
    }
  },

  insertion: async (array, setArray, speed, isPaused, shouldReset) => {
    let arr = [...array];
    let n = arr.length;
    
    for (let i = 1; i < n; i++) {
      let key = arr[i];
      let j = i - 1;
      
      while (j >= 0 && arr[j] > key) {
        if (shouldReset.current) return;
        while (isPaused.current) await delay(100);

        arr[j + 1] = arr[j];
        j--;
        setArray([...arr]);
        await delay(1000 - speed);
      }
      
      arr[j + 1] = key;
      setArray([...arr]);
      await delay(1000 - speed);
    }
  },

  merge: async (array, setArray, speed, isPaused, shouldReset) => {
    async function mergeSort(arr, l, r) {
      if (l < r) {
        let m = Math.floor((l + r) / 2);
        await mergeSort(arr, l, m);
        await mergeSort(arr, m + 1, r);
        await merge(arr, l, m, r);
      }
    }

    async function merge(arr, l, m, r) {
      let left = arr.slice(l, m + 1);
      let right = arr.slice(m + 1, r + 1);
      let i = 0, j = 0, k = l;

      while (i < left.length && j < right.length) {
        if (shouldReset.current) return;
        while (isPaused.current) await delay(100);

        if (left[i] <= right[j]) {
          arr[k++] = left[i++];
        } else {
          arr[k++] = right[j++];
        }
        setArray([...arr]);
        await delay(1000 - speed);
      }
    }

    let arr = [...array];
    await mergeSort(arr, 0, arr.length - 1);
  },

  quick: async (array, setArray, speed, isPaused, shouldReset) => {
    async function quickSort(arr, low, high) {
      if (low < high) {
        let pi = await partition(arr, low, high);
        await quickSort(arr, low, pi - 1);
        await quickSort(arr, pi + 1, high);
      }
    }

    async function partition(arr, low, high) {
      let pivot = arr[high];
      let i = low - 1;

      for (let j = low; j < high; j++) {
        if (shouldReset.current) return;
        while (isPaused.current) await delay(100);

        if (arr[j] < pivot) {
          i++;
          swap(arr, i, j);
          setArray([...arr]);
          await delay(1000 - speed);
        }
      }
      swap(arr, i + 1, high);
      setArray([...arr]);
      await delay(1000 - speed);
      return i + 1;
    }

    let arr = [...array];
    await quickSort(arr, 0, arr.length - 1);
  },
};

export default sortingAlgorithms;
