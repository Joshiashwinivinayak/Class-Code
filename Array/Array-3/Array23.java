/* 3 Write a program to find the number of occurrences of a specific number in an array. Print
the count of occurrences.
2 5 2 7 8 9 2
Input Specific number: 2
Output : Number 2 occurred 3 times in an array.
Input: Specific number : 11
Output: num 11 not found in array.  */

import java.io.*;
class Array23 {
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
count++;
} else {
continue;
}
}
if(count==0){
System.out.println("num "+num+" not found in array.");
} else {
System.out.println("Number "+num+" occurred "+count+" times in an array.");
}
}
}
