/* 2. Take an input from the user where the size of the array should be 10 and print the
output of the user given elements of an array.   */

import java.io.*;
class Array2 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int arr[]=new int[10];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.print("Array elements are:");
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}
