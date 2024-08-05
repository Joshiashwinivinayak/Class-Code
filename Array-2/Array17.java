/* 7.WAP to print the array , if the user given size of an array is even then print the 
alternate elements in an array, else print the whole array.
Example 1:
Input:
Enter the size
5
Enter elements:
1
2
3
4
5
Output:
Array elements are:
1
2
3
4
5
Example 2:
Input:
Enter the size
4
Enter elements:
1
2
3
4
Output:
Array elements are:
1
3  */

import java.io.*;
class Array17 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
if(size%2==0){
System.out.println("Array elements are:");
for(int i=0; i<arr.length; i=i+2){
System.out.println(arr[i]);
}
} else {
System.out.println("Array elements are:");
for(int i=0; i<arr.length; i++){
System.out.println(arr[i]);
}
}
}
}
