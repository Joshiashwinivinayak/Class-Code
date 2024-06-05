/* Take n as input. print whether it is perfect number or not.
input : 4
output : not a perfect number */
class For8 {
public static void main(String [] args){
int n = 4, sum=0;
for(int i=1; i<n; i++){
if(n%i==0){
sum=sum+i;
}
}
if(sum==n){
System.out.println("Perfect number");
}
else {
System.out.println("Not perfect number");
}
}
}
