/* A b C d
   E f G h
   I j K l
   M n O p */
class NestedFor24 {
public static void main(String [] args){
char ch='A', cha='a';
int n=1;
for(int i=1; i<=4; i++){
for(int j=1; j<=4; j++){
if(n%2==1){
System.out.print(ch +" ");
ch++;
cha++;
n++;
}
else {
System.out.print(cha +" ");
ch++;
cha++;
n++;
}
}
System.out.println();
}
}
}

