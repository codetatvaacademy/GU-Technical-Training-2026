
import 'package:flutter/material.dart';
import 'package:visualizer/widgets/text.dart';

class BarVisualization extends StatefulWidget {
  List<int> numbers;
  List<Color> barColors;
  BarVisualization({super.key,required this.numbers,required this.barColors});

  @override
  State<BarVisualization> createState() => _BarVisualizationState();
}

class _BarVisualizationState extends State<BarVisualization> {


  @override
  Widget build(BuildContext context) {
    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;
    Color secondaryColor = Theme.of(context).colorScheme.secondary;
    Color primaryColor = Theme.of(context).colorScheme.primary;
    Color surfaceColor = Theme.of(context).colorScheme.surface;

    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
          children: [
            for(var i = 0;i<widget.numbers.length;i++)
              Container(
                child: Padding(
                  padding:  EdgeInsets.all(5.0),
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.end,
                    children: [
                      AnimatedContainer(
                        duration: const Duration(milliseconds: 500),
                        curve: Curves.easeInOut,
                        height: widget.numbers[i]*screenHeight*0.007,
                        width: screenWidth*0.06,
                        decoration: BoxDecoration(
                          color: widget.barColors[i],
                          borderRadius: BorderRadius.circular(4),
                        ),
                      ),

                      SizedBox(height: screenHeight*0.02,),

                      MText(input: "${widget.numbers[i]}", fontSize: 0.015, color: const Color(0xff403d39)),

                    ],
                  ),
                ),
              )
      ],
    );
  }
}
