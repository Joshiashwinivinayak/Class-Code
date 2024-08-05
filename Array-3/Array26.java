/* 6 Write a program to print all the consonants in an array.
a b c y x o p
Output:
b c y x p */

import java.io.*;
class Array26 {
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
System.out.print("Consonants in array: ");
for(int i=0; i<arr.length; i++){
if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
continue;
} else {
System.out.print(arr[i]+" ");
}
}
}
}
