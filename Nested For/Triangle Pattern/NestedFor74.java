/* 8. Write a program to print the given pattern
rows=3
1
1 c
1 e 3
rows=4
1
1 c
1 e 3
1 h 3 j    */

import java.io.*;
class NestedFor74 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
char ch = 'a';
for(int i=1; i<=row; i++){
int num = 1;
for(int j=1; j<=i; j++){
if(j%2==1){
System.out.print(num+" ");
num++;
ch++;
} else {
System.out.print(ch+" ");
num++;
ch++;
}
}
System.out.println();
}
}
}
