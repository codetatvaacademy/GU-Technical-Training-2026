import 'package:flutter/material.dart';
import 'package:get/get_navigation/src/root/get_material_app.dart';
import 'package:visualizer/core/theme.dart';
import 'package:visualizer/screens/home_screen.dart';
import 'package:visualizer/screens/splashScreen.dart';

void main()=>runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    WidgetsFlutterBinding.ensureInitialized();
    return GetMaterialApp(
      debugShowCheckedModeBanner: false,
      home: Splashscreen(),
      theme: lightMode,
      darkTheme: darkMode,
    );
  }
}
