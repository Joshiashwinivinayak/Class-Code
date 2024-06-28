/* WAP to print following pattern
Take number of rows from user :
Rows = 4
4 c 2 a
3 b 1
2 a
1
Rows = 5
5 d 3 b 1
4 c 2 a
3 b 1
2 a
1  */

import java.io.*;
class NestedFor83 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = row;
int ch = row + 96;
for(int i=1; i<=row; i++){
int num1 = num;
int cha = ch;
for(int j=1; j<=row+1-i; j++){
if(j%2==1){
System.out.print(num1+" ");
num1--;
cha--;
} else {
System.out.print((char)cha+" ");
cha--;
num1--;
}
}
num--;
ch--;
System.out.println();
}
}
}
