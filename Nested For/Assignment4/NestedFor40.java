/* 1 2 3 4
   2 3 4
   3 4
   4      */
class NestedFor40 {
public static void main(String [] args){
for(int i=1; i<=4; i++){
int n=i;
for(int j=1; j<=5-i; j++){
System.out.print(n+" ");
n=n+1;
}
System.out.println();
}
}
}
