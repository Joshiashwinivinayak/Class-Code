/* 4 Write a program to convert all even numbers into 0 and odd numbers into 1 in a given
array.
1 2 3 12 15 6 7 10 9
Output:
1 0 1 0 1 0 1 0 1  */

import java.io.*;
class Array24 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.print("Array elements after converting:");
for(int i=0; i<arr.length; i++){
if(arr[i]%2==0){
arr[i]=0;
} else {
arr[i]=1;
}
}
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}
