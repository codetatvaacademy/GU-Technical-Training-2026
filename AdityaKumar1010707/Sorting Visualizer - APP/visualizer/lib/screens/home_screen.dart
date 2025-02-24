
import 'dart:core';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:visualizer/core/array_generator.dart';
import 'package:visualizer/core/bar_visualization.dart';
import 'package:visualizer/screens/bubbleSort.dart';
import 'package:visualizer/screens/quickSort.dart';
import 'package:visualizer/screens/selectionSort.dart';
import 'package:visualizer/widgets/buttons.dart';
import 'package:visualizer/widgets/text.dart';

import 'insertionSort.dart';
import 'mergeSort.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  // Variables
  List<int> numbers = [];
  List<int> bubbleArray= [];
  List<int> insertionArray= [];
  List<int> selectionArray= [];
  List<int> mergeArray= [];
  List<int> countArray= [];
  List<int> quickArray= [];


  late List<Color> barColors;
  late List<Color> barColorsBubble;
  late List<Color> barColorsInsertion;
  late List<Color> barColorsSelection;
  late List<Color> barColorsMerge;
  late List<Color> barColorsCount;
  late List<Color> barColorsQuick;



  late String selectedOption;

  @override
  void initState() {
    super.initState();
    generateArray();
    bubbleArray = numbers;
    insertionArray = numbers;
    insertionArray = numbers;
    selectionArray = numbers;
    mergeArray = numbers;
    countArray = numbers;
    quickArray = numbers;
    barColors = List.generate(numbers.length, (index) => const Color(0xff403d39));
    barColorsBubble = barColors;
    barColorsInsertion = barColors;
    barColorsSelection = barColors;
    barColorsMerge = barColors;
    barColorsCount = barColors;
    barColorsQuick = barColors;
  }

  // For generating a random array
  void generateArray() {
    setState(() {
      numbers = ArrayGenerator.generateRandomArray(10, 50);
      bubbleArray = numbers;
      insertionArray = numbers;
      insertionArray = numbers;
      selectionArray = numbers;
      mergeArray = numbers;
      countArray = numbers;
      quickArray = numbers;
      barColors = List.generate(numbers.length, (index) => const Color(0xff403d39));
      barColorsBubble = barColors;
      barColorsInsertion = barColors;
      barColorsSelection = barColors;
      barColorsMerge = barColors;
      barColorsCount = barColors;
      barColorsQuick = barColors;
    });
  }

  // For shuffling the array
  void shuffle() {
    setState(() {
      numbers = ArrayGenerator.shuffleArray(numbers);
      bubbleArray = numbers;
      insertionArray = numbers;
      insertionArray = numbers;
      selectionArray = numbers;
      mergeArray = numbers;
      countArray = numbers;
      quickArray = numbers;
      barColors = List.generate(numbers.length, (index) => const Color(0xff403d39));
      barColorsBubble = barColors;
      barColorsInsertion = barColors;
      barColorsSelection = barColors;
      barColorsMerge = barColors;
      barColorsCount = barColors;
      barColorsQuick = barColors;
    });
  }

  Future<void> startBubbleSort() async {
    Get.to(()=>const BubbleSortScreen(),transition:Transition.circularReveal,duration: const Duration(milliseconds: 1000) ,arguments: {
      "numbers" : bubbleArray,
      "barColors": barColorsBubble,
    });
  }

  Future<void> startSelectionSort() async {

    Get.to(()=>const SelectionSortScreen(),transition:Transition.circularReveal,duration: const Duration(milliseconds: 300) ,arguments: {
      "numbers" : bubbleArray,
      "barColors": barColorsBubble,
    });
  }

  Future<void> startInsertionSort() async {

    Get.to(()=>const InsertionSortScreen(),transition:Transition.circularReveal,duration: const Duration(milliseconds: 1000) ,arguments: {
      "numbers" : bubbleArray,
      "barColors": barColorsBubble,
    });
  }

  Future<void> startMergeSort() async {

    Get.to(const MergeSortScreen(),transition:Transition.circularReveal,duration: const Duration(milliseconds: 1000) ,arguments: {
      "numbers" : bubbleArray,
      "barColors": barColorsBubble,
    });
  }

  Future<void> startQuickSort() async {

    Get.to(const QuickSortScreen(),transition:Transition.circularReveal,duration: const Duration(milliseconds: 1000) ,arguments: {
      "numbers" : bubbleArray,
      "barColors": barColorsBubble,
    });
  }
  @override
  Widget build(BuildContext context) {
    // Screen size variables
    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;
    Color secondaryColor = Theme.of(context).colorScheme.secondary;
    Color primaryColor = Theme.of(context).colorScheme.primary;
    Color surfaceColor = Theme.of(context).colorScheme.surface;


    // Font variables
    double appBarFontSize = screenHeight * 0.03;



    return Scaffold(
      backgroundColor: surfaceColor,
      body: SingleChildScrollView(
        physics: const BouncingScrollPhysics(),
        child: Center(
          child: Container(
            width: screenWidth*0.95,
            child: Column(
              children: [
                SizedBox(
                  height: screenHeight * 0.035,
                ),
                Padding(
                  padding:  EdgeInsets.symmetric( horizontal:screenWidth*0.05,vertical: screenHeight*0.01),
                  child: Align(
                    alignment: Alignment.center,
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Flexible(
                          child: MText(
                              input: "Sorting Visualizer",
                              fontSize: 0.075,
                              color: secondaryColor),
                        ),
                      ],
                    ),
                  ),
                ),


                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    MElevatedButton("Bubble", Colors.white, primaryColor,
                        startBubbleSort, 0.025),
                    MElevatedButton("Selection", Colors.white, primaryColor,
                        startSelectionSort, 0.025),
                    MElevatedButton("Insertion", Colors.white, primaryColor,
                        startInsertionSort, 0.025),
                  ],
                ),
                SizedBox(
                  height: screenHeight * 0.02,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    MElevatedButton("Quick", Colors.white, primaryColor,
                        startQuickSort, 0.026),

                    MElevatedButton("Merge", Colors.white, primaryColor,
                        startMergeSort, 0.026),
                  ],
                ),
                SizedBox(
                  height: screenHeight * 0.02,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: [
                    MElevatedButton("New Array", Colors.white, const Color(0xFF7209B7),
                        generateArray, 0.027),
                    MElevatedButton("Shuffle", Colors.white, const Color(0xFFfb6f92),
                        shuffle, 0.03),
                  ],
                ),
                SizedBox(
                  height: screenHeight * 0.42,
                  child: Align(
                      alignment: Alignment.bottomCenter,
                      child: BarVisualization(
                          numbers: numbers, barColors: barColors)),
                )
              ],
            ),
          ),
        ),
      ),
    );
  }
}




