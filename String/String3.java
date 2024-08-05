/* 3.WAP to take input as a string from the user and print all the characters one by one.
input : JAVA
Output : J
A
V
A */

import java.util.*;
class String3 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String str = sc.next();
char arr[] = str.toCharArray();
for(int i=0; i<arr.length; i++){
System.out.println(arr[i]);
}
}
}
