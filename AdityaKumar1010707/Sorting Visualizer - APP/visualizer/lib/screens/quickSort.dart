import 'dart:async';
import 'dart:core';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:visualizer/widgets/dropDownMenu.dart';
import 'package:visualizer/widgets/text.dart';
import '../core/bar_visualization.dart';
import '../widgets/PageView-Horizontal.dart';


class QuickSortScreen extends StatefulWidget {
  const QuickSortScreen({super.key});

  @override
  State<QuickSortScreen> createState() => _QuickSortState();
}

class _QuickSortState extends State<QuickSortScreen> {

  //====================Variables========================

  bool isPause = false;
  late List<int> numbers;
  late List<Color> barColors;
  late Completer<void> completer;
  late int animationSpeed = 400;
  String dropDownValue = "Normal";
  int time=0;
  Timer? timer ;
  bool isResetClicked = false;
  bool isTimerPaused = true;
  bool isSorted=false;


  late List<int> numbersWorking = List<int>.from(numbers);
  late List<Color> barColorsWorking = List<Color>.from(barColors);


  List<String> Steps = [
    "Choose a pivot element from the array (typically the last, first, or a random element).",
    "Partition the array: place elements smaller than the pivot to its left and elements greater than the pivot to its right.",
    "Recursively apply the same process to the left sub-array (elements before the pivot) and the right sub-array (elements after the pivot).",
    "Continue partitioning until each sub-array has only one element or is empty.",
    "As recursion unwinds, combine the sorted sub-arrays to reconstruct the fully sorted array.",
    "The final reconstructed array is now sorted."
  ];


  //===================Variables End========================

  @override
  void initState() {
    super.initState();
    final Map<String, dynamic>? data = Get.arguments;
    numbers = (data?["numbers"] as List<int>?) ?? [];
    barColors = (data?["barColors"] as List<Color>?) ?? [];


  }


  @override
  Widget build(BuildContext context) {


    // ================ Variables ==========================
    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;
    Color firstColor = const Color(0xFFaffc41);
    Color secondColor = const Color(0xFFaffc41);
    Color secondaryColor = Theme.of(context).colorScheme.secondary;
    Color primaryColor = Theme.of(context).colorScheme.primary;
    Color surfaceColor = Theme.of(context).colorScheme.surface;


    // =============  //////////////  =======================

    // ============= Utilities ===========================
    void repeatAnimations() {

      setState(() {
        isSorted = false;
        isResetClicked = true;
        isPause = false;
        for (int i = 0; i < numbersWorking.length; i++) {
          numbersWorking[i] = numbers[i];
          barColorsWorking[i] = const Color(0xff403d39);
        }

      });
    }

    void dropDownCallback(String selectedValue) {
      setState(() {
        dropDownValue = selectedValue;
        switch(dropDownValue){
          case "Normal":{animationSpeed = 400;break;}
          case "Slow":{animationSpeed = 600;break;}
          case "Fast":{animationSpeed = 300;break;}}
      });
    }

    //=================///////////========================

    // ============ Pause & Timer functionality ============



    void pause() {

      setState(() {

        isPause = !isPause;
        if (!isPause) {
          completer.complete();
        }
      });
    }

    // ============ //////////////////////// ==================


    //============= Sorting Logic =============================


    Future<int> partition(List<int> numbers, List<Color> barColors,int low , int high) async{
      int pivot  = numbers[high];
      int index = low-1;

      for(int j=low;j<high;j++){

        setState(() {
          barColors[j] = firstColor;
          barColors[high] = secondColor;
        });
        if(isPause){
          completer=Completer<void>();
          await completer.future;
        }
        if(numbers[j]<pivot){
          
          await Future.delayed(Duration(milliseconds: animationSpeed));
          setState(() {});
          index++;
          int temp = numbers[index];
          numbers[index] = numbers[j];
          numbers[j] = temp;

        }
        setState(() {
          barColors[j] = const Color(0xff403d39);
          barColors[high] = const Color(0xff403d39);
        });

        if(isResetClicked) return -1;


      }
      await Future.delayed(Duration(milliseconds: animationSpeed));
      setState(() {
        barColors[index+1] = firstColor;
        barColors[high] = secondColor;
      });
      int temp = numbers[index + 1];
      numbers[index + 1] = numbers[high];
      numbers[high] = temp;

      setState(() {
        barColors[index+1] = const Color(0xff403d39);
        barColors[high] = const Color(0xff403d39);
      });

      if(isResetClicked) return -1;


      return index+1;

    }

    Future<void> quickSort(List<int> numbers, List<Color> barColors,int low , int high)async {

      if(low<high){
        int partitionIndex = await partition(numbers , barColors,low , high);
        if(partitionIndex==-1) return;
         await quickSort(numbers, barColors, low, partitionIndex-1);
         await quickSort(numbers, barColors, partitionIndex+1, high);
      }
    }

    Future<void> startQuickSorting() async {
      setState(() {
        isSorted = false;
        isResetClicked = false;
      });

      await quickSort(numbersWorking,barColorsWorking, 0,numbersWorking.length-1);
      print(numbersWorking);
    }

    //--------------////////////////----------------------------

    void showBottomSheet() {

      showModalBottomSheet(
        context: context,
        isScrollControlled: true,
        backgroundColor: Colors.transparent,
        transitionAnimationController: AnimationController(
          vsync: Navigator.of(context),
          duration: const Duration(milliseconds: 200),
        ),
        builder: (context) {
          return DraggableScrollableSheet(
            initialChildSize: 0.625,
            minChildSize: 0.2,
            maxChildSize: 0.625,
            builder: (context, scrollController) {
              return Container(
                decoration: const BoxDecoration(
                  color: Color(0xff353535),
                  borderRadius: BorderRadius.vertical(top: Radius.circular(40)),
                ),
                child: Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [

                      Align(
                        alignment: Alignment.center,
                        child: IconButton(
                          icon: const Icon(Icons.keyboard_arrow_down, color: Colors.white,size: 50,),
                          onPressed: () => Navigator.pop(context), // Close on tap
                        ),
                      ),
                      Expanded(
                        child: Column(
                          children: [
                            Center(child: MText(input: "How It's Done ?", fontSize: 0.05, color: Colors.white)),

                            SizedBox(height: screenHeight * 0.03),

                            PageViewHorizontal(Item: Steps),

                          ],
                        ),
                      ),
                    ],
                  ),
                ),
              );
            },
          );
        },
      );
    }
    //============= ////////////////////// =============================

    return Scaffold(
      backgroundColor: surfaceColor,
      body: SingleChildScrollView(
        child: Container(
          child: Column(
            children: [
              SizedBox(height: screenHeight * 0.05,),

              Center(
                  child: MText(input: "Quick Sort",fontSize: 0.067,color: secondaryColor)),

              SizedBox(height: screenHeight * 0.02,),

              Padding(
                  padding: const EdgeInsets.symmetric(horizontal: 20.0),
                  child: Center(child: Divider(thickness: 2.5,color: secondaryColor))),

              SizedBox(width: screenWidth,height: screenHeight * 0.43,
                  child: Align(
                      alignment: Alignment.bottomCenter,
                      child: BarVisualization(numbers: numbersWorking,barColors: barColorsWorking))),

              SizedBox(height: screenHeight*0.06,),

              Row(

                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: [
                  SizedBox(width:screenWidth*0.35 ,height: screenHeight*0.07,child: ElevatedButton(onPressed: (){
                    startQuickSorting();
                  }
                      ,style: ElevatedButton.styleFrom(backgroundColor: const Color(0xff353535)), child: MText(input: "Sort", fontSize: 0.04, color: Colors.white))),

                  MyDropDownMenu(dropDownValue: dropDownValue,MenuClr: const Color(0xff353535),function: dropDownCallback),

                ],
              ),

              SizedBox(height: screenHeight * 0.02,),

              Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    ElevatedButton.icon(
                        style: ElevatedButton.styleFrom(
                            fixedSize: Size(screenWidth * 0.4, screenHeight * 0.075),
                            foregroundColor: Colors.white,
                            backgroundColor: const Color(0xff353535)),
                        onPressed: (){
                          repeatAnimations();
                          setState(() {});
                        },

                        label: MText(input: "Reset", fontSize: 0.03, color: Colors.white),icon: const Icon(Icons.arrow_back,size: 30 ,color: Colors.white)),
                    ElevatedButton.icon(
                        style: ElevatedButton.styleFrom(
                          fixedSize: Size(screenWidth * 0.4, screenHeight * 0.075),
                          foregroundColor: Colors.white,
                          backgroundColor:isPause ? const Color(0xffe5383b) : const Color(0xffe5383b),),
                        onPressed: (){
                          pause();},
                        label: isPause?MText(input: "Play", fontSize: 0.03, color: Colors.white):MText(input: "Pause", fontSize: 0.03, color: Colors.white),
                        icon: isPause? const Icon(Icons.play_arrow,size: 30,color: Colors.white): const Icon(Icons.pause,size: 30,color: Colors.white))]),

              SizedBox(height: screenHeight * 0.03),


              Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Padding(
                    padding: EdgeInsets.symmetric(horizontal :screenWidth*0.08),
                    child: MText(input: "Time Complexity : ", fontSize: 0.025, color: secondaryColor),


                  ),

                  Padding(
                    padding: EdgeInsets.symmetric(horizontal :screenWidth*0.08),
                    child: IconButton(onPressed: showBottomSheet, icon: const Icon(Icons.info),color: secondaryColor,iconSize: 30,),
                  ),

                ],
              ),

              Row(
                mainAxisAlignment: MainAxisAlignment.start,
                children: [
                  Padding(
                    padding: EdgeInsets.symmetric(horizontal :screenWidth*0.08),
                    child: MText(input: "O(n*log(n))", fontSize: 0.025, color: secondaryColor),
                  ),
                ],
              ),

              SizedBox(height: screenHeight * 0.05),



            ],
          ),
        ),
      ),
    );
  }
}

