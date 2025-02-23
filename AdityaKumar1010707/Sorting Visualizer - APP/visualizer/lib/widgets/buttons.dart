import 'package:flutter/material.dart';
import 'package:visualizer/widgets/text.dart';

// typedef VoidCallback = void Function();
class MyElevatedButton extends StatelessWidget {
  


  final VoidCallback onPressedFunction;
  final String buttonText;
  final Color foregroundClr;
  final Color backgroundClr;
  final double fontSize;
  const MyElevatedButton({super.key, required this.onPressedFunction,required this.buttonText, required this.foregroundClr, required this.backgroundClr,required this.fontSize});

  @override
  Widget build(BuildContext context) {

    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;


    return ElevatedButton.icon(
      onPressed:onPressedFunction,
      label: Text(buttonText,
        textAlign: TextAlign.center,
        style: TextStyle(

          fontFamily: 'Poppins',
          fontSize: screenHeight*fontSize,
          fontWeight: FontWeight.bold,
        ),
      ),
      style: ElevatedButton.styleFrom(
        foregroundColor: foregroundClr,
        backgroundColor: backgroundClr,
        padding: const EdgeInsets.symmetric(horizontal: 15,vertical: 15),
      ),
    );
  }
}

Widget MElevatedButton(String ButtonText, Color foregroundClr, Color backgroundClr, VoidCallback functionName, double fntSize){

  return MyElevatedButton(
    onPressedFunction: functionName,
    buttonText: ButtonText, foregroundClr: foregroundClr, backgroundClr: backgroundClr,
    fontSize: fntSize,
  );

}

class MyElevatedIconButton extends StatelessWidget {
  final VoidCallback onPressedFunction;
  final String buttonText;
  final Color foregroundClr;
  final Color backgroundClr;
  final double fontSize;
  final Icon icon;
  final Function function;

  const MyElevatedIconButton({super.key,required this.icon,required this.onPressedFunction,required this.buttonText, required this.foregroundClr, required this.backgroundClr,required this.fontSize, required this.function});

  @override
  Widget build(BuildContext context) {

    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;

    return ElevatedButton.icon(
      style: ElevatedButton.styleFrom(
        fixedSize: Size(screenWidth * 0.4, screenHeight * 0.065),
        foregroundColor: foregroundClr,
        backgroundColor: backgroundClr,
      ),
      label: MText(input: "Pause", fontSize: 0.02, color: Colors.white),
      icon: const Icon(Icons.pause),
      onPressed: (){
        function();
      },
    );
  }
}

