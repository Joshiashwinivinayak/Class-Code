/* 1 2 3 4
   4 5 6
   6 7
   7       */
class NestedFor36 {
public static void main(String [] args){
int n=1;
for(int i=1; i<=4; i++){
for(int j=1; j<=5-i; j++){
System.out.print(n+" ");
n++;
}
n=n-1;
System.out.println();
}
}
}
