import 'package:flutter/material.dart';

class IndividualBar extends StatelessWidget {
  final double height;
  final Color color;
  final int value;

  const IndividualBar({super.key, required this.height, required this.color, required this.value});

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.end,
      children: [
        Text("$value", style: TextStyle(fontSize: 14, fontWeight: FontWeight.bold),),
        SizedBox(height: 5),
        AnimatedContainer(
          duration: Duration(milliseconds: 500),
          width: 30,
          height: height,
          decoration: BoxDecoration(
            color: color,
            borderRadius: BorderRadius.circular(5),
          ),
        ),
      ],
    );
  }
}
