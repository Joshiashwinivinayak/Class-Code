/* 4. WAP to check whether the user given number occurs more than 2 times or equals 2 times.
Example:
Input:
Enter the size of the array:
6
Enter the elements of the array:
56
65
78
56
90
56
Enter the number to check:
56
Output:
56 occurs more than 2 times in the array. */

import java.io.*;
class Array34 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.print("Enter the number to check:");
int num = Integer.parseInt(br.readLine());
int count = 0;
for(int i=0; i<arr.length; i++){
if(arr[i]==num){
count++;
}
if(count>2){
System.out.print(num+" occurs more than 2 times in the array.");
}
}
}
}
