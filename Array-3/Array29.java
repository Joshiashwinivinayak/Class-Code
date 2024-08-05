/* 9.Print the prime numbers in an array.
5 7 9 11 15 19 90
Output:
5 7 11 19  */

import java.io.*;
class Array29 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.print("Prime numbers from array:");
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=1; j<=arr[i]; j++){
if(arr[i]%j==0){
count++;
}
}
if(count==2){
System.out.print(arr[i]+" ");
}
}
}
}
