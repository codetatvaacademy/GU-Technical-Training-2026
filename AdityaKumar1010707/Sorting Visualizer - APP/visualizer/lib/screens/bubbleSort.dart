import 'dart:async';
import 'dart:core';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:visualizer/widgets/dropDownMenu.dart';
import 'package:visualizer/widgets/text.dart';
import '../core/bar_visualization.dart';
import '../widgets/PageView-Horizontal.dart';

class BubbleSortScreen extends StatefulWidget {
  const BubbleSortScreen({super.key});

  @override
  State<BubbleSortScreen> createState() => _BubbleSortState();
}

class _BubbleSortState extends State<BubbleSortScreen> {

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
    "Start at the beginning of the array.",
    "Compare the first two elements.",
    "If the first element is greater than the second, swap them.",
    "Move to the next pair of elements and repeat the comparison.",
    "Continue this process until the last element.",
    "After the first pass, the largest element is placed at the end.",
    "Repeat the process for the remaining unsorted part of the array.",
    "Continue until no swaps are needed, meaning the array is sorted."
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
          case "Normal":{animationSpeed = 200;break;}
          case "Slow":{animationSpeed = 600;break;}
          case "Fast":{animationSpeed = 100;break;}}
      });
    }

    //=================///////////========================

    // ============ Pause & Timer functionality ============


    void pauseTimer(){
      print("inside pause timer");
      if(timer!=null){
        timer!.cancel();
        setState(() {
          isTimerPaused = true;
        });
      }

    }

    void startTimer(){
      if(!isPause) {
        timer = Timer.periodic(const Duration(milliseconds: 1), (val) {
          setState(() {
            time++;
            isTimerPaused = false;
          });
        });
      }
    }

    void resumeTimer(){
      if(isTimerPaused && timer!=null) {
        startTimer();
      }
    }

    void resetTimer(){
      if(timer!=null) {
        timer!.cancel();
      }

      setState(() {
        time = 0;
        isTimerPaused = true;
      });
    }

    void pause() {

      setState(() {

        isPause = !isPause;
        if (!isPause) {
          completer.complete();
          resumeTimer();
        }
      });
    }

    // ============ //////////////////////// ==================


    //============= Sorting Logic =============================

    Future<void> bubbleSort(
        List<int> numbers, List<Color> barColors, Function updateState) async {
      for (int i = 0; i < numbers.length - 1; i++) {

        if(isResetClicked) break;


        for (int j = 0; j < numbers.length - i - 1; j++) {


          //See if the pause button is not clicked
          while (isPause) {
            // await Future.delayed(Duration(milliseconds: 100));
            completer = Completer<void>();
            await completer.future;
          }

          if(isResetClicked) break;


          //The bars which are being compared is marked with a different color
          //for highlighting
          updateState(() {
            barColors[j] = firstColor;
            barColors[j + 1] = secondColor;
          });
          if (numbers[j] > numbers[j + 1]) {
            // Swap
            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;

            // Delay for animation
            await Future.delayed(Duration(milliseconds: animationSpeed));
          }
          //After comparing and swapping ends , Make the bars color back to
          //black
          updateState(() {
            barColors[j] = const Color(0xff403d39);
            barColors[j + 1] = const Color(0xff403d39);
          });

          // Delay between each step for visualization
          await Future.delayed(Duration(milliseconds: animationSpeed));
        }
      }

      pauseTimer();

    }

    Future<void> startBubbleSorting() async {

      setState(() {
        isSorted = false;
        isResetClicked = false;
      });

        await bubbleSort(numbersWorking, barColorsWorking, (updateState) {
          setState(() {
            updateState();
          });
        });

    }

    //============= ////////////////////// =============================

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

    //--------------------------------------------------------------------------




    return Scaffold(
      backgroundColor: surfaceColor,
      body: SingleChildScrollView(
        child: Container(
          child: Column(
            children: [
              SizedBox(height: screenHeight * 0.05,),

              Center(
                  child: MText(input: "Bubble Sort",fontSize: 0.067,color: secondaryColor)),

              SizedBox(height: screenHeight * 0.02,),

              Padding(
                padding: const EdgeInsets.symmetric(horizontal: 20.0),
                child: Center(child: Divider(thickness: 2.5,color: secondaryColor))),

              SizedBox(width: screenWidth,height: screenHeight * 0.43,
                child: Align(
                  alignment: Alignment.bottomCenter,
                  child: BarVisualization(numbers: numbersWorking,barColors: barColorsWorking))),

              SizedBox(height: screenHeight*0.05,),

              Row(

                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: [
                  SizedBox(width:screenWidth*0.35 ,height: screenHeight*0.07,child: ElevatedButton(onPressed: (){
                     setState(() {
                       if(isTimerPaused ) {
                         startTimer();
                       }
                       isResetClicked = false;
                     });
                    startBubbleSorting();
                    }
                      ,style: ElevatedButton.styleFrom(backgroundColor: primaryColor), child: MText(input: "Sort", fontSize: 0.04, color: Colors.white))),

                  MyDropDownMenu(dropDownValue: dropDownValue,MenuClr: primaryColor,function: dropDownCallback),

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
                      backgroundColor: primaryColor),
                    onPressed: (){
                      resetTimer();
                      repeatAnimations();
                      setState(() {});
                      },

                    label: MText(input: "Reset", fontSize: 0.03, color: Colors.white),icon: const Icon(Icons.arrow_back,size: 30, color: Colors.white)),
                  ElevatedButton.icon(
                    style: ElevatedButton.styleFrom(
                      fixedSize: Size(screenWidth * 0.4, screenHeight * 0.075),
                      foregroundColor: Colors.white,
                      backgroundColor:isPause ? const Color(0xffe5383b) : const Color(0xffe5383b),),
                    onPressed: (){
                      pauseTimer();
                      pause();},
                    label: isPause?MText(input: "Play", fontSize: 0.03, color: Colors.white):MText(input: "Pause", fontSize: 0.03, color: Colors.white),
                    icon: isPause? const Icon(Icons.play_arrow,size: 30,color: Colors.white,): const Icon(Icons.pause,size: 30,color: Colors.white,))]),


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
                    child: MText(input: "O(N^2)", fontSize: 0.025, color: secondaryColor),
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
