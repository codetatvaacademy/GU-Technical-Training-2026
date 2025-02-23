import 'dart:async';
import 'dart:core';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:visualizer/widgets/PageView-Horizontal.dart';
import 'package:visualizer/widgets/dropDownMenu.dart';
import 'package:visualizer/widgets/text.dart';
import '../core/bar_visualization.dart';

class InsertionSortScreen extends StatefulWidget {
  const InsertionSortScreen({super.key});

  @override
  State<InsertionSortScreen> createState() => _InsertionSortState();
}

class _InsertionSortState extends State<InsertionSortScreen> {
  bool isPause = false;
  late List<int> numbers;
  late List<Color> barColors;
  late Completer<void> completer;
  late int animationSpeed = 400;
  String dropDownValue = "Normal";
  bool isResetClicked = false;
  int time = 0;
  Timer? timer;
  bool isTimerPaused = true;

  List<String> Steps = [
  "Start with the second element (index 1) as the key.",
  "Compare the key with the previous element.",
  "If the key is smaller, shift the previous element one position to the right.",
  "Continue shifting elements until the correct position for the key is found.",
  "Insert the key at its correct position.",
  "Move to the next element and repeat the process.",
  "Continue until the entire array is sorted."

  ];

  @override
  void initState() {
    super.initState();
    final Map<String, dynamic>? data = Get.arguments;
    numbers = (data?["numbers"] as List<int>?) ?? [];
    barColors = (data?["barColors"] as List<Color>?) ?? [];
  }

  late List<int> numbersWorking = List<int>.from(numbers);
  late List<Color> barColorsWorking = List<Color>.from(barColors);

  @override
  Widget build(BuildContext context) {
    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;
    Color secondaryColor = Theme.of(context).colorScheme.secondary;
    Color primaryColor = Theme.of(context).colorScheme.primary;
    Color surfaceColor = Theme.of(context).colorScheme.surface;

    Color firstColor = const Color(0xFFaffc41);
    Color secondColor = const Color(0xFFaffc41);


    void dropDownCallback(String selectedValue) {
      setState(() {
        dropDownValue = selectedValue;
        switch(dropDownValue){
          case "Normal":{animationSpeed = 200;break;}
          case "Slow":{animationSpeed = 600;break;}
          case "Fast":{animationSpeed = 100;break;}}
      });
    }

    void startTimer(){
      timer = Timer.periodic(const Duration(milliseconds: 1), (val){
        setState(() {
          time++;
          isTimerPaused = false;
        });
      });


    }

    void pauseTimer(){
      if( timer!=null){
        timer!.cancel();
      }

      setState(() {
        isTimerPaused = true;
      });
    }

    void resumeTimer(){
      if(isTimerPaused){
        startTimer();
      }

      setState(() {
        isTimerPaused = false;
      });
    }

    void resetTimer(){
      timer!.cancel();

      setState(() {
        time = 0;
        isTimerPaused = true;
      });
    }

    void repeatAnimations() {

      resetTimer();

      setState(() {

        isResetClicked = true;
        isPause = false;
        for (int i = 0; i < numbersWorking.length; i++) {
          numbersWorking[i] = numbers[i];
          barColorsWorking[i] = const Color(0xff403d39);
        }
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
    Future<void> insertionSort()async{
      for(int i=1;i<numbersWorking.length;i++){

        if(isResetClicked) break;

        int key = numbersWorking[i];
        int j = i-1;

        if(isResetClicked) break;

        setState(() {
          barColorsWorking[i] = firstColor;
          barColorsWorking[j] = secondColor;
        });

        while(j>=0 && numbersWorking[j]>key){


          await Future.delayed(Duration(milliseconds: animationSpeed));

          if(isResetClicked) break;

          setState(() {
            barColorsWorking[j+1] = const Color(0xff403d39);
            barColorsWorking[j]=firstColor;
            if(j-1>=0) barColorsWorking[j-1] = const Color(0xff403d39);
          });

          if(isResetClicked) break;

          numbersWorking[j+1] = numbersWorking[j];

          if(isResetClicked) break;


          if(isPause){
            completer = Completer<void>();
            await completer.future;
          }
          j--;
        }
        if(isResetClicked) break;

        numbersWorking[j+1] = key;

        await Future.delayed(Duration(milliseconds: animationSpeed));

        setState(() {
          // barColorsWorking[i] = Colors.white;
          barColorsWorking[j+1]=const Color(0xff403d39);
        });


        setState(() {
          barColorsWorking[j+1] = const Color(0xff403d39);
        });

      }

      setState(() {
        barColorsWorking[barColorsWorking.length-2] = const Color(0xff403d39);
      });

      pauseTimer();

    }

    Future<void> startInsertionSorting() async {
      if(!isPause) {
        insertionSort();
      }
    }

    //--------------------------------------------------------------------------

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
                  child: MText(input: "Insertion Sort",fontSize: 0.057,color: secondaryColor)),

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
                      isResetClicked = false;
                    });
                    if(!isPause) {
                      startTimer();
                    }
                    startInsertionSorting();
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
                          pause();
                          pauseTimer();
                          },
                        label: isPause?MText(input: "Play", fontSize: 0.03, color: Colors.white):MText(input: "Pause", fontSize: 0.03, color: Colors.white),
                        icon: isPause? const Icon(Icons.play_arrow,size: 30,color: Colors.white): const Icon(Icons.pause,size: 30,color: Colors.white))]),

              SizedBox(height: screenHeight * 0.03),


              Row(
                mainAxisAlignment: MainAxisAlignment.start,
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
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
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
