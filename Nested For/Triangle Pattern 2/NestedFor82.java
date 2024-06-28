/* WAP to print following pattern
Take number of rows from user :
Rows = 3
1 a 2
1 a
1
Rows = 4
1 a 2 b
1 a 2
1 a
1  */

import java.io.*;
class NestedFor82 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
for(int i=1; i<=row; i++){
int num=1;
char ch ='a';
for(int j=1; j<=row+1-i; j++){
if(j%2==1){
System.out.print(num+" ");
num++;
} else {
System.out.print(ch+" ");
ch++;
}
}
System.out.println();
}
}
}
