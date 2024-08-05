/* 4. Write a program to print the sum of odd elements in an array.Take input from the user.
Example:
Enter size: 10
Array:
1 2 3 4 2 5 6 2 8 10
Output :
Sum of odd elements : 9   */

import java.io.*;
class Array4 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.print("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Array:");
for(int i=0; i<arr.length; i++){
System.out.println(arr[i]+" ");
}
int sum=0;
for(int i=0; i<arr.length; i++){
if(arr[i]%2==1){
sum = sum + arr[i];
}
}
System.out.print("Sum of odd elements : "+sum);
}
}
