/* 4.Write a program to print the given pattern
rows=3
c
C B
c b a
rows=4
d
D C
d c b
D C B A  */

import java.io.*;
class NestedFor70 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
for(int i=1; i<=row; i++){
int ch = row + 64;
int cha = row + 96;
for(int j=1; j<=i; j++){
if(i%2==1){
System.out.print((char)cha + " ");
ch--;
cha--;
} else {
System.out.print((char)ch + " ");
ch--;
cha--;
}
}
System.out.println();
}
}
}
