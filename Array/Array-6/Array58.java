/* 8. Write a program to reverse the char array and print the alternate
elements of the array before and after reverse.
Size = 10
A B C D E F G H I J
After reverse :
J I H G F E D C B A
Output :
Before Reverse:
A C E G I
After Reverse:
J H F D B   */

import java.io.*;
class Array58 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
char arr[]=new char[size];
System.out.println("Enter first array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=(char)br.read();
br.skip(1);
}
System.out.println("Before Reverse:");
for(int i=0; i<arr.length; i=i+2){
System.out.println(arr[i]);
System.out.print(" ");
}
char arr2[]=new char[size];
int j=arr.length-1;
for(int i=0; i<arr.length; i++){
arr2[i]=arr[j];
j--;
}
System.out.println("After Reverse:");
for(int i=0; i<arr.length; i=i+2){
System.out.print(arr2[i]+" ");
}
}
}
