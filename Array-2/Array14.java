/* 4.WAP to search a specific element in an array and return its index. Ask the user to
provide the number to search, also take size and elements input from the user.
Example:
Input:
Enter the size
5
Enter elements:
12
144
13
156
8
Enter the number to search in array:
8
Output:
8 found at index 4   */

import java.io.*;
class Array14 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.print("Enter the number to search in array:");
int num = Integer.parseInt(br.readLine());
for(int i=0; i<arr.length; i++){
if(arr[i]==num){
System.out.println(num+" found at index "+i);
}
}
}
}
