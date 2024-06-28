/* WAP to print following pattern
Take number of rows from user :
Rows = 4
19 17 15 13
11 9  7
5  3
1
Rows = 5
29 27 25 23 21
19 17 15 13
11 9  7
5  3
1    */

import java.io.*;
class NestedFor85 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = 0;
for(int i=1; i<=row; i++){
num = num + i;
}
int num1 = num * 2 - 1;
for(int i=1; i<=row; i++){
for(int j=1; j<=row+1-i; j++){
System.out.print(num1+" ");
num1=num1-2;
}
System.out.println();
}
}
}
