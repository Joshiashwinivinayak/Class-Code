/* WAP to print following pattern
Take number of rows from user :
Rows = 3
A B C
a b
A
Rows = 4
A B C D
a b c
A B
a   */

import java.io.*;
class NestedFor81 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
for(int i=1; i<=row; i++){
char ch = 'A', cha = 'a';
for(int j=1; j<=row+1-i; j++){
if(i%2==1){
System.out.print(ch++ +" ");
} else {
System.out.print(cha++ +" ");
}
}
System.out.println();
}
}
}
