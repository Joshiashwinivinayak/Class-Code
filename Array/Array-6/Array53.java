/* 3. Write a program to check the count of the user given key in your array, if
the count is more than 2 times replace the element with its cube, print the
array.
Example:
arr1:
11 6 8 9 5 8 7 8 6
Input 1:
Enter key: 8
Output
Array will be like :
11 6 512 9 5 512 7 512 6
Input 2:
Enter key: 12
Output : Element Not Found.  */

import java.io.*;
class Array53 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter key:");
int key = Integer.parseInt(br.readLine());
int count=0;
for(int i=0; i<arr.length; i++){
if(arr[i]==key){
count++;
} 
}
if(count==0){
System.out.println("Element not found");
}
if(count>2){
for(int i=0; i<arr.length; i++){
if(arr[i]==key){
arr[i]=arr[i]*arr[i]*arr[i];
}
}
}
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}

