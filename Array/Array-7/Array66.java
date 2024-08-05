/* 6.WAP to take numbers from a user in a 2D array and print the elements which are
divisible by 3 in an array.
Example:
Enter row = 3
Enter column =3
33 43 72
125 24 26
17 12 16
Output : 33, 72, 24, 12  */

import java.io.*;
class Array66 {
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
if(arr[i][j]%3==0){
System.out.print("Elements divided by 3 are : "+arr[i][j]+" ");
}
}
}
}
}
