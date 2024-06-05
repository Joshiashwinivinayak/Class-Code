class While8 {
public static void main(String [] args){
int count=0, n=123456;
while(n!=0){
int rem = n%10;
if(rem % 2 == 1)
count++;
n=n/10;
}
System.out.println("No. of odd digits is "+count);
}
}
