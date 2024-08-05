/* 8.WAP to take numbers from a user in a 2D array and print the sum of the secondary
diagonal of an array.
Example:
Enter row = 3
Enter column = 3
13 43 70
125 20 26
17 12 16
Output :
Sum of Secondary Diagonal : 107  */

import java.io.*;
class Array68 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter row:");
int row = Integer.parseInt(br.readLine());
System.out.println("Enter column:");
int column = Integer.parseInt(br.readLine());
int arr[][]=new int[row][column];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
arr[i][j]=Integer.parseInt(br.readLine());
}
}
int sum = 0;
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
if(j==row-i-1){
sum = sum + arr[i][j];
}
}
}
System.out.println("Sum of Secondary Diagonal : "+sum);
}
}
