/* 10.WAP to take numbers from a user in a 2D array and print the corner elements in an array .
Example:
Enter row = 3
Enter column = 3
13 43 70
125 20 26
17 12 16
Output : 13 70 17 16 */

import java.io.*;
class Array70 {
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
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
if((i==0 || i==arr.length-1)&&(j==0 || j==arr.length-1)){
System.out.print(arr[i][j]+" ");
}
}
}
}
}
