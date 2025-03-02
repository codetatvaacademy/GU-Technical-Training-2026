export const mergeSort = async (arr, setArray, updateGraph, changeColor) => {
  if (arr.length <= 1) return arr;
  const array = [...arr];
  const mid = Math.floor(arr.length / 2);
  updateGraph(array);
  changeColor(0, mid);
  await new Promise((resolve) => setTimeout(resolve, 1200));

  const left = await mergeSort(
    array.slice(0, mid),
    setArray,
    updateGraph,
    changeColor
  );
  updateGraph(left);
  changeColor(0, mid);
  await new Promise((resolve) => setTimeout(resolve, 1200));

  const right = await mergeSort(
    array.slice(mid),
    setArray,
    updateGraph,
    changeColor
  );
  updateGraph(right);
  changeColor(mid, array.length - 1);
  await new Promise((resolve) => setTimeout(resolve, 1200));

  const mergedArray = await merge(left, right, setArray, updateGraph, changeColor);
  updateGraph(mergedArray);
  setArray(mergedArray);
  changeColor(0, mergedArray.length - 1);
  await new Promise((resolve) => setTimeout(resolve, 1200));

  return mergedArray;
};

const merge = async (left, right, setArray, updateGraph, changeColor) => {
  let result = [];
  let leftIndex = 0;
  let rightIndex = 0;

  while (leftIndex < left.length && rightIndex < right.length) {
    if (left[leftIndex] < right[rightIndex]) {
      result.push(left[leftIndex]);
      leftIndex++;
    } else {
      result.push(right[rightIndex]);
      rightIndex++;
    }
    updateGraph(result);
    changeColor(leftIndex, rightIndex);
    await new Promise((resolve) => setTimeout(resolve, 1200));
  }

  const finalArray = [...result, ...left.slice(leftIndex), ...right.slice(rightIndex)];
  updateGraph(finalArray);
  changeColor(leftIndex, rightIndex);
  await new Promise((resolve) => setTimeout(resolve, 1200));

  setArray(finalArray);
  return finalArray;
};
