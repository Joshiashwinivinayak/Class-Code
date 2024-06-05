class While13 {
public static void main(String [] args){
int n=123456;
while(n!=0){
int rem=n%10;
if(rem!=0)
System.out.print(rem);
n=n/10;
}
}
}
