import 'package:flutter/material.dart';

ThemeData lightMode = ThemeData(
  brightness: Brightness.light,
  colorScheme: const ColorScheme.light(
    surface: Colors.white,
       primary: Color(0xff353535),
      secondary: Colors.black,
    primaryContainer: Color(0xffbdb2ff),



  ),
);

ThemeData darkMode = ThemeData(
  brightness: Brightness.dark,
  colorScheme: const ColorScheme.dark(
    surface: Colors.black,
    primary: Color(0xff353535),
    secondary: Colors.white,
    primaryContainer: Colors.white,
  ),
);