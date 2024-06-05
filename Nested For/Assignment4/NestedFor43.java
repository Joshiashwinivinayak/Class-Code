/* F
   E 1
   D 2 E
   C 3 D 4
   B 5 C 6 D
   A 7 B 8 C 9  */
class NestedFor43 {
public static void main(String [] args){
char ch='G';
int n=1, row=6;
for(int i=1; i<=row; i++){
ch--;
char cha=ch;
for(int j=1; j<=i; j++){
if(j%2==1){
System.out.print(cha++ +" ");
}
else {
System.out.print(n+" ");
n++;
}
}
System.out.println();
}
}
}
