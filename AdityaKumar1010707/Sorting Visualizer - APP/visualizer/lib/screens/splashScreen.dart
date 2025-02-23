import 'package:animated_splash_screen/animated_splash_screen.dart';
import 'package:flutter/material.dart';
import 'package:lottie/lottie.dart';
import 'package:visualizer/screens/home_screen.dart';

class Splashscreen extends StatelessWidget {
const Splashscreen ({super.key});

@override
Widget build(BuildContext context) {
  Color secondaryColor = Theme.of(context).colorScheme.secondary;
  Color primaryColor = Theme.of(context).colorScheme.primary;
  Color surfaceColor = Theme.of(context).colorScheme.surface;

return AnimatedSplashScreen(splash: Center(
  child: Lottie.asset('assets/videos/Animation - 1740247579200.json'),
),
    duration: 4895,
    splashIconSize: 300,
    backgroundColor: surfaceColor,
    splashTransition:SplashTransition.fadeTransition ,
    nextScreen:const HomeScreen());
}
}
    