/* D4 C3 B2 A1
   A1 B2 C3 D4
   D4 C3 B2 A1
   A1 B2 C3 D4  */
class NestedFor47 {
public static void main(String [] args){
for(int i=1;i<=4;i++){
int num=4;
char ch='D', cha='A';
for(int j=1; j<=4; j++){
if(i%2==1){
System.out.print(ch+""+num+" ");
ch--;
num--;
}
else{
System.out.print(cha+""+j+" ");
cha++;
}
}
System.out.println();
}
}
}
