/* 2. WAP to concat the strings given by the user and count the length of string after
concatenation.
input 1: Core2
Input 2: web
Output : Core2web
Length of String : 8 */

import java.util.*;
class String2 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first string :");
String str1 = sc.next();
System.out.println("Enter second string :");
String str2 = sc.next();
String str3 = str1.concat(str2);
System.out.println(str3);
System.out.println("Length of String : "+str3.length());
}
}
