/* WAP to print following pattern
Take number of rows from user :
Rows = 4
20 18 16 14
12 10 8
6 4
2
Rows = 5
30 28 26 24 22
20 18 16 14
12 10 8
6 4
2  */

import java.io.*;
class NestedFor79 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = 0;
for(int i=1; i<=row; i++){
num = num + i;
}

for(int i=1; i<=row; i++){
for(int j=1; j<=row+1-i; j++){
System.out.print(num*2 +" ");
num--;
}
System.out.println();
}
}
}
