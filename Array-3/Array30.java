/* 10.Write a program to print the product of prime elements in an array.
1 4 5 6 11 9 10
Output:
55 */

import java.io.*;
class Array30 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int product = 1;
for(int i=0; i<arr.length; i++){
int count=0;
for(int j=1; j<=arr[i]; j++){
if(arr[i]%j==0){
count++;
}
}
if(count==2){
product = product * arr[i];
}
}
System.out.print("product of prime elements in an array: "+product);
}
}
