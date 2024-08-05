/* 8.WAP to print the elements in an array which are greater than 5 but less than 9, where
you have to take the size and elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
4
8
6
9
41
Output:
8 is greater than 5 but less than 9
6 is greater than 5 but less than 9   */

import java.io.*;
class Array18 {
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
if(arr[i]>5 && arr[i]<9){
System.out.println(arr[i]+" is greater than 5 but less than 9");
}
}
}
}
