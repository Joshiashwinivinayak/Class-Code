/* 10 10 10 10
   11 11 11
   12 12
   13          */
class NestedFor31 {
public static void main(String [] args){
int n=10;
for(int i=1; i<=4; i++){
for(int j=1; j<=5-i; j++){
System.out.print(n+" ");
}
n++;
System.out.println();
}
}
}
