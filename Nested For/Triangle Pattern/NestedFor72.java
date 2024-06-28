/* 6. Write a program to print the given pattern
rows=3
1
B C
1 2 3
rows=4
1
B C
1 2 3
G H I J   */

import java.io.*;
class NestedFor72 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
char ch = 'A';
for(int i=1; i<=row; i++){
int num = 1;
for(int j=1; j<=i; j++){
if(i%2==1){
System.out.print(num+" ");
num++;
ch++;
} else {
System.out.print(ch++ + " ");
}
}
System.out.println();
}
}
}
