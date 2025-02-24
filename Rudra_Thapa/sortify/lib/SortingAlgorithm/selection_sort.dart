import 'dart:async';

class SelectionSort {
  static Future<void> sort(
      List<int> array,
      Function(List<int>, Set<int>, {bool isSorted}) updateGraph) async {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex=i;
      for (int j = i+1; j < n ; j++) {
        if (array[j] < array[minIndex]) {
          minIndex=j;


        }
      }
      if(minIndex!=i){
        // Swap elements
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;

        // Optimize UI update to avoid too many setState() calls
        updateGraph(List.from(array), {i, minIndex});
        await Future.delayed(const Duration(milliseconds: 600));
      }
    }

    // Mark all elements as sorted
    updateGraph(List.from(array), {}, isSorted: true);
  }
}