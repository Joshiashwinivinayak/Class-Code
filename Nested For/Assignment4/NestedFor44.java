/* 10
   I  H
   7  6 5
   D  C B A */
class NestedFor44 {
public static void main(String [] args){
int num=10;
char ch='J';
int n=4;
for(int i=1; i<=4; i++){
for(int j=1; j<=i; j++){
if(i%2==0){
System.out.print(ch+" ");
ch--;
num--;
}
else {
System.out.print(num+" ");
ch--;
num--;
}
}
System.out.println();
}
}
}
