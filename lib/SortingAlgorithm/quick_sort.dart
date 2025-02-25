import 'dart:async';

class QuickSort {
  static Future<void> sort(
      List<int> array,
      Function(List<int>, Set<int>, {bool isSorted}) updateGraph) async {
    await _quickSort(array, 0, array.length - 1, updateGraph);
    updateGraph(List.from(array), {}, isSorted: true); // Mark sorted
  }

  static Future<void> _quickSort(
      List<int> array, int low, int high, Function(List<int>, Set<int>, {bool isSorted}) updateGraph) async {
    if (low < high) {
      int pivotIndex = await _partition(array, low, high, updateGraph);
      await _quickSort(array, low, pivotIndex - 1, updateGraph);
      await _quickSort(array, pivotIndex + 1, high, updateGraph);
    }
  }

  static Future<int> _partition(
      List<int> array, int low, int high, Function(List<int>, Set<int>, {bool isSorted}) updateGraph) async {
    int pivot = array[high]; // Choosing last element as pivot
    int i = low - 1; // Pointer for smaller elements

    for (int j = low; j < high; j++) {
      Set<int> highlightedIndexes = {j, high}; // Highlight pivot and current element
      if (array[j] < pivot) {
        i++;
        // Swap array[i] and array[j]
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        updateGraph(List.from(array), highlightedIndexes);
        await Future.delayed(const Duration(milliseconds: 500));
      }
    }

    // Swap pivot into correct position
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    updateGraph(List.from(array), {i + 1, high});
    await Future.delayed(const Duration(milliseconds: 500));

    return i + 1; // Return pivot index
  }
}
