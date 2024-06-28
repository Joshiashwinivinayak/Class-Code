/* WAP to print following pattern
Take number of rows from user :
Rows = 3
F E D
C B
A
Rows = 4
J I H G
F E D
C B
A  */

import java.io.*;
class NestedFor80 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = 0;
for(int i=1; i<=row; i++){
num = num + i;
}
int ch = num + 64;
for(int i=1; i<=row; i++){
for(int j=1; j<=row+1-i; j++){
System.out.print((char)ch +" ");
ch--;
}
System.out.println();
}
}
}
