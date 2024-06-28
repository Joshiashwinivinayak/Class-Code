/* 9. Write a program to print the given pattern
rows =3
4
4 a
4 b 6
rows = 4
5
5 a
5 b 7
5 c 7 d   */

import java.io.*;
class NestedFor75 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
char ch = 'a';
for(int i=1; i<=row; i++){
int num = row + 1;
for(int j=1; j<=i; j++){
if(j%2==1){
System.out.print(num+" ");
num++;
} else {
System.out.print(ch++ +" ");
num++;
}
}
System.out.println();
}
}
}
