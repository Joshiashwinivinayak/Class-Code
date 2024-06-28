/* 5. Write a program to print the given pattern
Row = 3
D
E F
G H I
rows = 4
E
F G
H I J
K L M N   */

import java.io.*;
class NestedFor71 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int ch = row + 65;
for(int i=1; i<=row; i++){
for(int j=1; j<=i; j++){
System.out.print((char)ch++ +" ");
}
System.out.println();
}
}
}
