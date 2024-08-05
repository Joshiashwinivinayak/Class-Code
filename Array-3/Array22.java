/* 2 Write a program to find the first occurrences of a specific number in an array. Print the
index of a first occurrence.
Example :
1 5 9 8 7 6
Input: Specific number : 5
Output: num 5 first occurred at index : 1
Input: Specific number : 11
Output: num 11 not found in array. */

import java.io.*;
class Array22 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.print("Specific number : ");
int num = Integer.parseInt(br.readLine());
int count = 0;
for(int i=0; i<arr.length; i++){
if(arr[i]==num){
System.out.println("num "+num+" first occurred at index : "+i);
break;
} else {
count++;
}
}
if(count == arr.length){
System.out.println("num "+num+" not found in array.");
}
}
}
