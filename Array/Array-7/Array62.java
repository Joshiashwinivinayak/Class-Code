/* 2.WAP to take numbers from a user in a 2D array and print the sum of the array.
Example:
Enter row = 3
Enter column = 3
13 43 70
125 80 26
57 12 16
Output : Sum = 442 */

import java.io.*;
class Array62 {
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
int sum=0;
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
sum = sum + arr[i][j];
}
}
System.out.println("sum = "+sum);
}
}
