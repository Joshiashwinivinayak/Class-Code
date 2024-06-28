/* WAP to print following pattern
Take number of rows from user :
Rows = 4
4 3 2 1
C B A
2 1
A
Rows = 5
5 4 3 2 1
D C B A
3 2 1
B A
1   */

import java.io.*;
class NestedFor84 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = row;
int ch =  row + 64;
for(int i=1; i<=row; i++){
int num1 = num;
int cha = ch;
for(int j=1; j<=row+1-i; j++){
if(i%2==1){
System.out.print(num1+" ");
num1--;
} else {
System.out.print((char)cha+" ");
cha--;
}
}
ch--;
num--;
System.out.println();
}
}
}
