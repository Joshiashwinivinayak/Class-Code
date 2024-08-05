/* 6. Write a program to check whether the array contains element multiple of
user given int value, if yes then print it’s index.
Example :
5 10 16 20 25 30 35 4 8 12 16 20
Input 1:
Enter key : 5
Output:
An element multiple of 5 found at index : 0
An element multiple of 5 found at index : 1
An element multiple of 5 found at index : 3
An element multiple of 5 found at index : 4
An element multiple of 5 found at index : 5
An element multiple of 5 found at index : 6
An element multiple of 5 found at index : 11
Input 2:
Enter key: 99
Output : Element Not Found. */

import java.io.*;
class Array56 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter first array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter key:");
int key = Integer.parseInt(br.readLine());
int count=0;
for(int i=0; i<arr.length; i++){
if(arr[i]%key==0){
System.out.println("An element multiple of "+key+" found at index : "+i);
} else if(arr[i]%key!=0){
count++;
}
}
if(count==arr.length){
System.out.println("Element Not Found.");
}
}
}

