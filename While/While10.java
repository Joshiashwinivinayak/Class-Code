class While10 {
public static void main(String [] args){
int i=1, num=0, n=1;
while(i<=10){
if(i%2==0)
num=num+i;
if(i%2!=0)
n=n*i;
i++;
}
System.out.println("Sum of all even didits is "+num);
System.out.println("Multiplication of all odd digits is "+n);
}
}
