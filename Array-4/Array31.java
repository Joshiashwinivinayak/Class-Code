/* 1.WAP to take input from the user for size and elements of an array, where you have to
print the average of array elements(Array should be of integers).
Example :
Input:
Enter the size:
4
Enter array elements:
2
4
6
8
Output:
Array elements' average is :5  */

import java.io.*;
class Array31 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int sum = 0;
for(int i=0; i<arr.length; i++){
sum = sum + arr[i];
}
int avg = sum / arr.length;
System.out.print("Array elements' average is : "+avg);
}
}
