/* 1
   2 3
   3 4 5
   4 5 6 7  */
class NestedFor42 {
public static void main(String [] args){
int n=4;
for(int i=1; i<=n; i++){
int num=i;
for(int j=1; j<=i; j++){
System.out.print(num+" ");
num=num+1;
}
System.out.println();
}
}
}
