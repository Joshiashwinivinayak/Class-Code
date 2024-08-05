/* 4.Take two input strings str1 & str2 from the user and print 0 if both strings are equal 
else print the difference between unequal element.
Input: str1 = Amish
Str2 = Amash
Difference = 8;
Input: str1 = Java
str2 = Java
Difference = 0 */

import java.util.*;
class String4 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first string :");
String str1 = sc.next();
System.out.println("Enter second string :");
String str2 = sc.next();
System.out.println("Difference = "+str1.compareTo(str2));
}
}
