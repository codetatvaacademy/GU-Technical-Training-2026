import 'package:flutter/material.dart';
import 'package:sortify/splash_screen.dart';
import 'SortingAlgorithm/merge_sort.dart';
import 'SortingAlgorithm/selection_sort.dart';
import 'bar_graph.dart';
import 'SortingAlgorithm/bubble_sort.dart';
import 'SortingAlgorithm/insertion_sort.dart';
import 'SortingAlgorithm/quick_sort.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: BarGraphScreen()
    );
  }
}

class BarGraphScreen extends StatefulWidget {
  const BarGraphScreen({super.key});

  @override
  State<BarGraphScreen> createState() => _BarGraphScreenState();
}

class _BarGraphScreenState extends State<BarGraphScreen> {
  List<int> originalData = [5, 15, 10, 25, 20, 12, 8];
  late List<int> data;
  Set<int> highlightedIndexes = {};
  Set<int> sortedIndexes = {};
  bool isSorting = false;
  String selectedAlgorithm = "Bubble Sort"; // Default selection

  @override
  void initState() {
    super.initState();
    data = List.from(originalData);
  }

  void updateGraph(List<int> newData, Set<int> highlights, {bool isSorted = false}) {
    setState(() {
      data = List.from(newData);
      highlightedIndexes = highlights;
      if (isSorted) {
        sortedIndexes = Set.from(Iterable.generate(data.length));
      }
    });
  }

  Future<void> startSorting() async {
    if (isSorting) return;
    setState(() {
      isSorting = true;
      sortedIndexes.clear();
    });

    switch (selectedAlgorithm) {
      case "Bubble Sort":
        await BubbleSort.sort(data, updateGraph);
        break;

      case "Selection Sort":
        await SelectionSort.sort(data, updateGraph);
        break;

      case "Insertion Sort":
        await InsertionSort.sort(data, updateGraph);
        break;

      case "Quick Sort":
        await QuickSort.sort(data, updateGraph);
        break;

      case "Merge Sort":
        await MergeSort.sort(data, updateGraph);
        break;
    }

    setState(() => isSorting = false);
  }

  void resetGraph() {
    setState(() {
      data = List.from(originalData);
      highlightedIndexes.clear();
      sortedIndexes.clear();
      isSorting = false;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Center(
        child: Row(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text("Sort", style: TextStyle(fontSize: 25, color: Colors.blueAccent, fontWeight: FontWeight.bold, ),),
            const Text("ify", style: TextStyle(fontSize: 25, color: Colors.black, fontWeight: FontWeight.bold, ),),
          ],
        ),
      )),
      body: Column(
        children: [
          const SizedBox(height: 20),
          // Dropdown for sorting algorithm selection
          Container(
            padding: EdgeInsets.fromLTRB(20, 5, 20, 3),
            decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(30),
                boxShadow: [
                  BoxShadow(
                    color: Colors.grey.shade500,
                    offset: Offset(4, 4),
                    blurRadius: 15,
                    spreadRadius: 1,
                  ),
                  BoxShadow(
                    color: Colors.white,
                    offset: Offset(-4, -4),
                    blurRadius: 15,
                    spreadRadius: 1,
                  )
                ]
            ),
            child: DropdownButton<String>(
              underline: Container(),
              value: selectedAlgorithm,
              items: ["Bubble Sort", "Insertion Sort", "Selection Sort", "Quick Sort", "Merge Sort"]
                  .map((algo) => DropdownMenuItem(value: algo, child: Text(algo)))
                  .toList(),
              onChanged: (value) {
                setState(() {
                  selectedAlgorithm = value!;
                });
              },
            ),
          ),
          const SizedBox(height: 100),
          BarGraph(data: data, highlightedIndexes: highlightedIndexes, sortedIndexes: sortedIndexes),
          const SizedBox(height: 50),
          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [

              InkWell(
                  onTap: isSorting ? null : startSorting,
                  child: Container(
                    padding: EdgeInsets.all(12),
                    child: const Text("Sort", style: TextStyle(color: Colors.blue, fontSize: 16, fontWeight: FontWeight.bold)),
                    decoration: BoxDecoration(
                        color: Colors.white,
                        borderRadius: BorderRadius.circular(10),
                        boxShadow: [
                          BoxShadow(
                            color: Colors.grey.shade500,
                            offset: Offset(4, 4),
                            blurRadius: 15,
                            spreadRadius: 1,
                          ),
                          BoxShadow(
                            color: Colors.white,
                            offset: Offset(-4, -4),
                            blurRadius: 15,
                            spreadRadius: 1,
                          )
                        ]
                    ),
                  )
              ),

              // ElevatedButton(
              //   onPressed: isSorting ? null : startSorting,
              //   child: const Text("Sort Bars", style: TextStyle(color: Colors.blue)),
              // ),
              const SizedBox(width: 50),

              InkWell(
                  onTap: resetGraph,
                  child: Container(
                    padding: EdgeInsets.all(12),
                    // width: 60,
                    // height: 40,
                    child: Center(child: const Text("Reset", style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold),)),
                    decoration: BoxDecoration(
                        color: Colors.white,
                        borderRadius: BorderRadius.circular(10),
                        boxShadow: [
                          BoxShadow(
                            color: Colors.grey.shade500,
                            offset: Offset(4, 4),
                            blurRadius: 15,
                            spreadRadius: 1,
                          ),
                          BoxShadow(
                            color: Colors.white,
                            offset: Offset(-4, -4),
                            blurRadius: 15,
                            spreadRadius: 1,
                          )
                        ]
                    ),
                  )
              ),

              // ElevatedButton(
              //   onPressed: resetGraph,
              //   child: const Text("Reset", style: TextStyle(color: Colors.black54)),
              // ),
            ],
          ),
          const SizedBox(height: 20),
        ],
      ),
    );
  }
}
