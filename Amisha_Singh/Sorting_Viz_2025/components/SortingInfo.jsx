const Sortinginfo = ({ algorithm }) => {

    const algorithms = {
        "Bubble Sort": {
            description:
                "Bubble Sort repeatedly swaps adjacent elements if they are in the wrong order.",

            code: `function bubbleSort(arr) {
  let n = arr.length;
  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
      }
    }
  }
  return arr;
}`,
            complexity: `O(n^2) on average, and O(n) in best case. It has a space complexity of O(1).
            
            Explanation

            Time complexity

Worst case: The worst case occurs when the array is in reverse order,
This requires n-1 passes and n-1 comparisons in each pass, 
resulting in a total of (n-1)2 comparisons. 

Best case: The best case occurs ,
when the array is already sorted or contains only one element,
This requires only n-1 comparisons and no swaps. 

Average case: The average case complexity is O(n^2),
This is because, in the average case,
bubble sort has to perform n^2/2 comparisons and
n^2/2 swaps to sort a list of n elements. 

Space complexity

Bubble sort is memory-efficient with a space complexity of O(1),

This makes it suitable for limited memory environments. `
        },
        "Quick Sort": {
            description:
                "Quick Sort selects a pivot and partitions the array around it.",

            code: `function quickSort(arr) {
  if (arr.length <= 1) return arr;
  const pivot = arr[arr.length - 1];
  const left = arr.filter((el) => el < pivot);
  const right = arr.filter((el) => el > pivot);
  return [...quickSort(left), pivot, ...quickSort(right)];
}`,
            complexity: `O(n log n) on average and O(n^2) in the worst case,
            
            Explanation

            Best case: This happens when the pivot is always close to the middle of the array. 

            Worst case: This happens when the pivot selection consistently results in unbalanced partitions. 

            Advantages 

            Quick sort is generally faster than merge sort and heapsort for randomized data.

            It's efficient and requires minimal additional memory.

            Disadvantages 

            It's less stable than other sorting algorithms.

            It has poor worst-case performance when poorly chosen pivots.
            `
        },
    };

    const algo = algorithms[algorithm] || algorithms["Bubble Sort"];
    return (
        <div className="p-4 flex flex-col h-full my-2 mx-6 justify-items-center rounded-lg ">
            <h2 className="text-xl text-center font-bold">{algorithm}</h2>
            <p className="text-base my-4">{algo.description}</p>
            <pre className="bg-gray-200 text-black p-2 rounded-lg m-auto">
                <code>{algo.code}</code>
            </pre>
            <p className="text-base whitespace-pre-line text-justify my-2 ">{algo.complexity}</p>
        </div>
    );
};
export default Sortinginfo;