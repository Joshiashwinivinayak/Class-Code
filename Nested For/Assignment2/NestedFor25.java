/* 1C3   4B2  9A1
   16C3  25B2 36A1
   49C3  64B2 81A1  */
class NestedFor25 {
public static void main(String [] args){
int n=1;
for(int i=1; i<=3; i++){
int num=3;
char ch='C';
for(int j=1; j<=3; j++){
System.out.print(n*n +""+ch+""+num+" ");
num--;
ch--;
n++;
}
System.out.println();
}
}
} 
