import 'dart:math';

//Create a random array
class ArrayGenerator{
  static List<int> generateRandomArray(int size , int maxCeiling){
    //Generate unique elements starting from 0 to maxCeiling
    return List.generate(size, (index) => Random().nextInt(maxCeiling)+1);
  }

  //Shuffle array
  static List<int> shuffleArray(List<int> array){
    array.shuffle();
    return array;

  }
}

