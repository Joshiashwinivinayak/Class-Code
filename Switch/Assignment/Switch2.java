/* Write a program in which ask the user to enter a number from 0 to 5 and print it's spelling, 
if the entered number is greater than 5 print entered number is greater than 5.
e.g
Input -Enter a number - 4
Output - four   */

import java.util.*;
class Switch2 {
public static void main(String [] args){
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number from 0 to 5:");
num = sc.nextInt();

if(num>5){
System.out.println("Number is greater than 5");
} else if(num<0){
System.out.println("Ivalid number");
} 

switch(num){
case 0:
System.out.println("Zero");
break;
case 1:
System.out.println("One");
break;
case 2:
System.out.println("Two");
break;
case 3:
System.out.println("Three");
break;
case 4:
System.out.println("Four");
break;
case 5:
System.out.println("Five");
break;
}
}
}
