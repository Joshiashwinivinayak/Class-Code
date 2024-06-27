/* 5 4 3 2 1
   8 6 4 2
   9 6 3
   8 4
   5         */

import java.io.*;
class NestedFor49 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num = row;
int num1 = num;
for(int i=1; i<=row; i++){
num1= num*i;
for(int j=1; j<=1+row-i; j++){
System.out.print(num1+ " ");
num1=num1-i;
}
System.out.println();
num--;
}
}
}
