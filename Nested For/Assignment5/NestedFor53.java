/* write a program to print the following pattern
Row =5;
O
14 13
L  K  J
9  8  7  6
E  D  C  B  A
Row = 4
10
I H
7 6 5
D C B A
USE THIS FOR LOOP STRICTL Y for the outer loop
Int row;
Take row from user
for(int i =1;i<=row;i++){
}    */

import java.io.*;
class NestedFor53 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of rows:");
int row = Integer.parseInt(br.readLine());
int num = 0;
for(int i=1; i<=row; i++){
num = num + i;
}
int ch = num + 64;
int num1 = num;
if(row%2==1){
for(int i=1; i<=row; i++){
for(int j=1; j<=i; j++){
if(i%2==1){
System.out.print((char)ch+" ");
ch--;
num1--;
} else {
System.out.print(num1+" ");
num1--;
ch--;
}
}
System.out.println();
}
} else {
for(int i=1; i<=row; i++){
for(int j=1; j<=i; j++){
if(i%2==1){
System.out.print(num1+" ");
ch--;
num1--;
} else {
System.out.print((char)ch+" ");
num1--;
ch--;
}
}
System.out.println();
}
}
}
}
