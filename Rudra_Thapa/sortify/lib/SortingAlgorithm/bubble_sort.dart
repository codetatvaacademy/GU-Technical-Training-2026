import 'dart:async';

class BubbleSort {
  static Future<void> sort(
      List<int> array,
      Function(List<int>, Set<int>, {bool isSorted}) updateGraph) async {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // Swap elements
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;

          // Optimize UI update to avoid too many `setState()` calls
          updateGraph(List.from(array), {j, j + 1});
          await Future.delayed(const Duration(milliseconds: 600));
        }
      }
    }

    // Mark all elements as sorted
    updateGraph(List.from(array), {}, isSorted: true);
  }
}
