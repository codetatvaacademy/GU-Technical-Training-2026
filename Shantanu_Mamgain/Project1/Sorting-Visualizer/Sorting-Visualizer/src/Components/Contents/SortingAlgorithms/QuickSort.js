
export const quickSort = async (arr, setArray, updateGraph, changeColor) => {
    const sort = async (arr, low, high) => {
      if (low < high) {
        const pi = await partition(arr, low, high);
        await sort(arr, low, pi - 1);
        await sort(arr, pi + 1, high);
      }
      updateGraph(arr);
      changeColor(low, high);
      await new Promise((resolve) => setTimeout(resolve, 1200));
    };
  
    const partition = async (arr, low, high) => {
      const pivot = arr[high];
      let i = low - 1;
      for (let j = low; j < high; j++) {
        updateGraph(arr);
        changeColor(i, j);
        await new Promise((resolve) => setTimeout(resolve, 1200));
        if (arr[j] < pivot) {
          i++;
          [arr[i], arr[j]] = [arr[j], arr[i]];
          updateGraph(arr);
          changeColor(i, j);
          await new Promise((resolve) => setTimeout(resolve, 1200));
        }
      }
      [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
      updateGraph(arr);
      changeColor(i + 1, high);
      await new Promise((resolve) => setTimeout(resolve, 1200));
      return i + 1;
    };
  
    const arrCopy = [...arr];
    await sort(arrCopy, 0, arrCopy.length - 1);
    setArray(arrCopy);
  };
  

