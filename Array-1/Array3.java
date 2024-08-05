/* 3. Write a program to print the even elements in the array. Take input from the user.
Example :
Enter size : 10
Array:
10 11 12 13 14 15 16 17 18 19
Output :
10
12
14
16
18   */

import java.io.*;
class Array3 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Even elements of array:");
for(int i=0; i<arr.length; i++){
if(arr[i]%2==0){
System.out.println(arr[i]+" ");
}
}
}
}
