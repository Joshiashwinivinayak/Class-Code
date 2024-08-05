/* 2.WAP to find the difference between minimum element in an array and maximum
element in an array, take input from the user.
Example :
Input:
Enter the size :
5
Enter the elements of the array:
3
6
9
8
10
Output
The difference between the minimum and maximum elements is: 7  */

import java.io.*;
class Array32 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int min_num=0;
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=0; j<arr.length; j++){
if(arr[i]<arr[j]){
count++;
}
}
if(count == arr.length-1){
min_num = arr[i];
}
}
int max_num=0;
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=0; j<arr.length; j++){
if(arr[i]>arr[j]){
count++;
}
}
if(count == arr.length-1){
max_num = arr[i];
}
}
System.out.println("The difference between the minimum and maximum elements is: "+(max_num-min_num));
}
}
