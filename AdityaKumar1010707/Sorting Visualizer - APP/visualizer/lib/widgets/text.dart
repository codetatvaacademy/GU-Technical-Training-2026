import 'package:flutter/material.dart';

class MText extends StatelessWidget {
  String input;
  double fontSize;
  Color color;
  MText({super.key,required this.input,required this.fontSize,required this.color});

  @override
  Widget build(BuildContext context) {

    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;

    return   Text(
      input,
      style: TextStyle(
        fontFamily: 'Poppins',
        fontSize: screenHeight * fontSize,
        color: color,
        fontWeight: FontWeight.bold,
      ),
      softWrap: true,
      overflow: TextOverflow.visible,
    );
  }
}
