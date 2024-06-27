/* Q5.write a program to print the following pattern
Row = 4
0
1 1
2 3 5
8 13 21 34
USE THIS FOR LOOP STRICTL Y for the outer loop
Int row;
Take the number of rows from user
for(int i =1;i<=row;i++){
}   */

import java.io.*;
class NestedFor51 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int third = 0;
int first = 0, second = 1 ;
for(int i=1; i<=row; i++){
for(int j=1; j<=i; j++){
System.out.print(first+" ");
third = first + second;
first = second;
second = third;
}
System.out.println();
}
}
}
