/* 6.Write a Java program that compares two strings without considering their case
sensitivity.
Ex:
Str1 = Core2web
Str2 = Core2Web
output=true */

import java.util.*;
class String6 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first string :");
String str1 = sc.next();
System.out.println("Enter second string :");
String str2 = sc.next();
if(str1.compareToIgnoreCase(str2)==0){
System.out.println("True");
} else {
System.out.println("False");
}
}
}
