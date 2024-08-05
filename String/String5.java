/* 5.WAP to take two strings input from the user and check whether those string objects are
equal or not if equal print true else false
Ex 1:
Input: str1 = Java
str2 = JavaDSA
Output: false
Ex2:
Input: str1 = Java
Str2 = Java
Output: true */

import java.util.*;
class String5 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first string :");
String str1 = sc.next();
System.out.println("Enter second string :");
String str2 = sc.next();
System.out.println(str1.equals(str2));
}
}
