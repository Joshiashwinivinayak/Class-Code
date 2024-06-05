/* 1
   8   27
   64  125  216 */
class NestedFor35 {
public static void main(STring [] args){
int n=1;
for(int i=1; i<=3; i++){
for(int j=1; j<=i; j++){
System.out.print(n*n*n +" ");
n++;
}
System.out.println();
}
}
}
