/* 7. WAP to convert lowercase characters to UPPERCASE characters.(Take input from
the user)
Example:
Input:
Enter the size of the array:
6
Enter the elements of the array:
a
B
Y
p
o
H
Output:
A B Y P O H   */

import java.io.*;
class Array37 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=(char)br.read();
br.skip(1);
}
for(int i=0; i<arr.length; i++){
if(arr[i]>=97 && arr[i]<=122){
arr[i] = arr[i] - 32;
}
}
for(int i=0; i<arr.length; i++){
System.out.print((char)arr[i]);
System.out.print(" ");
}
}
}
