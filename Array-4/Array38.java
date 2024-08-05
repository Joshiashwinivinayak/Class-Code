/* 8. WAP to print the occurrence of a user given character.
Example:
Input:
Enter the size of the array:
5
Enter the elements of the array:
A
Y
U
O
U
P
Enter the character to check:
U
Output :
U occurs 2 times in the given array.  */

import java.io.*;
class Array38 {
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
System.out.println("Enter the character to check:");
char ch = (char)br.read();
int count = 0;
for(int i=0; i<arr.length; i++){
if(arr[i]==ch){
count++;
}
}
System.out.println(ch+" occurs "+count+" times in the given array.");
}
}

