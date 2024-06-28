/* 1. WAP to print following pattern
Take number of rows from user :
Rows = 4
1 2 3 4
2 3 4
3 4
4
Rows = 5
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5     */

import java.io.*;
class NestedFor77 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
for(int i=1; i<=row; i++){
int num = i;
for(int j=1; j<=row+1-i; j++){
System.out.print(num+" ");
num++;
}
System.out.println();
}
}
}
