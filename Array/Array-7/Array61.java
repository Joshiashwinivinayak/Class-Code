/* 1.WAP to take numbers from a user in a 2D array and print the array.
Example:
Enter row = 3
Enter column = 3
12 23 10
45 2 25
87 112 96
Output :
12 23 10
45 2 25
87 112 96  */

import java.io.*;
class Array61 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter row:");
int size1 = Integer.parseInt(br.readLine());
System.out.println("Enter column:");
int size2 = Integer.parseInt(br.readLine());
int arr[][]=new int[size1][size2];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
arr[i][j]=Integer.parseInt(br.readLine());
}
}
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}
