/* 2. W AP to print following pattern
Take number of rows from user :
Rows = 4
2  4  6  8
10 12 14
16 18
20
Rows = 5
2  4  6  8  10
12 14 16 18
20 22 24
26 28
30    */

import java.io.*;
class NestedFor78 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = 1;
for(int i=1; i<=row; i++){
for(int j=1; j<=row+1-i; j++){
System.out.print(num*2+" ");
num++;
}
System.out.println();
}
}
}
