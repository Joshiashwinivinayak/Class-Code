 /* 4. WAP to check the first duplicate element in an array and return its index.
Example :
Input:
Enter the size of the array:
6
Enter the elements of the array:
1
2
3
3
2
5
Output:
First duplicate element present at index 1 */

import java.io.*;
class Array44 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=0; i<arr.length; i++){
int count=0;
 for(int j=0;j<arr.length;j++){
 if(arr[i]==arr[j]){
 count++;
 }
 }
 if(count>1){
 System.out.println("First duplicate element present at index "+i);
 break;
 }
 }
 }
 }
 
 
 
 
 
 
 
 
 
 
 
