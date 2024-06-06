/* Write a program in which user should enter two numbers if both the numbers are positive
multiply them and provide to switch case to verify number is even or odd, if user enters any
negative number program should terminate saying “Sorry negative numbers not allowed”  */

import java.util.*;
class Switch3 {
public static void main(String [] args){
int num1,num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
num1 = sc.nextInt();
System.out.println("Enter the second number:");
num2 = sc.nextInt();

if(num1<0 || num2<0){
System.out.println("Sorry negative numbers not allowed");
} else {
int mult = num1 * num2;

String str ;
if(mult%2==0){
str="even";
}
else {
str="odd";
}

switch(str){
case "even":
System.out.println("Number is even");
break;
case "odd":
System.out.println("Number is odd");
break;
}
}
}
}
