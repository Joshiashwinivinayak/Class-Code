/* 10. WAP to check if the string is empty if not then print the last character of the string.
Take string input from the user.
Input: “Core2web”
Output : b */

import java.util.*;
class String10 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String str = sc.next();
if(str!=null){
System.out.println(str.charAt(str.length()-1));
}
}
}
