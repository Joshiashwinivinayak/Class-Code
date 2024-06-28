/* WAP to print following pattern
Take number of rows from user :
Row = 3
c b a
B A
a
Rows = 4
D C B A
c b a
B A
a  */

import java.io.*;
class NestedFor86 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int ch = row + 64;
int cha = row + 96;
int num = row;
for(int i=1; i<=row; i++){
int chh = ch;
int chaa = cha;
for(int j=1; j<=row+1-i; j++){
if(num%2==0){
System.out.print((char)chh+" ");
chh--;
} else{
System.out.print((char)chaa+" ");
chaa--;
}
}
num--;
ch--;
cha--;
System.out.println();
}
}
}
