/* 9. WAP to replace the elements with #, which are not in the range of ‘a to z’.
Input:
Enter the size:
6
Enter Elements
A
B
c
d
E
*
Output
Array:
#
#
c
d
#
#  */

import java.io.*;
class Array39 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
char arr[]=new char[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=(char)br.read();
br.skip(1);
}
for(int i=0; i<arr.length; i++){
if(arr[i]>=97 && arr[i]<=122){
arr[i] = arr[i];
} else {
arr[i]='#';
}
}
System.out.println("Array:");
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}
