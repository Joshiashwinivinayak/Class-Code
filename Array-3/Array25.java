/* 5 Write a program to convert all negative numbers into their squares in a given array.
-2 5 -6 7 -3 8
Output:
4 5 36 7 9 8  */

import java.io.*;
class Array25 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=0; i<arr.length; i++){
if(arr[i]<0){
arr[i] = arr[i]*arr[i];
}
}
System.out.print("Array elements:");
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}
