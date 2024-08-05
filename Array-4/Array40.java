/* 10.Write a program to print the characters in an array which comes before the user
given character.
Output:
Input:
Enter the size:
6
Enter Elements
A
B
Y
G
H
P
Enter character key :
H
Output:
Array:
A
B
Y
G   */

import java.io.*;
class Array40 {
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
System.out.print("Enter character key : ");
char ch = (char)br.read();
for(int i=0; i<arr.length; i++){
if(arr[i]==ch){
break;
}
System.out.print(arr[i]+" ");
}
}
}
