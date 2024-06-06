/* Write a program in which students should enter marks of 5 different subjects. If all subject
having above passing marks add them and provide to switch case to print grades(first class
second class), if student get fail in any subject program should print “You failed in exam” */

import java.util.*;
class Switch1 {
public static void main(String [] args){
Scanner sc= new Scanner(System.in);

int Marathimarks;
System.out.println("Enter Marathi marks: ");
Marathimarks = sc.nextInt();

int Mathmarks;
System.out.println("Enter Math marks: ");
Mathmarks = sc.nextInt();

int Englishmarks;
System.out.println("Enter English marks: ");
Englishmarks = sc.nextInt();

int Sanskritmarks;
System.out.println("Enter Sanskrit marks: ");
Sanskritmarks = sc.nextInt();

int Socialsciencemarks;
System.out.println("Enter Social Sience marks: ");
Socialsciencemarks = sc.nextInt();

if(Marathimarks<35 || Mathmarks<35 ||  Englishmarks<35 || Sanskritmarks<35 || Socialsciencemarks<35){
System.out.println("You are failed");
}
else {
double avg = (Marathimarks + Mathmarks + Englishmarks + Sanskritmarks + Socialsciencemarks)/5;
char ch;
if(avg>=75){
ch='A';
} else if(avg>=60 && avg<75) {
ch='B';
} else if(avg>=50 && avg<60){
ch='C';
} else if(avg>=40 && avg<50) {
ch='D';
} else if(avg>=35 && avg<40) {
ch='E';
}else  
ch = 'F';
switch(ch){
case 'A':
System.out.println("First class with distinction");
break;
case 'B':
System.out.println("First class");
break;
case 'C':
System.out.println("Second class");
break;
case 'D':
System.out.println("Third class");
break;
case 'E':
System.out.println("Pass");
break;
case 'F':
System.out.println("Fail");
break;
}
}
}
}
