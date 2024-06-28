/* 10. Write a program to print the given pattern
rows=3
1
b c
4 5 6
rows=4
1
b c
4 5 6
g h i j  */

import java.io.*;
class NestedFor76 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = 1;
char ch = 'a';
for(int i=1; i<=row; i++){
for(int j=1; j<=i; j++){
if(i%2==1){
System.out.print(num+" ");
num++;
ch++;
} else {
System.out.print(ch+" ");
ch++;
num++;
}
}
System.out.println();
}
}
}
