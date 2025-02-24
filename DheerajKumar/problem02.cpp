//2. WAP to take input 1 number from the user and print its square and cube.
 #include <iostream>
 using namespace std;

int square(int num){
    return num*num;
}

 int cube(int num){
    return square(num) * num;
 }
 
 int main(){
    int number = 0;
    cout<<"Enter number -> ";
    cin>>number;
    cout<<"\n The square is -> "<<square(number);
    cout<<"\n The cube is -> "<< cube(number);
 }