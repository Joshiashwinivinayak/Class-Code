/* Take n as input. print whether it is armstrong number or not.
input : 23
output : not a armstrong number */
class For9 {
public static void main(String [] args){
int n = 23, count=0, mult=1, sum=0;
int temp1 = n, temp2 = n;
while(temp1!=0){
count++;
temp1=temp1/10;
}
while(temp2!=0){
int rem = temp2%10;
for(int i=1; i<=count; i++){
mult=mult*rem;
}
sum = sum + mult;
temp2=temp2/10;
}
if(sum==n){
System.out.println("Armstrong number");
}
else {
System.out.println("Not armstrong number");
}
}
}
