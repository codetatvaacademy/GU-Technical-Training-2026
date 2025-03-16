import 'dart:async';

class InsertionSort {
  static Future<void> sort(
      List<int> array,
      Function(List<int>, Set<int>, {bool isSorted}) updateGraph) async {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int key = array[i];
      int j = i - 1;
      Set<int> highlightedIndexes = {i};

      while (j >= 0 && array[j] > key) {
        highlightedIndexes.add(j);
        array[j + 1] = array[j];

        // Update graph for each shift
        updateGraph(List.from(array), highlightedIndexes);
        await Future.delayed(const Duration(milliseconds: 500));

        j = j - 1;
      }
      array[j + 1] = key;

      updateGraph(List.from(array), highlightedIndexes);
      await Future.delayed(const Duration(milliseconds: 500));
    }
    // Mark as sorted
    updateGraph(List.from(array), {}, isSorted: true);
  }
}
