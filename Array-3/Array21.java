/* Write a program to add 15 in all elements of the array and print it.
10 20 30 40 50 60
Output:
25 35 45 55 65 75  */

import java.io.*;
class Array21 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Array elements are:");
for(int i=0; i<arr.length; i++){
System.out.println(arr[i]);
}
System.out.println("Array elements after adding 15 are:");
for(int i=0; i<arr.length; i++){
arr[i] = arr[i] + 15;
System.out.println(arr[i]);
}
}
}

