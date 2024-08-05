/* 9. WAP to print the minimum element in the array, where you have to take the size and
elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
5
6
9
-9
17
Output:
Minimum number in the array is : -9  */

import java.io.*;
class Array19 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=0; j<arr.length; j++){
if(arr[i]<arr[j]){
count++;
}
}
if(count == arr.length-1)
System.out.println("Minimum number in the array is : "+arr[i]);
}
}
}
