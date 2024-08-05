/* 5. Write a program where you have to print the elements from the array which are less
than 10.Take input from the user.
Example:
Enter size: 10
11 2 18 9 10 5 16 20 8 10
Output :
2 is less than 10
9 is less than 10
5 is less than 10
8 is less than 10   */

import java.io.*;
class Array5 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.print("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=0; i<arr.length; i++){
if(arr[i]<10){
System.out.println(arr[i]+" is less than 10");
}
}
}
}
