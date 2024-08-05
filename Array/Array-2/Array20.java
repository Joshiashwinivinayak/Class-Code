/* 10. WAP to print the Maximum element in the array.
Example:
Input:
Enter the size
5
Enter elements:
7
81
65
12
23
Output:
Maximum number in the array is found at pos 1 is 81  */

import java.io.*;
class Array20 {
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
int count=0;
for(int j=0; j<arr.length; j++){
if(arr[i]>arr[j]){
count++;
}
}
if(count == arr.length-1){
System.out.println("Maximum number in the array is found at pos "+i+" is "+arr[i]);
}
}
}
}
