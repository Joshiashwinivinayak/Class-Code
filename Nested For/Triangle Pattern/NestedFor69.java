/* 3.Write a program to print the given pattern
rows=3
C
C B
C B A
rows=4
D
D C
D C B
D C B A  */

import java.io.*;
class NestedFor69 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
for(int i=1; i<=row; i++){
int ch = row + 64;
for(int j=1; j<=i; j++){
System.out.print((char)ch-- +" ");
}
System.out.println();
}
}
}
