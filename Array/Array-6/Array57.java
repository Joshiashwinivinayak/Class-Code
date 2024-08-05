/* 7. Write a program to, where you have to take integer input from user and if
the integer is in the range of ASCII value of A to Z, while saving you have to type cast the int to char . Print the array.
Enter size :
7
Enter array elements:
55
67
65
97
36
13
68
Array will be like :
arr1
55 C A 97 36 13 D  */

import java.io.*;
class Array57 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter first array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=0; i<arr.length; i++){
if(arr[i]>=65 && arr[i]<=90){
System.out.print((char)arr[i]+" ");
} else {
System.out.print(arr[i]+" ");
}
}
}
}
