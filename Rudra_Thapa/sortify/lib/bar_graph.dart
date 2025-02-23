import 'package:flutter/material.dart';
import 'individual_bar.dart';

class BarGraph extends StatelessWidget {
  final List<int> data;
  final Set<int> highlightedIndexes;
  final Set<int> sortedIndexes;

  const BarGraph({super.key, required this.data, required this.highlightedIndexes, required this.sortedIndexes});

  @override
  Widget build(BuildContext context) {
    double maxHeight = 300; // Fixed graph height

    return SizedBox(
      height: maxHeight + 40, // Extra space for labels
      child: Row(
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.end, // Align bars to bottom
        children: List.generate(
          data.length,
              (index) => Padding(
            padding: const EdgeInsets.symmetric(horizontal: 5),
            child: IndividualBar(
              height: (data[index] / data.reduce((a, b) => a > b ? a : b)) * maxHeight,
              color: sortedIndexes.contains(index)
                  ? Colors.green // Mark sorted bars as green
                  : highlightedIndexes.contains(index)
                  ? Colors.red // Highlight bars being swapped
                  : Colors.blue, // Default bar color
              value: data[index], // Display value at the base
            ),
          ),
        ),
      ),
    );
  }
}
