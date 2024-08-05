/* 8.WAP to remove void spaces in the string
Input String: " Hello, World! "
Output String: "Hello, World!" */

import java.util.*;
class String8 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String str = sc.next();
System.out.println(str.trim());
}
}
