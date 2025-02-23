import 'dart:async';
import 'dart:core';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:visualizer/widgets/dropDownMenu.dart';
import 'package:visualizer/widgets/text.dart';
import '../core/bar_visualization.dart';
import '../widgets/PageView-Horizontal.dart';


class MergeSortScreen extends StatefulWidget {
  const MergeSortScreen({super.key});

  @override
  State<MergeSortScreen> createState() => _MergeSortState();
}

class _MergeSortState extends State<MergeSortScreen> {

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
    "Divide the array into two equal halves.",
    "Recursively repeat the process for each half until each sub-array has only one element.",
    "Start merging the sub-arrays by comparing elements from both halves.",
    "Place the smaller element into the sorted array first.",
    "Continue merging elements while maintaining the correct order.",
    "Merge the remaining elements from both halves if any are left.",
    "Repeat this merging process until the entire array is reconstructed in sorted order.",
    "The final merged array is now sorted."
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
          barColorsWorking[i] =  const Color(0xff403d39);
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

      Future<void> merge(List<int> numbers,List<Color>barColors, int left,int mid, int right) async{
        int array1 = mid - left + 1;
        int array2 = right-mid;

        if(isResetClicked) return;

        List<int> LeftArray = List<int>.filled(array1,0);
        List<int> RightArray = List<int>.filled(array2,0);



        for(int i=0;i<array1;i++) {
          LeftArray[i] = numbers[left + i];
        }
        for(int i=0;i<array2;i++) {
          RightArray[i] = numbers[mid + 1 + i];
        }

        int i=0,j=0,k=left;

        while(i<array1 && j<array2){

          setState(() {
            barColors[k] = const Color(0xFFaffc41);
          });

          if(LeftArray[i] <= RightArray[j]){
            numbers[k] = LeftArray[i];
            i++;
          }
          else{
            numbers[k] = RightArray[j];
            j++;
          }
          k++;
          await Future.delayed(Duration(milliseconds: animationSpeed));
          setState(() {
            barColors[k-1] =  const Color(0xff403d39);
          });
          if(isResetClicked) return;

          if(isPause){
            completer = Completer<void>();
            await completer.future;
          }
        }

        while(i<array1){

          setState(() {
            barColors[k] = const Color(0xFFaffc41);
          });

          if(isResetClicked) return;
          numbers[k] = LeftArray[i];
          i++;
          k++;
          await Future.delayed(Duration(milliseconds: animationSpeed));
          setState(() {
            barColors[k-1] =  const Color(0xff403d39);
          });

          if(isResetClicked) return;


        }

        while(j<array2){

          setState(() {
            barColors[k] = const Color(0xFFaffc41);
          });


          if(isResetClicked) return;

          numbers[k] = RightArray[j];
          k++;
          j++;
          await Future.delayed(Duration(milliseconds: animationSpeed));
          setState(() {
            barColors[k-1] =  const Color(0xff403d39);

          });

          if(isResetClicked) return;

        }

        // await Future.delayed(Duration(milliseconds: animationSpeed));
        setState(() { });
      }



      Future<void> mergeSort(List<int> numbers,List<Color>barColors,int left, int right) async{

        if(left<right){
          int mid = (left + right)~/2;
          await mergeSort(numbers, barColors,left, mid);
          await mergeSort(numbers,barColors, mid+1, right);
          await merge(numbers,barColors, left, mid, right);
        }

        setState(() {

        });


      }


    //============= Sorting Logic =============================



    Future<void> startMergeSorting() async {

      setState(() {
        isSorted = false;
        isResetClicked = false;
      });


      await mergeSort(numbersWorking,barColorsWorking, 0,numbersWorking.length-1);
      // print(numbersWorking);
    }

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
                  child: MText(input: "Merge Sort",fontSize: 0.067,color: secondaryColor)),

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
                    startMergeSorting();
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

