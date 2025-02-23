
import 'package:flutter/material.dart';

class PageViewHorizontal extends StatelessWidget {
  List<String> Item;
  PageViewHorizontal({super.key,required this.Item});

  @override
  Widget build(BuildContext context) {

    double screenWidth = MediaQuery.of(context).size.width;
    double screenHeight = MediaQuery.of(context).size.height;


    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: SizedBox(
        height: screenHeight*0.35,
        child: PageView.builder(
            pageSnapping: true,
            physics: const BouncingScrollPhysics(),
            itemCount: Item.length,
            scrollDirection: Axis.horizontal,
            itemBuilder: (context, index) {
              return
                Padding(
                  padding: const EdgeInsets.all(12.0),
                  child: Container(
                    // margin: EdgeInsets.all(8.0),
                    width: screenWidth * 0.70,
                    height: screenHeight * 0.2,
                    decoration: BoxDecoration(
                      color: Colors.black,
                      borderRadius: BorderRadius.circular(50),
                    ),
                    child: Center(
                      child: SingleChildScrollView(
                        physics: const BouncingScrollPhysics(),
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Padding(
                              padding: const EdgeInsets.all(15.0),
                              child: Text(
                                Item[index],
                                textAlign: TextAlign.center,
                                style: const TextStyle(
                                  fontFamily: 'Poppins',
                                  fontWeight: FontWeight.bold,
                                  fontSize: 30,
                                  color: Colors.white,
                                ),
                              ),
                            )
                          ],
                        ),
                      ),
                    ),
                  ),
                );
            }),
      ),
    );
  }
}
