/* 6. Write a program where you have to take input from the user for a character array and
print the characters. */

import java.io.*;
class Array6 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
char arr[]=new char[size];
System.out.print("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=(char)br.read();
br.skip(1);
}
System.out.print("Array elements are:");
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}
