/* Take n as input. print whether it is prime or not.
input : 5
output : prime */
class For7 {
public static void main(String [] args){
int n=5, count=0;
for(int i=1; i<=n; i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.println("prime");
}
else{
System.out.println("Not prime");
}
}
}
