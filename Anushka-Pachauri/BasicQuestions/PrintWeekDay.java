import java.util.*;
class PrintWeekDay{
    static String dayOfWeekUsingIfElse(int num){
        String weekDay="";
        if(num==1){
           weekDay="Monday";
        }
        else if(num==2){
            weekDay="Tuesday";
        }
        else if(num==3){
            weekDay="Wednesday";
        }
        else if(num==4){
            weekDay="Thursday";
        }
        else if(num==5){
            weekDay="Friday";
        }
        else if(num==6){
            weekDay="Saturday";
        }
        else if(num==7){
            weekDay="Sunday";
        }
        return weekDay;
    }
    static String dayOfWeekUsingSwitch(int num){
        String weekDay="";
        switch(num){
            case 1:
                weekDay="Monday";
                break;
            case 2:
                weekDay="Tuesday";
                break; 
            case 3:
                weekDay="Wednesday";
                break;
            case 4:
                weekDay="Thursday";
                break;
            case 5:
                weekDay="Friday";
                break;
            case 6:
                weekDay="Saturday";
                break;
            case 7:
                weekDay="Sunday";
                break;
        }
        return weekDay;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers between 1 to 7:");
        int num=sc.nextInt();
        if(num>=1 && num<=7){
            System.out.println("Day of week using if else: "+dayOfWeekUsingIfElse(num));
            System.out.println("Day of week using switch: "+dayOfWeekUsingSwitch(num));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}