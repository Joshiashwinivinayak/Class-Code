/* 5.Write a program to print the sum of odd indexed elements, in an array. Where you have
to take size input and elements input from the user .
Example:
Input:
Enter the size
5
Enter elements:
4
8
2
6
7
Output:
Sum of odd indexed elements : 14  */

import java.io.*;
class Array15 {
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
if(i%2==1){
sum = sum + arr[i];
}
}
System.out.println("Sum of odd indexed elements : " +sum);
}
}

