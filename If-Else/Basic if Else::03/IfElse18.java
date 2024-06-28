/* Write a program to check the day number(1-7)and print the corresponding day of week.
Input:1
Output:Monday
Input:7
Output:Sunday
Input:8
Output:day number must be between 1 to 7!!!! */

class IfElse18 {
public static void main(String [] args){
int num = 1;
if(num==1){
System.out.println("Monday");
} else if(num==2){
System.out.println("Tuesday");
} else if(num==3){
System.out.println("Wednesday");
} else if(num==4){
System.out.println("Thursday");
} else if(num==5){
System.out.println("Friday");
} else if(num==6){
System.out.println("Saturday");
} else if(num==7){
System.out.println("Sunday");
} else {
System.out.println("Day number must be between 1 to 7!!!!");
}
}
}
