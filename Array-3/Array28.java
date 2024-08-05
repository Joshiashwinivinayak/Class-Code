/* 8.Print the composite numbers in an array.
4 5 7 9 10
Output:
4 9 10  */

import java.io.*;
class Array28 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.print("Composite numbers from array:");
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=1; j<=arr[i]; j++){
if(arr[i]%j==0){
count++;
}
}
if(count>2){
System.out.print(arr[i]+" ");
}
}
}
}
