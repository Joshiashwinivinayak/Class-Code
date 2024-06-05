/* A B C D
   B C D
   C D
   D       */
class NestedFor41 {
public static void main(String [] args){
int n=4;
char ch='A';
for(int i=1; i<=n; i++){
char cha=ch;
for(int j=1; j<=1+n-i; j++){
System.out.print(cha +" ");
cha++;
}
ch++;
System.out.println();
}
}
}
